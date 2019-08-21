package com.pojo;


public class Goods {

  private Integer id;
  private String goodsName;
  private Integer billStatus;
  private Integer goodsDistrict;
  private Integer goodsPrice;
  private Integer goodsCount;
  private String creationTime;
  private String file;

  public Goods(String goodsName, Integer billStatus, Integer goodsDistrict, Integer goodsPrice, Integer goodsCount, String creationTime, String file) {
    this.goodsName = goodsName;
    this.billStatus = billStatus;
    this.goodsDistrict = goodsDistrict;
    this.goodsPrice = goodsPrice;
    this.goodsCount = goodsCount;
    this.creationTime = creationTime;
    this.file = file;
  }

  public Goods() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getGoodsName() {
    return goodsName;
  }

  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }

  public Integer getBillStatus() {
    return billStatus;
  }

  public void setBillStatus(Integer billStatus) {
    this.billStatus = billStatus;
  }

  public Integer getGoodsDistrict() {
    return goodsDistrict;
  }

  public void setGoodsDistrict(Integer goodsDistrict) {
    this.goodsDistrict = goodsDistrict;
  }

  public Integer getGoodsPrice() {
    return goodsPrice;
  }

  public void setGoodsPrice(Integer goodsPrice) {
    this.goodsPrice = goodsPrice;
  }

  public Integer getGoodsCount() {
    return goodsCount;
  }

  public void setGoodsCount(Integer goodsCount) {
    this.goodsCount = goodsCount;
  }

  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  @Override
  public String toString() {
    return "Goods{" +
            "id=" + id +
            ", goodsName='" + goodsName + '\'' +
            ", billStatus=" + billStatus +
            ", goodsDistrict=" + goodsDistrict +
            ", goodsPrice=" + goodsPrice +
            ", goodsCount=" + goodsCount +
            ", creationTime='" + creationTime + '\'' +
            ", file='" + file + '\'' +
            '}';
  }
}
