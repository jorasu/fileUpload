package com.controller;

import com.pojo.Goods;
import com.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class GoodsController {
    @Resource
    private GoodsService goodsService;

    @RequestMapping("/search.do")
    public String login(HttpServletRequest request){
        List<Map<String,Object>> goods=goodsService.search();
        request.getSession().setAttribute("goods",goods);
        return "/query.jsp";
    };

    @RequestMapping("/register.do")
    public String register(Goods goods, @RequestParam("fileInfo")MultipartFile fileInfo, HttpServletRequest request){
        String imgName=fileInfo.getOriginalFilename();
        String suffix=imgName.substring(imgName.lastIndexOf("."));
        String name= UUID.randomUUID().toString().replace("-","");
        //获取当前项目的路径
        String filePath=request.getSession().getServletContext().getRealPath("/load");
        File file1=new File(filePath);
        if(!file1.exists()){
            file1.mkdir();
        }
        String newName=filePath+"//"+name+suffix;
        File file2=new File(newName);
        try {
            if(file2.createNewFile()){
                fileInfo.transferTo(file2);
                String newPath=request.getContextPath()+"/load/"+name+suffix;
                goods.setFile("/load/"+name+suffix);
                System.out.println("文件上传成功！");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件上传失败！");
        }

        //调用注册方法，保存到数据库
        boolean bool=goodsService.register(goods);
        if(bool){
            return "redirect:/search.do";
        }else {
            return "redirect:/register.jsp";
        }
    }

}
