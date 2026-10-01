import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Travel {

    Scanner sc = new Scanner(System.in);

    static String center(String text,int width){
        int space = width - text.length();

        if(space <=0)
        {
            return text.substring(0, width);
        }

        int left = space / 2;
        int right = space - left;

        return " ".repeat(left) + text + " ".repeat(right);
    }

    static String data(String label, String value) {

        return String.format("%-18s : %-14s", label, value);
    }

    void travel() {

        System.out.println();
        System.out.print("Do you want to travel now = ");
        String tra = sc.nextLine();

        if (tra.equals("yes")) {

            boolean found = false;

            while (!found) {

                System.out.print("Enter the card number = ");
                String number = sc.nextLine();

                for (MetroCard v : metrocarddata.card) {

                    if (v.cardnumber.equals(number)) {

                        found = true;

                        System.out.println("Travel booking started");

                        System.out.print("Enter the From place = ");
                        String fromplace = sc.nextLine();

                        System.out.print("Enter the Destination place = ");
                        String desplace = sc.nextLine();

                        ArrayList<station> route =
                                RouteFinder.findRoute(fromplace, desplace);

                        if (route == null) {
                            break;
                        }

                        String actualFrom =
                                RouteFinder.getStationName(route, fromplace);

                        String actualTo =
                                RouteFinder.getStationName(route, desplace);

                        int fromDistance =
                                RouteFinder.getDistance(route, fromplace);

                        int destinationDistance =
                                RouteFinder.getDistance(route, desplace);

                        int dis = Math.abs(
                                destinationDistance - fromDistance
                        );

                        System.out.println();

                        System.out.println("Journey Distance = " + dis + " km");

                        System.out.print(
                                "How many ticket do you want from "
                                        + actualFrom + " to " + actualTo + " = "
                        );

                        int ticketcounts = sc.nextInt();
                        sc.nextLine();

                        if(ticketcounts > 0) {

                            int fare = 0;
                            int cost;

                            if (dis >= 1 && dis <= 5) {

                                fare = 20;
                                cost = fare * ticketcounts;

                                if(ticketcounts >= 1) {

                                    System.out.println(
                                            "Ticket price = ₹" + cost
                                    );

                                    if (ticketcounts >= 2) {
                                        System.out.println(
                                                "One Ticket price = ₹" + fare
                                        );
                                    }
                                }

                            } else if (dis > 5 && dis <= 10) {

                                fare = 35;
                                cost = fare * ticketcounts;

                                if(ticketcounts >= 1) {

                                    System.out.println(
                                            "Ticket price = ₹" + cost
                                    );

                                    if (ticketcounts >= 2) {
                                        System.out.println(
                                                "One Ticket price = ₹" + fare
                                        );
                                    }
                                }

                            } else if (dis > 10 && dis <= 15) {

                                fare = 45;
                                cost = fare * ticketcounts;

                                if(ticketcounts >= 1) {

                                    System.out.println(
                                            "Ticket price = ₹" + cost
                                    );

                                    if (ticketcounts >= 2) {
                                        System.out.println(
                                                "One Ticket price = ₹" + fare
                                        );
                                    }
                                }

                            } else if (dis > 15 && dis <= 25) {

                                fare = 55;
                                cost = fare * ticketcounts;

                                if(ticketcounts >= 1) {

                                    System.out.println(
                                            "Ticket price = ₹" + cost
                                    );

                                    if (ticketcounts >= 2) {
                                        System.out.println(
                                                "One Ticket price = ₹" + fare
                                        );
                                    }
                                }

                            } else if (dis > 25 && dis <= 50) {

                                fare = 60;
                                cost = fare * ticketcounts;

                                if(ticketcounts >= 1) {

                                    System.out.println(
                                            "Ticket price = ₹" + cost
                                    );

                                    if (ticketcounts >= 2) {
                                        System.out.println(
                                                "One Ticket price = ₹" + fare
                                        );
                                    }
                                }

                            } else {

                                System.out.println("Invalid distance ");
                                break;
                            }

                            if (cost <= v.balance) {

                                System.out.print(
                                        "Confirm the Ticket Booking Payment ,enter yes/not = "
                                );

                                String booking = sc.nextLine();

                                if(booking.equals("yes")) {

                                    System.out.println();
                                    System.out.println(
                                            "Select the Payment Process "
                                    );

                                    System.out.println(
                                            "Choose the Banking Card "
                                    );

                                    System.out.println(
                                            "  1 = AXIS CREDIT CARD "
                                    );

                                    System.out.println(
                                            "  2 = AXIS DEBIT CARD "
                                    );

                                    System.out.println(
                                            "  3 = SBI CREDIT CARD "
                                    );

                                    System.out.println();

                                    System.out.println("Net Banking ");



                                    System.out.println(
                                            "  4 = State Bank of India "
                                    );

                                    System.out.println(
                                            "  5 = HDFC Bank "
                                    );

                                    System.out.println(
                                            "  6 = ICICI Netbanking "
                                    );

                                    System.out.println(
                                            "  7 = Canara Bank "
                                    );

                                    System.out.print(
                                            "Enter the Banking Card = "
                                    );

                                    int cno = sc.nextInt();
                                    sc.nextLine();

                                    boolean paymentSelected = false;

                                    if (cno == 1) {

                                        System.out.println(
                                                "AXIS CREDIT CARD selected "
                                        );

                                        paymentSelected = true;
                                    }

                                    if (cno == 2) {

                                        System.out.println(
                                                "AXIS DEBIT CARD selected "
                                        );

                                        paymentSelected = true;
                                    }

                                    if (cno == 3) {

                                        System.out.println(
                                                "SBI CREDIT CARD selected "
                                        );

                                        paymentSelected = true;
                                    }

                                    if (cno == 4) {

                                        System.out.println(
                                                "State Bank of India "
                                        );

                                        paymentSelected = true;
                                    }

                                    if (cno == 5) {

                                        System.out.println(
                                                "HDFC Bank "
                                        );

                                        paymentSelected = true;
                                    }

                                    if (cno == 6) {

                                        System.out.println(
                                                "ICICI Netbanking "
                                        );

                                        paymentSelected = true;
                                    }

                                    if (cno == 7) {

                                        System.out.println(
                                                "Canara Bank "
                                        );

                                        paymentSelected = true;
                                    }

                                    if (paymentSelected) {

                                        Random random = new Random();

                                        int dummyotp =
                                                1000 + random.nextInt(9000);

                                        boolean otpVerified = false;
                                        boolean resend = true;

                                        int attempts = 0;

                                        System.out.println(
                                                "Move to Payment Section "
                                        );

                                        System.out.println();

                                        System.out.println(
                                                " Notification : From Metro"
                                        );

                                        System.out.println();

                                        System.out.println(
                                                "    Your OTP for confirming the booking booking ticket = "
                                                        + dummyotp
                                        );

                                        System.out.println(
                                                "    Please do not share your OTP with anyone..."
                                        );

                                        while (!otpVerified && resend) {

                                            attempts++;

                                            System.out.println();
                                            System.out.println(
                                                    "OTP Attempt = " + attempts
                                            );

                                            System.out.print(
                                                    "Enter the OTP for Booking Tickets = "
                                            );

                                            int otp = sc.nextInt();
                                            sc.nextLine();

                                            if (otp == dummyotp) {

                                                otpVerified = true;

                                                System.out.println(
                                                        "OTP verified successfully"
                                                );

                                                System.out.println(
                                                        "Total OTP Attempts = "
                                                                + attempts
                                                );

                                                System.out.println(
                                                        "Payment successful"
                                                );

                                            } else {

                                                System.out.println(
                                                        "Invalid OTP"
                                                );

                                                System.out.println(
                                                        "Payment failed"
                                                );

                                                System.out.println(
                                                        "Booking canceled"
                                                );

                                                System.out.print(
                                                        "Do you want to resend the OTP? yes/no = "
                                                );

                                                String resendotp =
                                                        sc.nextLine();

                                                if (resendotp.equals("yes")) {

                                                    dummyotp =
                                                            1000 + random.nextInt(9000);

                                                    System.out.println();

                                                    System.out.println(
                                                            " Notification : From Metro"
                                                    );

                                                    System.out.println();

                                                    System.out.println(
                                                            "     Your new OTP for confirming the booking ticket = "
                                                                    + dummyotp
                                                    );

                                                    System.out.println(
                                                            "     Please do not share your OTP with anyone..."
                                                    );

                                                } else {

                                                    resend = false;

                                                    System.out.println(
                                                            "OTP verification stopped"
                                                    );

                                                    System.out.println(
                                                            "Booking canceled"
                                                    );
                                                }
                                            }
                                        }

                                        if (otpVerified) {

                                            v.balance = v.balance - cost;

                                            transactiondata.trans.add(
                                                    new Transaction(
                                                            v.cardnumber,
                                                            "Travel",
                                                            cost,
                                                            "Success"
                                                    )
                                            );

                                            System.out.println();
                                            System.out.println("Card User Data");
                                            System.out.println();

                                            System.out.println(
                                                    "Card Number = " + v.cardnumber);

                                            System.out.println("Card Holder Name = " + v.passengername);

                                            System.out.println("From " + actualFrom + " To " + actualTo);

                                            System.out.println("No of Tickets = " + ticketcounts);

                                            System.out.println("Ticket Price = " + cost);

                                            System.out.println("Current Card Balance = ₹" + v.balance);

                                            System.out.println();

                                            LocalDateTime nows =
                                                    LocalDateTime.now();

                                            DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yyyy ");

                                            DateTimeFormatter time = DateTimeFormatter.ofPattern("hh:mm:ss:a");

                                            System.out.println("TICKETS");
                                            System.out.println();

                                            for (int i = 1;
                                                 i <= ticketcounts;
                                                 i++) {

                                                int width = 36;

                                                System.out.println(
                                                        "╔════════════════════════════════════╗"
                                                );

                                                System.out.println(
                                                        "║"
                                                                + center(
                                                                "🎫 TICKET " + i,
                                                                width
                                                        )
                                                                + "║"
                                                );

                                                System.out.println(
                                                        "╠════════════════════════════════════╣"
                                                );

                                                System.out.println(
                                                        "║ " + data("Ticket No", String.valueOf(i)) + " ║");

                                                System.out.println("║ " + data("Card No", v.cardnumber) + " ║");

                                                System.out.println(
                                                        "║ " + data("Card Holder Name", v.passengername) + " ║");

                                                System.out.println("║ " + data("Date", nows.format(date)) + " ║");

                                                System.out.println(
                                                        "║ "
                                                                + data(
                                                                "Time",
                                                                nows.format(time)
                                                        )
                                                                + " ║"
                                                );

                                                System.out.println(
                                                        "║ "
                                                                + data(
                                                                "From",
                                                                actualFrom
                                                        )
                                                                + " ║"
                                                );

                                                System.out.println("║ " + data("To", actualTo) + " ║");

                                              //  System.out.println("║ " + "Valid for ony 3 Hours" + " ║");

                                                System.out.println("║ " + data("Distance", dis + " km") + " ║");

                                                System.out.println("║ " + data("Fare", "₹" + fare) + " ║");

                                                System.out.println("╠════════════════════════════════════╣");

                                                System.out.println("║"
                                                                + center("🎫 HAPPY JOURNEY! 🎫", width) + "║");

                                                System.out.println(
                                                        "╚════════════════════════════════════╝"
                                                );
                                            }
                                        }

                                    } else {

                                        System.out.println("Invalid Banking Card");

                                        System.out.println("Booking canceled");
                                    }

                                } else {

                                    System.out.println("Booking canceled");
                                }

                            } else {

                                System.out.println("Insufficient balance");

                                System.out.println("Journey cannot be booked");

                                transactiondata.trans.add(
                                        new Transaction(
                                                v.cardnumber,
                                                "Travel",
                                                cost,
                                                "Failed"
                                        )
                                );
                            }

                            System.out.println();

                            System.out.print(
                                    "Do you want to view Transaction History? yes/no = "
                            );

                            String his = sc.nextLine();

                            if (his.equals("yes")) {

                                System.out.println(
                                        "Transaction History"
                                );

                                System.out.println();

                                transactiondata ts =
                                        new transactiondata();

                                ts.display();

                            } else {

                                System.out.println(
                                        "Transaction history skipped"
                                );
                            }
                        }
                    }
                }

                if (!found) {

                    System.out.println(
                            "Invalid card number"
                    );

                    System.out.println(
                            "Booking canceled "
                    );

                    break;
                }
            }
        }
        else {

            System.out.println(
                    "Booking cancelled"
            );
        }
    }
}