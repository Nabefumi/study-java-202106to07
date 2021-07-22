package ca.bcit.winter2021.comp2522.midterm.question10;

import java.util.ArrayList;

public class ObjectPool extends DatabaseManager{
    private  ArrayList<DatabaseManager> objects;
    private final int SIZE;
    public ObjectPool(int size) {
        super();
        this.SIZE = size;
        objects= new ArrayList<>();
    }
    @Override
    public DatabaseManager getInstance(){
        INSTANCE = new DatabaseManager();
        return updateObjectPool(INSTANCE);
    }
    public DatabaseManager updateObjectPool(DatabaseManager dm){
        //  when the pool is empty
        if(objects.size()==0){
            addObject(dm);
            return dm;
        }
        // when ObjectPool is full
        if(objects.size()==SIZE){
            // when ObjectPool has objects not in use
            for(DatabaseManager object: objects){
                if(!object.getInUse()){
                    object.setInUse(true);
                    return object;
                }
            }
            // when all objects in use
            return null;
            // when ObjectPool is not full and has objects not in use
        }else{
            for(DatabaseManager object: objects){
                if(!object.getInUse()){
                    object.setInUse(true);
                    return object;
                }
            }
        }
        // when ObjectPool is not full but all objects in use
        addObject(dm);
        return dm;
    }
    private void addObject(DatabaseManager dm){
        objects.add(dm);
        dm.setInUse(true);
    }
}
