package com.provatosoft.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SquareRoot {

    void squareroot() {
        Integer number = 25;

        double squareRoot = Math.sqrt(number);

        System.out.println(number + " sqare Root :" + squareRoot);
    }

    void sqByStream()
    {
        System.out.println("........use stream API.....");

        List<Integer> number = Arrays.asList(36,89,125,16);

        number.stream().map(Math::sqrt).forEach(result -> System.out.println("square root: "+ result));
    }

    public static void main(String[] args) {

        System.out.println("find square root using math.sqrt OR stream API");

        SquareRoot sq= new SquareRoot();
        sq.squareroot();
        sq.sqByStream();
    }
}
