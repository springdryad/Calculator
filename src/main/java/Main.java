import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose menu item: ");
            System.out.println("1. Sum ");
            System.out.println("2. Sub");
            System.out.println("3. Mult");
            System.out.println("4. Div");
            System.out.println("0. Exit");

            Scanner myObj = new Scanner(System.in);  // Create a object that can read user input
            String menuItem = myObj.nextLine();  // Read user input

            if ((Integer.valueOf(menuItem)) >= 0 && (Integer.valueOf(menuItem)) <= 4)
            {
                System.out.println("Menu item is: " + menuItem);  // Output user input
            }else {
                System.out.println("Sorry, there is not such menu item, please try again.");
            }


            if (menuItem.contains("0") || menuItem.contains("exit")) {
                break;
            }

            switch (menuItem) {
                    case "1":
                        //call sum() function
                        System.out.println("Enter first number: ");
                        int firstNumber = myObj.nextInt();
                        System.out.println("Enter second number: ");
                        int secondNumber = myObj.nextInt();
                        System.out.println("Result of sum: " + firstNumber + " + " + secondNumber + " = " + sum(firstNumber, secondNumber));
                            break;
                    case "2":
                        //call sub() function
                        System.out.println("Enter first number: ");
                        firstNumber = myObj.nextInt();
                        System.out.println("Enter second number: ");
                        secondNumber = myObj.nextInt();
                        System.out.println("Result of sub: " + firstNumber + " - " + secondNumber + " = " + sub(firstNumber, secondNumber));
                            break;
                    case "3":
                        //call mult() function
                         System.out.println("Enter first number: ");
                         firstNumber = myObj.nextInt();
                         System.out.println("Enter second number: ");
                         secondNumber = myObj.nextInt();
                         System.out.println("Result of mult: " + firstNumber + " * " + secondNumber + " = " + mult(firstNumber, secondNumber));
                            break;
                    case "4":
                        //call div() function
                        System.out.println("Enter first number: ");
                        firstNumber = myObj.nextInt();
                        System.out.println("Enter second number: ");
                        secondNumber = myObj.nextInt();
                        System.out.println("Result of div: " + firstNumber + " / " + secondNumber + " = " + div(firstNumber, secondNumber));
                            break;
            }
        }
    }
    // сложение
    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    // вычитание
    public static int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    // умножение
    public static int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    // деление
    public static float div(float firstNumber, float secondNumber) {
        return firstNumber / secondNumber;
    }
}