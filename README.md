# Software Design - Deadline 05 - Distributed Object

## Check list

1. Create abstract object SObject (define in SObject.java) that has it's handle number is provided by an object SObjectManager (define in SObjectManager). SObjectManager manage SObject in a Map 

2. Create object derived (define in SDerived.java) the SObject and implement get, set method, functions excute by name.

3. Similar to the client side, create abstract CObject (define in CObject.java) is managed by CObjectManager. But in CObjectManager, just call methods defined in SObjectManager.

4. Create object derived in client side, extend CObject. This object with attributes is mapped from SDerived

