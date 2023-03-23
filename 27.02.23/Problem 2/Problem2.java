class Bank{
    public int get_Balance(){
        return 0;
    }
}
class BankA extends Bank{
    int balance = 0;
    BankA(int bal){
        balance += bal;
    }
    public int get_Balance(){
        return balance;
    }
}
class BankB extends Bank{
    int balance = 0;
    BankB(int bal){
        balance += bal;
    }
    public int get_Balance(){
        return balance;
    }
}class BankC extends Bank{
    int balance = 0;
    BankC(int bal){
        balance += bal;
    }
    public int get_Balance(){
        return balance;
    }
}
public class Problem2 {
    public static void main(String[] args) {
        BankA bankA = new BankA(1000);
        BankA bankB = new BankA(1500);
        BankA bankC = new BankA(2000);
        System.out.println(bankA.get_Balance());
        System.out.println(bankB.get_Balance());
        System.out.println(bankC.get_Balance());
    }
}
