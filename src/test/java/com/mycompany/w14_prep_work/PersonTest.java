/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.w14_prep_work;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author MoaathAlrajab
 */
public class PersonTest {
    Person p;
    public PersonTest() {
        this.p = new Person();
    }

    @org.junit.jupiter.api.Test
    public void testSetPersonName() {
        assertEquals("Too short name", p.setPersonName("MA"));
    } 

    @org.junit.jupiter.api.Test
    public void testCheckPerson() {
                assertEquals("Valid age", p.checkPerson(5));

    }
    
}
