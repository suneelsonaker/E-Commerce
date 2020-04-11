
import com.cdk.customertype.CalculateBillAmount;
import com.cdk.customertype.CustomerType;
import com.cdk.customertype.GetCustomerType;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class PremiumCustomerTest {
    private GetCustomerType getCustomerTypef;
    private CalculateBillAmount calBill;
    @Before
    public void setUp() throws Exception {
         getCustomerTypef = new GetCustomerType();
         calBill = getCustomerTypef.getCustomerType(CustomerType.PREMIUM.toString());
    }

    @After
    public void tearDown() throws Exception {
        getCustomerTypef = null;
        calBill = null;
    }

    @Test
    public void getDiscountBillAmount() {
        Assert.assertEquals(calBill.getDiscountBillAmount(4000),(Integer) 3600);
        Assert.assertEquals(calBill.getDiscountBillAmount(8000),(Integer) 7000);
        Assert.assertEquals(calBill.getDiscountBillAmount(12000),(Integer) 10200);
        Assert.assertEquals(calBill.getDiscountBillAmount(20000),(Integer) 15800);

    }
}