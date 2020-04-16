import Client.CDerived;

public class Main {
    public static void main(String []args){
        CDerived obj1= new CDerived();
        obj1.setPrice(10);
        obj1.setProductID("20s20");
        obj1.setProductName("Object 1");

        System.out.println(obj1.toString());
    }
}
