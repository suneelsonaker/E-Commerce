package com.cdk.customertype;

import com.cd.discountCal.CalTotalDiscount;

public class RegularCustomer extends CalculateBillAmount {
    private static int discountSlab =5000;
    private static int [] disCountPer= new int[3];
    @Override
    public Integer getDiscountBillAmount( int totalBill) {
        disCountPer[0] = 0;
        disCountPer[1] = 10;
        disCountPer[2] = 20;
        int totalDiscount = CalTotalDiscount.calTotalDiscount(totalBill,discountSlab,disCountPer);
        return totalBill - totalDiscount;
    }
}
