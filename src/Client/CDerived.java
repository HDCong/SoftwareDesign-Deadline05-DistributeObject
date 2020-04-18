package Client;

public class CDerived extends CObject {
    public CDerived(){
        super.createDerivedObjectByName("SDerived");
    }
    private String ProductName;
    private int Price;

    public String getProductName() {
        return  super.getAttributeByName("DeriviedName");
    }

    public boolean setProductName(String productName) {
        if(super.setAttributeByName("DeriviedName",productName)){
            ProductName=productName;
            return true;
        }
        return false;    }

    public int getPrice() {
        return Integer.parseInt(super.getAttributeByName("Price"));
    }

    public boolean setPrice(int price) {
        if(super.setAttributeByName("Price",Integer.toString(price))){
            Price=price;
            return true;
        }
        return false;
    }
    public String MucGiaSanPham(){
        return executeMethod("RankingByPrice",new String[]{});
    }

    @Override
    public String toString() {
        return super.toString()+ "CDerived{" +
                 + '\'' +
                ", ProductName='" + ProductName + '\'' +
                ", Price=" + Price +
                '}';
    }
}
