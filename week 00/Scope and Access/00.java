public class CheckingAccount{
  private String name;
  private int balance;

  public CheckingAccount(String inputName, int inputBalance){
    name = inputName;
    balance = inputBalance;
  }

  private void addFunds(int fundsToAdd){
    balance += fundsToAdd;
  }

  private void getInfo(){
    System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
  }

  public static void main(String[] args){
    CheckingAccount myAccount = new CheckingAccount("Marouane",9000000);
    System.out.println(myAccount.balance);
  }

}
