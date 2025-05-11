public class Item implements Nameable{
    String name;
    double price;

    public Item(String n, double p){
        name = n;
        price = p;
    }
    public String getName(){
        //todo:add code here
        return this.name;
    }
    public void setName(String n){
        name = n;
    }
    public double getPrice(){
        //todo:add code here
        return this.price;
    }
    public void setPrice(double p){
        price = p;
    }
}
