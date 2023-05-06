class Member{
    String name;
    int age;
    int phoneNumber;
    String Address;
    int salary;
    public void printSalary(){
        System.out.println(salary);
    }
}
class Employee extends Member{
    String specialization;
}

class Manager extends Member{
    String department;
}
public class Problem4 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();

        employee.name = "Employee 1";
        employee.age = 25;
        employee.phoneNumber = 987654321;
        employee.Address = "Chennai";
        employee.salary = 50000;
        employee.specialization = "Web Development";

        manager.name = "Manager 1";
        manager.age = 45;
        manager.phoneNumber = 987654312;
        manager.Address = "Covai";
        manager.salary = 100000;
        manager.department = "Networking";

        System.out.println("Employee");
        System.out.println(employee.name);
        System.out.println(employee.age);
        System.out.println(employee.phoneNumber);
        System.out.println(employee.Address);
        System.out.println(employee.salary);
        System.out.println(employee.specialization);

        System.out.println();

        System.out.println("Manager");
        System.out.println(manager.name);
        System.out.println(manager.age);
        System.out.println(manager.phoneNumber);
        System.out.println(manager.Address);
        System.out.println(manager.salary);
        System.out.println(manager.department);

    }
}
