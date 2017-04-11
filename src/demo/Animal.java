/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author My
 */
public class Animal {
    private String name;
    private int age;
    private String address;;
    private char gender;
    
    public Animal(String name,int age,String address,char gender){
        this.name=name;
        this.age=age;
        this.address=address;
        this.gender=gender;
        getFullInfo();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
   public void getFullInfo(){
       System.out.println("Animal name is "+name);
       System.out.println("Animal age is "+age);
       System.out.println("Animal address is "+address);
       System.out.println("Animal gender is "+gender);}}



   

    
  

