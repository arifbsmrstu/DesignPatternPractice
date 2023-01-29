package org.example.sigelton;

public class DBSingleton {

    private static volatile DBSingleton dbSingleton = null;

    private DBSingleton() {
        if (dbSingleton != null) {
            throw new IllegalArgumentException("Use getInstance() method to create object");
        }
    }

    public static DBSingleton getInstance() {
        if (dbSingleton == null) {
            synchronized (DBSingleton.class) {
                if (dbSingleton == null) {
                    dbSingleton = new DBSingleton();
                }
            }
        }
        return dbSingleton;
    }
}
