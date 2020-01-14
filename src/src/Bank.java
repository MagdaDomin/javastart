public class Bank {
    public static void main(String[] args) {
        Person person1= new Person();
        person1.firstName="John";
        person1.lastName="Smith";
        person1.id="12345";

        BankAccount account1=new BankAccount();
        account1.owner=person1;
        account1.balance=3000;

        Credit credit1=new Credit();
        credit1.borrower=person1;
        credit1.creditAmount=10000;

        System.out.println(person1.printPerson());
        System.out.println(account1.printBankAccount());
        System.out.println(credit1.creditOwner());
    }
}
