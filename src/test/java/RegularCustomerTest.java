import com.cdk.customertype.CalculateBillAmount;
import com.cdk.customertype.CustomerType;
import com.cdk.customertype.GetCustomerType;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RegularCustomerTest {

    private GetCustomerType getCustomerTypef;
    private CalculateBillAmount calBill;
    @Before
    public void setUp() throws Exception {
        getCustomerTypef = new GetCustomerType();
        calBill = getCustomerTypef.getCustomerType(CustomerType.REGULAR.toString());
    }

    @After
    public void tearDown() throws Exception {
        getCustomerTypef = null;
        calBill = null;
    }
    @Test
    public void getDiscountBillAmount() {
        Assert.assertEquals(calBill.getDiscountBillAmount(5000),(Integer) 5000);
        Assert.assertEquals(calBill.getDiscountBillAmount(10000),(Integer) 9500);
        Assert.assertEquals(calBill.getDiscountBillAmount(15000),(Integer) 13500);
    }
}