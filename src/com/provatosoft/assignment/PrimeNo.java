package com.provatosoft.assignment;

public class PrimeNo {

    void primeNumber()
    {
        int start =1;
        int end=50;
        System.out.println("prime No.");

        for(int i=start; i<=end;i++)
        {
            int temp=0;
            for(int j=2;j<i;j++)
            {
                if(i % j ==0 )
                {
                    temp++;
                }
            }
            if(temp==0 && i>1)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        PrimeNo p=new PrimeNo();
        p.primeNumber();
    }
}
