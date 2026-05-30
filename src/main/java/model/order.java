package model;

public class order {
    private int oid;
    private int cid;
    private int wid;
    private String type;
    private double total;
    private String date;
public void setOid(int oid){
this.oid=oid;}
    public int getoid(){
    return oid;
    }
    public void setCid(int cid){
    this.cid=cid;
 }
 public int getcid(){
    return cid;
 }
 public void setWid(int wid){
    this.wid=wid;
 }
 public int getWid(){
    return wid;
 }
    public void setType(String type){
    this.type=type;
    }
    public String getType() {
    return type;
    }
    public void settotal(double total){
    this.total=total;
    }
    public double getTotal(){
    return total;
    }
    public void setDate(String date){
    this.date=date;
    }
    public String getDate(){
    return
            date;
    }
  public   order(){

    }
    public order(int id, int c,String ty, double to, String da){
    oid=id;
    cid=c;
    type=ty;
    total=to;
    date=da;
    }

}
