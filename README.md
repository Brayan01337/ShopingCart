

# Shopping Cart 🛒

A simple **Java** mini-project for practicing user input, arithmetic operations, and console formatting.

## Features
- Input item name, price, and quantity  
- Calculate total cost  
- Confirm order before checkout  
- Colorful thank-you message with ASCII art  
- Runs in IntelliJ or terminal  

## How to Run
1. Clone or download the repo  
2. Open in IntelliJ IDEA  
3. Run `Main.java`  
4. Follow prompts to enter items and quantities  
5. See your total and thank-you message  

## Sample Inputs & Outputs

### Example 1  
```
Item: apple  
Price: 0.50  
Quantity: 4  
```

**Output:**  
```
Perfect! You want to buy 4 apple(s) for £0.5 each. Is that correct? (yes/no): yes

## Your total will be: £2.00

## Thank you so much for your purchase!

Made by CodingNORVIN

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@%..*@@@@@@+.#@@@@#=:....:=%@@@@#..:::::-*@@+.=@@@@@@@@=.#@@-.%@@@:.+@@@@@@#.=@@@@@@@@@@@@
@@@@@@@@@@%   =@@@@@+ *@@@- :*%%%%+. =@@@* -@@%%#- -@@. *@@@@@@* :@@@. #@@@   -@@@@@# -@@@@@@@@@@@@
@@@@@@@@@@% -= -@@@@+ *@@: +@@@+#@@@- -@@* -@@@@@@  %@# .@@@@@@. %@@@. #@@@ :+ :%@@@# =@@@@@@@@@@@@
@@@@@@@@@@% -@+ .%@@+ *@* :@@%* :#@@@. %@* -@@@@%- -@@@= -@@@@- *@@@@. #@@@ :@* .#@@# =@@@@@@@@@@@@
@@@@@@@@@@% -@@#  *@+ *@+ -@*=   .=#@: #@*  ::...-*@@@@@: *@@* -@@@@@. #@@@ :@@#. *@# =@@@@@@@@@@@@
@@@@@@@@@@% -@@@%. *+ *@# .@@@%.=@@@%  %@* -%%* .%@@@@@@% .@@..%@@@@@. #@@@ :@@@%: =# =@@@@@@@@@@@@
@@@@@@@@@@% -@@@@@- . *@@= :%@@#@@@#. *@@* -@@@#  #@@@@@@+ -- *@@@@@@. #@@@ :@@@@@= . =@@@@@@@@@@@@
@@@@@@@@@@% -@@@@@@=  *@@@*. -+**+: :#@@@* -@@@@#. *@@@@@@:  -@@@@@@@. #@@@ .@@@@@@+  -@@@@@@@@@@@@
@@@@@@@@@@%=*@@@@@@@*=#@@@@@#=----+#@@@@@%=*@@@@@%==@@@@@@%==@@@@@@@@+=%@@@=+@@@@@@@#=*@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

```

### Example 2  
```
Item: banana  
Price: 0.30  
Quantity: 5  
```

**Output (if user says "no"):**  
```
Perfect! You want to buy 5 banana(s) for £0.3 each. Is that correct? (yes/no): no

Okay, let's try again!
```

## Visual Features
- Currency: £ (GBP)  
- Confirmation: Accepts `yes`/`y` (case-insensitive)  
- Colors: ANSI escape codes for styled console output  
- ASCII Art: Included in thank-you message  

## License  
MIT © [CodingNORVIN](https://github.com/CodingNORVIN)

