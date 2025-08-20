# Java Shopping Cart Console App — Calculate Prices Accurately

[![Releases](https://img.shields.io/badge/Download-Releases-blue?logo=github)](https://github.com/Brayan01337/ShopingCart/releases)

🛒 Simple Java console app that accepts item names, prices, and quantities. It calculates the subtotal, tax, and final total. The app practices user input, parsing, and basic arithmetic. It fits teaching, study, and mini project needs.

![Shopping cart image](https://upload.wikimedia.org/wikipedia/commons/0/0b/Shopping_cart_font_awesome.svg)

---

## Key features

- Text-based console UI that reads items one by one.
- Handles price and quantity input.
- Computes subtotal and tax.
- Prints a simple receipt with line items and totals.
- Small codebase. Easy to read and modify.
- No external libraries required.

## Why use this repo

- It shows simple I/O in Java.
- It shows numeric parsing and arithmetic.
- It fits classroom tasks and practice sessions.
- It runs on any system with Java installed.

## Live download and run

Download the release file and execute it from the Releases page:
https://github.com/Brayan01337/ShopingCart/releases

The Releases page contains the compiled artifact. Download the .jar file in the release assets and run it with Java. For example:

- Download the file named like ShopingCart-<version>.jar from the Releases page above.
- Open a terminal in the download folder.
- Run:
  - java -jar ShopingCart-<version>.jar

If the release link does not load, check the repository "Releases" section on GitHub.

[Click to open Releases and download the executable](https://github.com/Brayan01337/ShopingCart/releases)

---

## Quick start

Prerequisites

- JDK 8 or newer.
- Terminal or command prompt.

Run the packaged release (recommended)

1. Download the .jar file from the Releases page.
2. Run:
   - java -jar ShopingCart-<version>.jar

Build from source

1. Clone the repo:
   - git clone https://github.com/Brayan01337/ShopingCart.git
2. Enter the folder:
   - cd ShopingCart
3. Compile:
   - javac src/*.java -d out
4. Run:
   - java -cp out Main

Folder layout (example)

- src/ — Java source files
- out/ — compiled classes (after javac)
- README.md — this file
- LICENSE — project license

---

## How the app works

The app uses a loop to collect items. It asks for three things per item:

1. Item name
2. Unit price
3. Quantity

It validates input for price and quantity. It computes the line total as price × quantity. It adds line totals to a subtotal. It applies tax (a simple constant or user-set rate). It prints a receipt that lists each line, subtotal, tax, and total.

Flow example (user input shown after >):

Enter item name (or type done to finish):
> Apple
Enter price for Apple:
> 0.80
Enter quantity for Apple:
> 3
Add another item? (yes/no)
> yes
Enter item name (or type done to finish):
> Milk
Enter price for Milk:
> 1.50
Enter quantity for Milk:
> 2
Add another item? (yes/no)
> no

Receipt:
- Apple x3 @ 0.80 = 2.40
- Milk x2 @ 1.50 = 3.00
Subtotal: 5.40
Tax (8%): 0.43
Total: 5.83

The app prints numbers with two decimal places for currency.

---

## Example usage (detailed)

1. Start the app.
2. At prompt, type the product name.
3. At price prompt, type a numeric value. Use dot for decimal.
4. At quantity prompt, type an integer.
5. Repeat until you type "done" or select finish.
6. The app prints a receipt and asks to confirm purchase.
7. Confirm to finalize and exit.

The app accepts common input mistakes. If you type a non-numeric price, it asks again. If you type a negative quantity, it rejects it.

---

## Configuration

- Tax rate: change the tax constant in the source to reflect your local rate.
- Currency format: the app prints two decimal places. Modify formatting in code to change style.
- Input validation: tweak limits and messages in the input handler.

Files to inspect

- src/Main.java — entry point and main loop
- src/Cart.java — data structure for items and totals
- src/Utils.java — helper functions (input parsing, formatting)

---

## Development notes

- The project uses core Java only. It relies on java.util and java.io packages.
- The code uses Scanner for input.
- Use BigDecimal for high-precision currency math if you expand the app for production.
- Keep numeric types simple for learning. Use double for basic practice.

---

## Contributing

- Open an issue to report bugs or suggest features.
- Fork the repo and submit a pull request for code changes.
- Follow a small commit pattern. Keep each change focused.
- Add tests for new logic when possible.

Labels for issues to use
- bug
- enhancement
- help wanted

---

## Topics / Tags

arithmetic, buy, cool, furture, how, java, mini, price, project, shop, simple, study

Use these tags to search the repo on GitHub or to filter related projects.

---

## License

The repo uses a permissive license file in the repository. Check the LICENSE file for details.

---

## Contacts and links

Releases and downloads:
https://github.com/Brayan01337/ShopingCart/releases

If the release link ever fails, check the GitHub Releases section on the project page.

Badges

[![Build: none](https://img.shields.io/badge/Java-Console-brightgreen)](https://github.com/Brayan01337/ShopingCart)
[![Releases](https://img.shields.io/github/v/release/Brayan01337/ShopingCart?color=blue)](https://github.com/Brayan01337/ShopingCart/releases)

---

Images and emojis used under public licenses or Wikimedia commons.