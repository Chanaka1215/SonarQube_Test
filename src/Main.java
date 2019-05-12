import employee.Employees;

import java.util.List;

public class Main {

    public static void main(String[] args) {
         Person p = new Person();
         p.printIt();
         List<Employees> em = new Employees().getEmployees();

    }
}
