import java.util.Scanner;

class Order {
    String drinkName;
    double basePrice;

    Order(String d, double p) {
        drinkName = d;
        basePrice = p;
    }

    void printBill() {
        Scanner input = new Scanner(System.in);

        System.out.print("Are you a café member (Y/N)? ");
        String answer = input.nextLine();

        double discount = 0.0;

        if (answer.equals("Y") || answer.equals("y")) {
            discount = 0.10;
        }

        double finalPrice = basePrice - (basePrice * discount);

        System.out.println("Drink: " + drinkName);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Discount: " + (discount * 100) + " %");
        System.out.println("Final Price: $" + finalPrice);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Coffee Menu ===");
        System.out.println("1. Espresso ($3.50)");
        System.out.println("2. Latte ($4.50)");
        System.out.println("3. Cappuccino ($5.00)");

        System.out.print("Enter your choice (1-3): ");
        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
                Order o1 = new Order("Espresso", 3.50);
                o1.printBill();
                break;
            case 2:
                Order o2 = new Order("Latte", 4.50);
                o2.printBill();
                break;
            case 3:
                Order o3 = new Order("Cappuccino", 5.00);
                o3.printBill();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}