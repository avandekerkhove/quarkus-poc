package quarkus.poc.customer;

import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerService {

    private static final List<Customer> mockList;
    
    static {
        mockList = Arrays.asList(
                new Customer("Alex", "vdk"),
                new Customer("John", "Doe"));
    }
    
    public List<Customer> getAll() {
        return mockList;
    }
    
}
