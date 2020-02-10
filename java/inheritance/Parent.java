package inheritance;

public class Parent {
    // Instance Variables 
    String name;  

    // Constructor Declaration of Class 
    public Parent() 
    { 
        this.name = ""; 
    }

    public Parent(String name) 
    { 
        this.name = name; 
    } 
    
    // method 1 
    public String getName() 
    { 
        return name; 
    }

    @Override
    public String toString() 
    { 
        return(this.getName()); 
    } 
}