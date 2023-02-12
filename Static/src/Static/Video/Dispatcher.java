package Static.Video;

public class Dispatcher {
    public static void main(String[] args) {
//        Account account1 = new Account();
//        Account account2 = new Account();
//        account1.owner = "Lucy";
//        account1.money = 800;
//        Account.courseUSD_UAH = 28.5;
//
//
//        account2.owner = "Max";
//        account2.money = 120;
//        Account.courseUSD_UAH = 28.4;
//        System.out.println(Account.courseUSD_UAH);

        ///////////////////////////////////
        Bentley b1 = new Bentley();
        b1.color = "white";
        Bentley.count = 1;
        Bentley b2 = new Bentley();
        b2.color = "red";
        Bentley.count = 2;
        System.out.println(b1.count);
    }
}
