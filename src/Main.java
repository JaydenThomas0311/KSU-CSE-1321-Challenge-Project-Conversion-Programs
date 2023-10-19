// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int choice = 0;
        double input = 0;
        Scanner scan = new Scanner (System.in);
        /*
        TEST CASE 1
        32 degrees Celsius to Fahrenheit
        Expected: 89.6
        Tested: 89.6

        TEST CASE 2
        7 Pounds to Kilograms
        Expected: 3.17
        Tested: 3.17

        TEST CASE 3
        8 USD to EUR
        Expected: 7.56
        Tested: 7.56

        INVALID SWITCH CHOICE TEST CASE:
        Input: 5
        Expected: "Invalid option, please try again or exit the application"
        Tested: "Invalid option, please try again or exit the application"
        */
        do{
            System.out.println("Which conversion would you like to perform?\n" +
                    "1) Temperature: Celsius to Fahrenheit / Fahrenheit to Celsius\n" +
                    "2) Weight: lb to kg / kg to lb\n" +
                    "3) Currency: USD to EUR / EUR to USD\n" +
                    "4) Quit\n");
            System.out.println("Your choice: ");
            choice = scan.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Which temperature scale would you like to convert from?\n" +
                            "1) Celsius --> Fahrenheit\n" +
                            "2) Fahrenheit --> Celsius\n"
                    );
                    System.out.println("Your choice: ");
                    choice = scan.nextInt();
                    tempConversion conversionT = new tempConversion();
                    switch(choice){
                        case 1:
                            System.out.println("What is the degrees in celsius?");
                            input = scan.nextDouble();
                            System.out.println("The temperature " + input + " degrees Celsius is equal to " + String.format("%.1f", conversionT.celsiusToFahrenheit(input)) + " degrees Fahrenheit\n");
                            break;
                        case 2:
                            System.out.println("What is the degrees in Fahrenheit?");
                            input = scan.nextDouble();
                            System.out.println("The temperature " + input + " degrees Fahrenheit is equal to " + String.format("%.1f", conversionT.fahrenheitToCelsius(input)) + " degrees Celsius\n");
                            break;
                        default: System.out.println("Invalid option, please try again or exit the application\n");
                    }
                    break;
                case 2:
                    System.out.println("Which weight scale would you like to convert from?\n" +
                            "1) Pounds (lb) --> Kilograms (kg)\n" +
                            "2) Kilograms (kg) --> Pounds (lb)\n"
                    );
                    System.out.println("Your choice: ");
                    choice = scan.nextInt();
                    weightConversion conversionW = new weightConversion();
                    switch(choice){
                        case 1:
                            System.out.println("What is the weight in pounds (lb)?");
                            input = scan.nextDouble();
                            System.out.println("The weight " + input + " pounds (lb) is equal to " + String.format("%.2f", conversionW.poundsToKilograms(input)) + " kilograms (kg)\n");
                            break;
                        case 2:
                            System.out.println("What is the weight in kilograms (kg)?");
                            input = scan.nextDouble();
                            System.out.println("The weight " + input + " kilograms (kg) is equal to " + String.format("%.2f", conversionW.kilogramsToPounds(input)) + " pounds (lb)\n");
                            break;
                        default: System.out.println("Invalid option, please try again or exit the application\n");
                    }
                    break;
                case 3:
                    System.out.println("Which currency would you like to convert from?\n" +
                            "1) USD --> EUR\n" +
                            "2) EUR --> USD\n"
                    );
                    System.out.println("Your choice: ");
                    choice = scan.nextInt();
                    currencyConversion conversionC = new currencyConversion();
                    switch(choice){
                        case 1:
                            System.out.println("What is the amount in U.S. Dollars (USD)?");
                            input = scan.nextDouble();
                            System.out.println(input + " Dollars is equal to " + String.format("%.2f", conversionC.dollarsToEuros(input)) + " Euros\n");
                            break;
                        case 2:
                            System.out.println("What is the amount in Euros (EUR)?");
                            input = scan.nextDouble();
                            System.out.println(input + " Euros is equal to " + String.format("%.2f", conversionC.eurosToDollars(input)) + " Dollars\n");
                            break;
                        default: System.out.println("Invalid option, please try again or exit the application\n");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using my conversion program!");
                    break;
                default:
                    System.out.println("Invalid option, please try again or exit the application\n");
            }
        }while(choice != 4);
    }
}