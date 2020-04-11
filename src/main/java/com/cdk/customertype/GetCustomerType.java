package com.cdk.customertype;

public class GetCustomerType {

    public CalculateBillAmount getCustomerType(String customerType){
        if (customerType == null){
            return  null;
        }
        if (customerType.equalsIgnoreCase(CustomerType.PREMIUM.toString())){
            return  new PremiumCustomer();
        }
        if (customerType.equalsIgnoreCase(CustomerType.REGULAR.toString())){
            return  new RegularCustomer();
        }

        return  null;
    }
}
