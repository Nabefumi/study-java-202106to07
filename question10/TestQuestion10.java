package ca.bcit.winter2021.comp2522.midterm.question10;

import java.util.ArrayList;

public class TestQuestion10 {
    public static void runAllTestScenariosForQuestion10(){
        DatabaseManager dbManager = null;
        //TODO: Create a DatabaseManager's Object Pool with size N = 3
        dbManager = new ObjectPool(3);//TODO: complete it here
        //TODO: Create 3 instances of DatabaseManagers
        DatabaseManager dbManager1 = dbManager.getInstance();
        DatabaseManager dbManager2 = dbManager.getInstance();
        DatabaseManager dbManager3 = dbManager.getInstance();
        //TODO: create another instance of DatabaseManager.
        //Note: Remember at this point the ObjectPool is full and therefore either an existing object should be returned or
        //no object should be returned.
        DatabaseManager dbManager4 = dbManager.getInstance();
        //TODO: set the isInUse property of all objects in object pool to false;
        dbManager1.setInUse(false);
        dbManager2.setInUse(false);
        dbManager3.setInUse(false);
        //TODO: create another instance of DatabaseManager:
        //Note: At this point there should be 3 instances of DatabaseManager in the pool and therefore, the getInstance method
        //should randonmly picked one and return it and set its isInUse to yes.
        DatabaseManager dbManager5 = dbManager.getInstance();
        testNoSpaceFullInUse(dbManager4);
        ArrayList<DatabaseManager> objects = new ArrayList<>();
        objects.add(dbManager1);
        objects.add(dbManager2);
        objects.add(dbManager3);
        testNoSpaceNotFullInUse(dbManager5, objects);
    }
    private static void testNoSpaceFullInUse(DatabaseManager dm){
        if(dm == null){
            System.out.println("testNoSpaceFullInUse: ture");
        }else {
            System.out.println("testNoSpaceFullInUse: false");
        }
    }
    private static void testNoSpaceNotFullInUse(DatabaseManager dm, ArrayList<DatabaseManager> objects){
        boolean flag = false;
        for(DatabaseManager object: objects){
            if(object == dm) {
                flag = true;
            }
        }
        if(flag){
            System.out.println("testNoSpaceNotFullInUse: ture");
        }else{
            System.out.println("testNoSpaceNotFullInUse: false");
        }
    }
}
