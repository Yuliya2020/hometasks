package JavaClassesMainTask;

import JavaClassesMainTask.Customer;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerActionOptional {
    public Customer findByID(List<Customer> customers, int id) {
        Customer customer = null;
        List<Customer> result = customers.stream().filter(o -> id == o.getCustomerId()).collect(Collectors.toList());
    if(result.size() !=0 ) {
        customer = result.get(0);
    }
    return customer;
    }
}
