package App;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private Address address;
    private List<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.address = address;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
//
//    public void setEmployees(List<Employee> employees) {
//        this.employees = employees;
//    }
}
