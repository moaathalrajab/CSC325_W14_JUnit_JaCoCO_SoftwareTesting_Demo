/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.w14_prep_work;

/**
 *
 * @author MoaathAlrajab
 */
public class Person {
    
    
    public Person(){
        
    }
    
    public Person(String name){
        
    }

    public String setPersonName(String s){
        int l= s.length();
        if(l ==0 || s== null){
            return "No name";
        }else if(l>0 && l<=3){
             return "Too short name";
        }else if(l>4){
            return "Acceptable name";
        }
        return "Invalid";
    }
    
    public String checkPerson(int age){
        if(age==0 || age<0){
            return "No valid age entered";
                    
        }else if(age > 0){
            return "Valid age";
        }else{
            return "Nothing";
        }
    }
    
}
