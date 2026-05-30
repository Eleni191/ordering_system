package model;

public class menu_items {
    private int itemid;
    private String name;
    private String description;
    private double price;

    public void setItemid(int itemid){
        this.itemid=itemid;
    }
    public int getItemid(){
        return itemid;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public  void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    menu_items(){

    }
    menu_items(int id, String na, String des, double pr){
        itemid=id;
        name=na;
        description=des;
        price=pr;
    }

}
