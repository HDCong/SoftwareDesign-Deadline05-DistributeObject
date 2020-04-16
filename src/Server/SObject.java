package Server;

public abstract class SObject {
    protected int mHandle;

    public int getmHandle() {
        return mHandle;
    }

    public void setmHandle(int mHandle) {
        this.mHandle = mHandle;
    }
    public SObject(){
        mHandle = SObjectManager.Register(this);
    }

    public abstract String getAttributeByName(String attributeName);

    public abstract boolean setAttributeByName(String attributeName,String value);

    public abstract String executeMethodByName(String rankingByPrice, String[] params);
}
