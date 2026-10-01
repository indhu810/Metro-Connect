public class Transaction {
    String cardNumber;
    String type;
    int amount;
    String status;


    Transaction(String TcardNumber, String Ttype, int Tamount, String Tstatus) {
        cardNumber = TcardNumber;
        type=Ttype;
        amount=Tamount;
        status=Tstatus;
    }
   public String toString(){
      return  "cardNumber = "+ cardNumber + " , " + " Type = "  +type +" , " + " Amount = ₹" + amount + " , " + " Status = " + status;
   }
}
