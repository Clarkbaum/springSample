import com.pluralsight.com.pluralsight.service.CustomerService;
import com.pluralsight.com.pluralsight.service.CustomerServiceImpl;
import com.pluralsight.model.Customer;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImpl();
        List<Customer> customerList = service.findAll();
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
