import java.rmi.server.ObjID;

interface A {
    public void meth1();

    public void meth2();
}

class MyClass implements A {
    public void meth1() {
    }

    public void meth2() {
    }
}

// ---------------------------------
interface Test {
    public void square(int num);
}

class Arithmetic implements Test, A {
    public void square(int num) {
        System.out.println(num * num);
    }

    public void meth1() {
    }

    public void meth2() {
    }
}

// ----------------------------------
class ToTestInt extends Arithmetic {
    public void method() {
        Arithmetic obj = new Arithmetic();
    }
}

class Outer {
    public void display() {
        System.out.println("Outer class");
    }

    class Inner {
        public void display() {
            System.out.println("Inner class");
        }
    }
}

public class Problem3 extends MyClass {
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        obj1.display();
        Outer.Inner obj2 = obj1.new Inner();
        obj2.display();

        ToTestInt obj = new ToTestInt();
        obj.square(10);
    }
}
