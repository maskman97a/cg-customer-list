package vn.codegym.customerlist.model;

import vn.codegym.customerlist.dto.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerModel {
    private List<Customer> customerList;

    public CustomerModel() {
        customerList = new ArrayList<>();
        customerList.add(new Customer("John", "1990-01-01", "123 Street", "john.jpg"));
        customerList.add(new Customer("Alice", "1995-12-31", "456 Avenue", "alice.jpg"));
        customerList.add(new Customer("Bob", "2000-05-15", "789 Road", "bob.jpg"));
        customerList.add(new Customer("Charlie", "1985-07-20", "987 Parkway", "charlie.jpg"));
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
