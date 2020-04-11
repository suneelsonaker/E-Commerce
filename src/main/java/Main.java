import com.cdk.customertype.CalculateBillAmount;
import com.cdk.customertype.GetCustomerType;

public class Main {

    public static void main(String[] args) {
       GetCustomerType getCustomerTypef = new GetCustomerType();
       CalculateBillAmount calBill = getCustomerTypef.getCustomerType("regular");
       System.out.println("total billing price is ---" + calBill.getDiscountBillAmount(5000));


    }
}
