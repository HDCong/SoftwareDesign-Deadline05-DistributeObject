package Client;

import Server.SObject;
import Server.SObjectManager;

public class CObjectManager {
    public static int createObject(String className) {
        return SObjectManager.createObjectByClassName(className);
    }

    public static String getAttributeByName(int handle,String attributeName) {
        return SObjectManager.getAttributeByName(handle,attributeName);
    }

    public static boolean setAttributeByName(int handle,String attributeName, String value) {
        return SObjectManager.setAttributeByName(handle,attributeName,value);
    }

    public static String executeMethodByName(int mHandle, String rankingByPrice, String[] params) {
        return SObjectManager.executeMethodByName(mHandle,rankingByPrice,params);
    }
}
