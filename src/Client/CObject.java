package Client;

public abstract class CObject {
    protected int mHandle ;

    public int getmHandle() {
        return mHandle;
    }

    public void setmHandle(int mHandle) {
        this.mHandle = mHandle;
    }

    void createDerivedObjectByName(String className){
        mHandle= CObjectManager.createObject(className);
    }

    public String getAttributeByName(String attributeName){
        return CObjectManager.getAttributeByName(mHandle,attributeName);
    }

    public boolean setAttributeByName(String attributeName,String value){
        return CObjectManager.setAttributeByName(mHandle,attributeName,value);
    }

    protected String executeMethod(String rankingByPrice, String []params){
        return CObjectManager.executeMethodByName(mHandle,rankingByPrice,params);
    }
}
