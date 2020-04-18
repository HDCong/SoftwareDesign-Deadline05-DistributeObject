package Server;

public class SDerived extends SObject {
    protected String mDeriviedName;
    protected int mPrice;

    @Override
    public String getAttributeByName(String attributeName) {
        switch (attributeName){
            case "DeriviedName":
                return mDeriviedName;
            case "Price":
                return Integer.toString(mPrice);
        }
        return "null";
    }

    @Override
    public boolean setAttributeByName(String attributeName,String value) {
        switch (attributeName){
            case "DeriviedName":
                mDeriviedName= value;
                return true;
            case "Price":
                return setPrice(Integer.parseInt(value));
        }
        return false;
    }

    private boolean setPrice(int value) {
        if(value>=0){
            mPrice =value;
            return true;
        }
        return false;
    }
    public String executeMethodByName(String methodName, String []params){
        switch (methodName){
            case "RankingByPrice":
                return rankingByPrice(params);
        }
        return "null";
    }

    private String rankingByPrice(String[] params) {
//        System.out.println(mPrice);
        if(mPrice>=10) return "Expensive";
        else if (mPrice >=8 && mPrice <10) return "Normal";
        else return "Cheap";
    }
}
