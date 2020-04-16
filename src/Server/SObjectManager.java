package Server;

import java.util.HashMap;
import java.util.Map;

public class SObjectManager {
    private static int mNextHandle =1;
    private static Map<Integer,SObject> mDict= new HashMap<Integer,SObject>();

    // Step 1: Manage SObjects in a dictionary by handle number
    public static int Register(SObject sObject) {
        int handle = mNextHandle++;
        mDict.put(mNextHandle,sObject);
        return handle;
    }

    public static String executeMethodByName(int mHandle, String rankingByPrice, String[] params) {
        SObject sObject = getObjectByHandle(mHandle);
        if(sObject==null){
            return "null";
        }
        return sObject.executeMethodByName(rankingByPrice,params);

    }

    public static int createObjectByClassName(String className) {
        SObject sObject=null;
        switch (className){
            case "SDerived":
            {
                sObject = new SDerived();
                break;
            }
        }
        if(sObject!=null) return sObject.mHandle;
        return -1;
    }

    // Step 2: Get and set attribute
    public static String getAttributeByName(int handle, String attributeName){
        SObject sObject = getObjectByHandle(handle);
        if(sObject!=null)
            return sObject.getAttributeByName(attributeName);
        return "null";
    }
    public static boolean  setAttributeByName(int handle, String attributeName, String value){
        SObject sObject = getObjectByHandle(handle);
        if(sObject!=null)
            return sObject.setAttributeByName(attributeName,value);
        return false;
    }

    private static SObject getObjectByHandle(int handle) {
        if(mDict.containsKey(handle))
            return mDict.get(handle);
        return null;
    }
}
