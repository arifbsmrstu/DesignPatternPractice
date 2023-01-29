package org.example.sigelton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DBSingletonTest {

    @Test
    public void both_object_are_same() {
        DBSingleton instance1 = DBSingleton.getInstance();
        DBSingleton instance2 = DBSingleton.getInstance();

        assertEquals(instance1, instance2);
    }
}