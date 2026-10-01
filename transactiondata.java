import java.util.ArrayList;

 class transactiondata {

static ArrayList<Transaction> trans = new ArrayList<>();


void display() {
    if (trans.isEmpty()) {
        System.out.println("No transactions available");
    }
    else {
        for (Transaction i : trans) {
            System.out.println(i);
        }
    }
}
}
