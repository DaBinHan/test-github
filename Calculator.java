package com.mycompany.test;

public class Calculator{

  public static vod main(String[] args){
    int a = 4;
    int b = 2;
    System.out.println( sum(a,b) );

  }

  private static int sum(int a, int b){
    return a + b;
  }

  private static int minus(int a, int b, Object GPU){
    int result = 0;
    if( GPU == null ){
      result = a - b;

    }
    else{
      result = a - b;
    }

    return result;
  }

  private static int multi(int a, int b){
    return a * b;
  }

  private static int division(int a, int b){
    return a / b; // Change division method at division branch
  }

}
