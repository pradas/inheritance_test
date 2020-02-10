package inheritance;

public class Child extends Parent {
    // Instance Variables 
    String surname;  

    // Constructor Declaration of Class 
    public Child(String name, String surname) 
    { 
        super(name);
        
        this.surname = surname; 
    } 
    
    // method 1 
    public String getSurname() 
    { 
        return surname; 
    }

    @Override
    public String toString() 
    { 
        return(this.getName() + " " + this.getSurname()); 
    } 
}