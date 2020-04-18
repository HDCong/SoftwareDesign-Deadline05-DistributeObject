import Client.CDerived;

public class Main {
    public static void main(String []args){
        CDerived obj1= new CDerived();
        obj1.setPrice(10);
        obj1.setProductName("Object 1");
        obj1.MucGiaSanPham();

        System.out.println(obj1.toString());
        System.out.println(obj1.MucGiaSanPham());

        CDerived obj2= new CDerived();
        obj2.setPrice(8);
        obj2.setProductName("Another client derived object");
        obj2.MucGiaSanPham();
        System.out.println(obj2.toString());
        System.out.println(obj2.MucGiaSanPham());

    }
}
