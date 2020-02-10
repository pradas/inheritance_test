import inheritance.*;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent("Parent_name");
        Child c = new Child("Child_name", "Child_surname");
        System.out.println(p.toString()); // output: Parent_name
        System.out.println(c.toString()); // output: Child_name Child_surname
        
        Parent pc = c;
        System.out.println(pc.toString()); // output: Child_name Child_surname
    }
}
