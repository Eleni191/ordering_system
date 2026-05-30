package model;

import org.xml.sax.SAXNotRecognizedException;

public class category {
    private int cid;
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setCid(int cid){
        this.cid=cid;
    }
}
