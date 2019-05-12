package employee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Employees implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Employees> employee = new ArrayList<>();  // List<Employee> will get squid:S1948

    public List<Employees> getEmployees() {
        return employee;
    }
}
