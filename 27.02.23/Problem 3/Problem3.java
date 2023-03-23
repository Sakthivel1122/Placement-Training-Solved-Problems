class Employee {
    String name[] = new String[10];
    int year[] = new int[10];
    int salary[] = new int[10];
    String address[] = new String[10];
    int emp = 0;

    public void put_details(String n, int y, int s, String a) {
        name[emp] = n;
        year[emp] = y;
        salary[emp] = s;
        address[emp] = a;
        emp++;
    }

    public void all_details() {
        for (int i = 0; i < emp; i++) {
            System.out.println(name[i] + "   " + year[i] + "   " + salary[i] + "   " + address[i]);
        }
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.put_details("Robert", 1994, 100000, "64C- Walls Streat");
        obj.put_details("Sam", 2000, 200000, "68D- Walls Streat");
        obj.put_details("John", 1999, 300000, "28B- Walls Streat");
        obj.all_details();
    }
}
