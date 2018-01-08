import java.util.Scanner;

public class MainApp {
    public static void main(String args[]){

        int looping = 0;
        while(looping==0){
            System.out.println("Enter the operation number for the operation you want to perform \n" +
                    "1.Perform Calculations\n" +
                    "2.Check Calculation by ID\n" +
                    "3.Check all calculations of a particular operator");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            DbManagement db  = new DbManagement();
            switch (choice){

                case 1:{
                    int loop2= 1;
                    while (loop2 ==1){
                        System.out.println("\nSelect an operation" +
                                "\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Power\n" +
                                "6.Absolute Value\n7.Modulus\n8.Maximum\n9.Minimum");
                        int operator = sc.nextInt();
                        Calculator calc = new Calculator();

                        switch (operator){
                            case 1:{
                                System.out.println("\nEnter number");
                                int first = sc.nextInt();
                                System.out.println("\nEnter number");
                                int second = sc.nextInt();
                                int result = calc.sum(first,second);
                                String op= "+";
                                System.out.println("\nSum: "+result);
                                db.addToDB(first,second,op,result);
                            }
                                break;
                            case 2:{
                                System.out.println("\nEnter Minuend");
                                int first = sc.nextInt();
                                System.out.println("Enter Subtrahend");
                                int second = sc.nextInt();
                                int result = calc.difference(first,second);
                                String op = "-";
                                System.out.println("\nDifference: "+result);
                                db.addToDB(first,second,op,result);
                            }
                                break;
                            case 3: {
                                System.out.println("\nEnter first number");
                                int first = sc.nextInt();
                                System.out.println("Enter second number");
                                int second = sc.nextInt();
                                int result = calc.multiply(first, second);
                                String op = "*";
                                System.out.println("\nProduct: "+result);
                                db.addToDB(first, second, op, result);
                                break;
                            }
                            case 4: {
                                System.out.println("\nEnter Dividend");
                                int first = sc.nextInt();
                                System.out.println("Enter Divisor");
                                int second = sc.nextInt();
                                int result = calc.divide(first, second);
                                String op = "/";
                                System.out.println("\nQuotient: "+result);
                                db.addToDB(first, second, op, result);
                            }
                                break;
                            case 5: {
                                System.out.println("\nEnter Base");
                                int first = sc.nextInt();
                                System.out.println("Enter Power");
                                int second = sc.nextInt();
                                int result = calc.power(first, second);
                                String op = "pow";
                                System.out.println("\nAnswer: "+result);
                                db.addToDB(first, second, op, result);
                            }
                                break;
                            case 6:{
                                System.out.println("\nEnter Number");
                                int first = sc.nextInt();
                                int second = 0;
                                int result = calc.abs(first);
                                String op = "abs";
                                System.out.println("\nAnswer: "+result);
                                db.addToDB(first,second,op,result);
                                break;
                            }
                            case 7: {
                                System.out.println("\nEnter Dividend");
                                int first = sc.nextInt();
                                System.out.println("Enter Divisor");
                                int second = sc.nextInt();
                                int result = calc.modulus(first, second);
                                String op = "%";
                                System.out.println("\nRemainder: "+result);
                                db.addToDB(first, second, op, result);
                            }
                                break;
                            case 8: {
                                System.out.println("\nEnter First number");
                                int first = sc.nextInt();
                                System.out.println("Enter second number");
                                int second = sc.nextInt();
                                int result = calc.max(first, second);
                                String op = "max";
                                System.out.println("\nMaximum: "+result);
                                db.addToDB(first, second, op, result);
                            }
                                break;
                            case 9: {
                                System.out.println("\nEnter First number");
                                int first = sc.nextInt();
                                System.out.println("Enter second number");
                                int second = sc.nextInt();
                                int result = calc.min(first, second);
                                String op = "min";
                                System.out.println("\nMinimum: "+result);
                                db.addToDB(first, second, op, result);
                            }
                                break;
                            default:System.out.println("\nPlease select a valid operation");
                        }
                        System.out.println("\nDo you wish to perform another operation(1) or " +
                                "break out to the main menu(0)?");
                        loop2 = sc.nextInt();
                    }

                }
                    break;
                case 2:{
                    System.out.println("\nEnter ID\n");
                    int id = sc.nextInt();
                    db.checkByID(id);

                }
                    break;
                case 3:{
                    int loop3 = 1;
                    while (loop3==1) {
                        System.out.println("\nChoose operator:" + "\n1.Addition\n2.Subtraction\n" +
                                "3.Multiplication\n4.Division\n5.Power\n" +
                                "6.Absolute Value\n7.Modulus\n8.Maximum\n9.Minimum");
                        String op=null;
                        int opChoice = sc.nextInt();
                        switch (opChoice){
                            case 1:
                                op="+";
                                break;
                            case 2:
                                op="-";
                                break;
                            case 3:op="*";
                                break;
                            case 4:op="/";
                                break;
                            case 5:op="pow";
                                break;
                            case 6:op="abs";
                                break;
                            case 7:op="%";
                                break;
                            case 8:op="max";
                                break;
                            case 9:op="min";
                                break;
                            default:System.out.println("\nEnter a correct option");
                        }
                        db.allCalcs(op);
                        System.out.println("Do you wish to continue(1) or exit to main menu(0)");
                        loop3=sc.nextInt();
                    }

                }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Do you wish to exit(1) or go back to main menu(0)?");
            looping = sc.nextInt();

        }
    }
}
