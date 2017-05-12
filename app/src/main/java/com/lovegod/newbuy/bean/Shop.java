package com.lovegod.newbuy.bean;

import java.io.Serializable;

/**
 * Created by 123 on 2017/4/14.
 */

public class Shop implements Serializable{

    /**
     * sid : 2
     * shopname : 小米家电
     * saddress : 郑州市龙湖中工
     * stel : 15537593903
     * slevel : 5
     * longgitude : 52.23
     * latitude : 32.56
     * type : 电器
     * salesvo : 6000
     * subscrib : 经营小米电器
     * logo : https://img20.360buyimg.com/popshop/jfs/t2365/311/2902780631/4872/72b8e3d8/56fe1ec7N0c3302e2.jpg
     * showpic : https://img20.360buyimg.com/popshop/jfs/t2365/311/2902780631/4872/72b8e3d8/56fe1ec7N0c3302e2.jpg
     */

    private int sid;
    private String shopname;
    private String saddress;
    private String stel;
    private int slevel;
    private double longgitude;
    private double latitude;
    private String type;
    private int salesvo;
    private String subscrib;
    private String logo;
    private String showpic;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public String getStel() {
        return stel;
    }

    public void setStel(String stel) {
        this.stel = stel;
    }

    public int getSlevel() {
        return slevel;
    }

    public void setSlevel(int slevel) {
        this.slevel = slevel;
    }

    public double getLonggitude() {
        return longgitude;
    }

    public void setLonggitude(double longgitude) {
        this.longgitude = longgitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSalesvo() {
        return salesvo;
    }

    public void setSalesvo(int salesvo) {
        this.salesvo = salesvo;
    }

    public String getSubscrib() {
        return subscrib;
    }

    public void setSubscrib(String subscrib) {
        this.subscrib = subscrib;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getShowpic() {
        return showpic;
    }

    public void setShowpic(String showpic) {
        this.showpic = showpic;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "sid=" + sid +
                ", shopname='" + shopname + '\'' +
                ", saddress='" + saddress + '\'' +
                ", stel='" + stel + '\'' +
                ", slevel=" + slevel +
                ", longgitude=" + longgitude +
                ", latitude=" + latitude +
                ", type='" + type + '\'' +
                ", salesvo=" + salesvo +
                ", subscrib='" + subscrib + '\'' +
                ", logo='" + logo + '\'' +
                ", showpic='" + showpic + '\'' +
                '}';
    }
}
