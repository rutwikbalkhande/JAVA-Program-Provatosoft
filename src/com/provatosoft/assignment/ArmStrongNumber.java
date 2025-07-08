package com.provatosoft.assignment;

import static java.lang.Math.pow;

public class ArmStrongNumber {
//11. Write a java program for the Armstrong number .

    int num=153;
    int t1=num;
    //arm no. 1, 153, 370, 371, 407

    void Armstrong() {
        int n = 153;
        int a = n;

        int  dig, sum = 0;

        while (n > 0) {
            dig = n % 10;  // get last digit decimal remainder
            sum = sum + dig * dig * dig;  // cube of digit

            n = n / 10;  // remove last digit
        }
        if (sum == a) {
            System.out.println(a + " is an Armstrong number.");
        } else {
            System.out.println(a + " is not an Armstrong number.");
        }


    }

//...............
    void method2( )
    {
        System.out.println("........method 2.......");
        int len=0;

        while(t1 !=0) {
            len=len+1;
            t1 = t1 / 10 ;
        }
        int t2=num;
        int arm=0;

        while(t2 !=0) {
            int mul=1;
            int rem = t2 % 10;

            for(int i=1; i<= len; i++)
            {
                mul=mul*rem;
            }
            arm = arm + mul;
            t2= t2 / 10 ;

        }
        if(arm==num)
        {
            System.out.println(num + " is Armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }

    public static void main(String[] args) {

        System.out.println("Q.11 Armstrong Number");

        ArmStrongNumber am=new ArmStrongNumber();
        am.Armstrong();
        am.method2();

    }
}
