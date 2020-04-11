package com.cd.discountCal;

public class CalTotalDiscount {

    public static int calTotalDiscount (int totalBill,int discountSlab,int [] disCountPer){
        int billingAmount =0;
        int totalDiscount =0;
        if (totalBill >=discountSlab) {
            int count =totalBill/discountSlab -1;
            if(totalBill% discountSlab !=0){
                count = count+1;
            }
            if(count >=disCountPer.length){
                count=disCountPer.length-1;
            }
            // get the amount how much discount should be calculated
            billingAmount = totalBill -discountSlab*count;
            totalDiscount = billingAmount*disCountPer[count]/100;
            totalDiscount = totalDiscount+ PreviousDisPer.getPreviousDiscount(count-1,discountSlab,disCountPer);

        }
        return totalDiscount;
    }
}
