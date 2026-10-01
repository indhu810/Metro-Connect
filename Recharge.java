import java.util.Scanner;

class Recharge {

    Scanner sc= new Scanner(System.in);

    void recharge() {
        //
        System.out.println("""

                               🚇  METRO CONNECT  🚇

                               SMART • SIMPLE • SAFE

                                   INDIA • METRO

                               ─────────────────────

                             WELCOME TO METRO CONNECT

                            Your journey starts here. 🚉

                          💳 Recharge  •  🎫 Book Ticket
                          🚉 Routes    •  💰 Balance
                          📋 History   •  🔐 Secure Payment OTP

                               ─────────────────────

                             TRAVEL SMART • TRAVEL EASY

                                    🇮🇳 INDIA 🇮🇳


                              Starting Metro Connect...

                               ████████████████████ 100%

                                  👋 Welcome!
""");



        System.out.println();
        System.out.println("Welcome to the Merto App ");
        System.out.println();
        System.out.print("Enter the card number = ");
        String number = sc.nextLine();

        boolean found = false;

        for (MetroCard v : metrocarddata.card) {
            if (v.cardnumber.equals(number)) {

                found = true;
                System.out.println("Card Holder Name = " + v.passengername);
                System.out.println("current balance = ₹"+v.balance);
                System.out.println();

                System.out.print("Want to do recharge for the card  = ");
                String check = sc.nextLine();
                if(check.equals("yes")) {

                    String again ="yes";

                    while(again.equals("yes"))
                    {
                    int amount = 0;

                    while (amount <= 0) {
                        System.out.print("Enter the recharge amount = ₹");
                        amount = sc.nextInt();
                        sc.nextLine();

                        if (amount <= 0) {
                            System.out.println("Invalid recharge amount");
                        }
                    }

                    v.balance = v.balance + amount;
                    transactiondata.trans.add(
                            new Transaction(v.cardnumber, "Recharge", amount, "Success"));

                    System.out.println("Recharge successful!");
                    System.out.println();
                    //Do you want to recharge again? yes/no .........

                    System.out.print("Do you want to recharge again? enter yes/no = ");
                    again = sc.nextLine();

                }

                    System.out.print("Do you want to check the current balance, enter yes/no = ");
                    String seebalance = sc.nextLine();


                    if (seebalance.equals("yes")) {
                        System.out.println();
                        System.out.println("Card Number = " + v.cardnumber);
                        System.out.println("Card Holder Name = " + v.passengername);
                        System.out.println("New Balance = ₹" + v.balance);

                    } else {
                        System.out.println("Balance check skipped");
                    }
                }

            else {
                       System.out.println("Recharge cancelled");
                   }


            }
        }


        if (!found) {
            System.out.println("Invalid card number");
        }

    }}