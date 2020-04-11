package com.cdk.customertype;

import com.cd.discountCal.CalTotalDiscount;

public class PremiumCustomer extends CalculateBillAmount {
    private static int discountSlab =4000;
    private static int [] disCountPer= new int[4];
    @Override
    public Integer getDiscountBillAmount(int totalBill) {
        disCountPer[0]=10;
        disCountPer[1]=15;
        disCountPer[2]=20;
        disCountPer[3]=30;
        int totalDiscount = CalTotalDiscount.calTotalDiscount(totalBill,discountSlab,disCountPer);
        return totalBill - totalDiscount;
    }
}
