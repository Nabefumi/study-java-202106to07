package ca.bcit.winter2021.comp2522.midterm.question10;

public class DatabaseManager {
    protected static DatabaseManager INSTANCE;
    protected boolean isInUse;
    protected DatabaseManager() {
        isInUse = true;
    }
    public DatabaseManager getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new DatabaseManager();
        }
        return INSTANCE;
    }
    public boolean getInUse(){
        return this.isInUse;
    }
    public void setInUse(boolean inUse) {
        isInUse = inUse;
    }
}
