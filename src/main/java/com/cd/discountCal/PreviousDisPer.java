package com.cd.discountCal;

public class PreviousDisPer {
    // add all the previous discount basically recursive logic here
    public static int getPreviousDiscount(int count,int discountSlab,int [] disCountPer ){
        int previousdis=0;
        while (count>=0){
            previousdis= previousdis+(discountSlab*disCountPer[count])/100;
            count --;
        }
        return previousdis;
    }
}
