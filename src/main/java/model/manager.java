package model;

public class manager {
    private int mid;
    private String fname;
    private String lname;
    private String username;
    private String password;
    public void setMid(int mid){
        this.mid=mid;
    }
    public int getMid(){
        return mid;
    }
    public void setFname(String fname){
        this.fname=fname;
    }
    public String getfname(){
        return fname;
    }
    public void setLname(String lname){
        this.lname=lname;
    }
    public String getLname(){
        return lname;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
   public manager(){

    }
   public manager(int a, String b, String c, String d ,String e) {
        mid=a;
        fname=b;
        lname=c;
        username=d;
        password=e;
   }
}

