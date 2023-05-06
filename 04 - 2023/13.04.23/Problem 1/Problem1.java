abstract class abs_class {
    abs_class(){
        System.out.println("This is constructor of abstract class");
    }
    abstract void a_method();

    public void non_abs_method(){
        System.out.println("This is a normal method of abstract class");
    }
}

class SubClass extends abs_class{
    public void a_method(){
        System.out.println("This is abstract method");
    }
}
public class Problem1 {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.a_method();
        obj.non_abs_method();
    }
}
