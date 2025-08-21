import com.example.pahanabillingsystem.dao.CustomerDAO;
import com.example.pahanabillingsystem.model.Customer;
import com.example.pahanabillingsystem.service.impl.CustomerServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.*;


import java.util.Arrays;
import java.util.List;

class CustomerServiceImplTest {

    @Mock
    private CustomerDAO customerDAOMock;

    private CustomerServiceImpl customerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        customerService = new CustomerServiceImpl();
        customerService.setCustomerDAO(customerDAOMock); // Inject the mock DAO
    }

    @Test
    void testAddCustomer() {
        // Arrange
        Customer customer = new Customer();
        customer.setAccountNumber("ACC001");
        customer.setName("John Doe");
        customer.setAddress("123 Street");
        customer.setTelephone("0771234567");
        customer.setUnitConsumed(100);

        // Act
        customerService.addCustomer(customer);

        // Assert
        verify(customerDAOMock, times(1)).addCustomer(any(Customer.class));
    }

    @Test
    void testUpdateCustomer() {
        // Arrange
        Customer customer = new Customer();
        customer.setId(1);
        customer.setAccountNumber("ACC001");
        customer.setName("John Doe");
        customer.setAddress("123 Street");
        customer.setTelephone("0771234567");
        customer.setUnitConsumed(150);

        // Act
        customerService.updateCustomer(customer);

        // Assert
        verify(customerDAOMock, times(1)).updateCustomer(any(Customer.class));
    }

    @Test
    void testDeleteCustomer() {
        // Arrange
        int customerId = 1;

        // Act
        customerService.deleteCustomer(customerId);

        // Assert
        verify(customerDAOMock, times(1)).deleteCustomer(customerId);
    }

    @Test
    void testGetCustomerById_Found() {
        // Arrange
        Customer customer = new Customer();
        customer.setId(1);
        customer.setAccountNumber("ACC001");
        customer.setName("John Doe");
        when(customerDAOMock.getCustomerById(1)).thenReturn(customer);

        // Act
        Customer result = customerService.getCustomerById(1);

        // Assert
        assertNotNull(result);
        assertEquals(1, result.getId());
        assertEquals("John Doe", result.getName());
    }

    @Test
    void testGetCustomerById_NotFound() {
        // Arrange
        when(customerDAOMock.getCustomerById(99)).thenReturn(null);

        // Act
        Customer result = customerService.getCustomerById(99);

        // Assert
        assertNull(result);
    }

    @Test
    void testGetAllCustomers() {
        // Arrange
        List<Customer> customers = Arrays.asList(
                new Customer(1, "ACC001", "John Doe", "123 Street", "0771234567", 100),
                new Customer(2, "ACC002", "Jane Smith", "456 Avenue", "0777654321", 200)
        );
        when(customerDAOMock.getAllCustomers()).thenReturn(customers);

        // Act
        List<Customer> result = customerService.getAllCustomers();

        // Assert
        assertEquals(2, result.size());
        assertEquals("John Doe", result.get(0).getName());
        assertEquals("Jane Smith", result.get(1).getName());
    }
}
