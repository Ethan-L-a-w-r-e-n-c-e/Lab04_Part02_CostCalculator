import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CostCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double TAX = 0.05;
        double itemPrice;
        double totalPrice;

        System.out.println("What is the price of your item");
        itemPrice = scan.nextDouble();

        totalPrice = itemPrice + itemPrice*TAX;
        System.out.println("The total price of your item with the tax included is $" + totalPrice + ".");

    }
}