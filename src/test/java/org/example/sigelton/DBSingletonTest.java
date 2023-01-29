package org.example.sigelton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DBSingletonTest {

    @Test
    public void Both_Object_Are_Same() {
        DBSingleton instance1 = DBSingleton.getInstance();
        DBSingleton instance2 = DBSingleton.getInstance();

        assertEquals(instance1, instance2);
    }
}