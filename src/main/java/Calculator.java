
public class Calculator {

  static int sum(int first, int second) {
    return first + second;
  }

  static int difference(int minuend, int subtrahend) {
    return minuend - subtrahend;
  }

  static int multiply(int first, int second) {
    return first * second;
  }

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
    if (num >= 0) {
      return num;
    } else {
      return num * -1;
    }

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

  static int min(int first, int second) {
    return first > second ? second : first;
  }

}

