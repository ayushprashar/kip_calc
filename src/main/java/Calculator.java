//import java.math.BigDecimal;

import java.util.Scanner;

public class Calculator {

  static int sum(int first, int second) {
    return first + second;
  }

//    static double sum(double first,double second){
//        return first + second;
//    }

  static int difference(int minuend, int subtrahend) {
    return minuend - subtrahend;
  }

//    double difference(double minuend,double subtrahend){
//        return minuend-subtrahend;
//    }

  static int multiply(int first, int second) {
    return first * second;
  }
//    double multiply(double first , double second) {
//        BigDecimal f = new BigDecimal(first);
//        BigDecimal s = new BigDecimal(second);
//        BigDecimal result = f.multiply(s);
//        return result.doubleValue();
//    }

  static int divide(int dividend, int divisor) {
    try {
      return dividend / divisor;
    } catch (ArithmeticException e) {
      System.out.println("\n Cannot divide by zero \n" + e); //Don't save in the DB
      return 0;
    }
  }

  static int power(int base, int power) {
    double quotient = Math.pow(base, power);
    return (int) quotient;
  }

  static int abs(int num) {
    if (num >= 0)
      return num;
    else
      return num * -1;
  }

  static int modulus(int dividend, int divisor) {
    try {
      return dividend % divisor;
    } catch (ArithmeticException e) {
      System.out.println("\nCannot divide by zero\n" + e); //Don't save in the DB
      return -1;
    }
  }

  static int max(int first, int second) {
    return first > second ? first : second;
  }
//    double max(double first,double second){
//        return first>second?first:second;
//    }

  static int min(int first, int second) {
    return first > second ? second : first;
  }

   /* public static void main(String args[])
    {
        Calculator test = new Calculator();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(min(a,b));

    }*/
}

