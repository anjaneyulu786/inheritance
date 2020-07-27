class MethodOverloding {
    MethodOverloding() {
     System.out.println("Constructor of Parent");
    }
    void disp() {
     System.out.println("Parent Method");
    }
 }
 class JavaExample extends MethodOverloding {
    JavaExample() {
     System.out.println("Constructor of Child");
    }
    void disp() {
     System.out.println("Child Method");
     super.disp();
    }
    public static void main(String args[]) {
     JavaExample obj = new JavaExample();
     obj.disp();
    }
 }
