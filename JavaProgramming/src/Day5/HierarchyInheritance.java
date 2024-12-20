package Day5;


public class HierarchyInheritance {
    public static void main(String[] args) {
        // Example for class C
        C class_c = new C();
        class_c.setBatch_no(1);
        class_c.setGroup_name("Java Enthusiasts");
        class_c.setPlayer_name("Sankalp");
        class_c.setRoll_num(123);
        System.out.println("Class C:");
        class_c.show();

        
        // Example for classB
        
        B class_b = new B();
        class_b.setBatch_no(2);
        class_b.setGroup_name("Python Gurus");
        class_b.setPlayer_name("Smurf");
        class_b.setRoll_num(456);
        System.out.println("\nClass B:");
        class_b.show();
    }
}
