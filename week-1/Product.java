public class Product {
    int id;
    String name;
    double price,gst;
    int quantity;
    Product(int id,String name,double price,double gst,int quantity)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        this.gst=gst;
        this.quantity=quantity;
    }
}