package model;

public class user {
    private int uid;
    private String fname;
    private String lname;
    private String phonenum;
    private String city;
    private String subcity;

    public void setMid(int uid) {
        this.uid = uid;
    }
    public int getMid(){
        return uid;
    }
    public void setFname(String fname){
        this.fname=fname;
    }

    public String getFname() {
        return fname;
    }
    public void setLname(String lname){
        this.lname=lname;
    }
    public String getLname(){
        return lname;
    }
    public void setPhonenum(String phonenum){
        this.phonenum=phonenum;
    }
    public String getPhonenum(){
        return phonenum;
    }
    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return city;
    }
    public void setSubcity(String subcity){
        this.subcity=subcity;
    }
    public String getSubcity(){
        return subcity;
    }
    public user(){

    }
    public user(int a, String b, String c, String d,String e, String f){
        uid=a;
        fname=b;
        lname=c;
        phonenum=d;
        city=e;
        subcity=f;

    }

}
