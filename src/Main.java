/*
       THIS IS FIRST PRACTICE MINI PROJECT
       THIS PROJECT IS CALLED SHOPPING CART
       AND I MADE IT TO PRACTICE USER INPUTS & ARITHMETICS
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '£';
        double total;
        boolean confirmed = false;

        System.out.println("WELCOME TO OUR JAVA SHOP");
        System.out.println("------------------------");

        while (!confirmed) {  // Loop until confirmed
            System.out.print("What item would you like to buy today?: ");
            item = scanner.nextLine();

            System.out.print("What is the price for each? (in " + currency + "): ");
            price = scanner.nextDouble();

            System.out.print("How many " + item + "(s) would you like?: ");
            quantity = scanner.nextInt();
            scanner.nextLine(); // consume newline

            total = price * quantity;  // Calculate total

            System.out.println();
            System.out.print("Perfect! You want to buy " + quantity + " " + item +
                    "(s) for " + currency + price + " each. Is that correct? (yes/no): ");
            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("yes") || answer.equals("y")) {
                confirmed = true;  // Confirm order
                System.out.println();
                System.out.println("Your total will be: " + currency + String.format("%.2f", total));
                System.out.println("---------------------------------");
                System.out.println("Thank you so much for your purchase!");
                System.out.println("---------------------------------");
                System.out.println("\u001B[33mMade by CodingNORVIN\u001B[0m");
                // ASCII art output
                System.out.println("\u001B[33m"
                        + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                        + "@@@@@@@@@@%..*@@@@@@+.#@@@@#=:....:=%@@@@#..:::::-*@@+.=@@@@@@@@=.#@@-.%@@@:.+@@@@@@#.=@@@@@@@@@@@@\n"
                        + "@@@@@@@@@@%   =@@@@@+ *@@@- :*%%%%+. =@@@* -@@%%#- -@@. *@@@@@@* :@@@. #@@@   -@@@@@# -@@@@@@@@@@@@\n"
                        + "@@@@@@@@@@% -= -@@@@+ *@@: +@@@+#@@@- -@@* -@@@@@@  %@# .@@@@@@. %@@@. #@@@ :+ :%@@@# =@@@@@@@@@@@@\n"
                        + "@@@@@@@@@@% -@+ .%@@+ *@* :@@%* :#@@@. %@* -@@@@%- -@@@= -@@@@- *@@@@. #@@@ :@* .#@@# =@@@@@@@@@@@@\n"
                        + "@@@@@@@@@@% -@@#  *@+ *@+ -@*=   .=#@: #@*  ::...-*@@@@@: *@@* -@@@@@. #@@@ :@@#. *@# =@@@@@@@@@@@@\n"
                        + "@@@@@@@@@@% -@@@%. *+ *@# .@@@%.=@@@%  %@* -%%* .%@@@@@@% .@@..%@@@@@. #@@@ :@@@%: =# =@@@@@@@@@@@@\n"
                        + "@@@@@@@@@@% -@@@@@- . *@@= :%@@#@@@#. *@@* -@@@#  #@@@@@@+ -- *@@@@@@. #@@@ :@@@@@= . =@@@@@@@@@@@@\n"
                        + "@@@@@@@@@@% -@@@@@@=  *@@@*. -+**+: :#@@@* -@@@@#. *@@@@@@:  -@@@@@@@. #@@@ .@@@@@@+  -@@@@@@@@@@@@\n"
                        + "@@@@@@@@@@%=*@@@@@@@*=#@@@@@#=----+#@@@@@%=*@@@@@%==@@@@@@%==@@@@@@@@+=%@@@=+@@@@@@@#=*@@@@@@@@@@@@\n"
                        + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                        + "\u001B[0m");

            } else {
                System.out.println();
                System.out.println("Okay, let's try again!");
                System.out.println();
            }
        }

        scanner.close();
    }
}


