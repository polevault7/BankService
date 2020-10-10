public class Main {
    public static void main(String[] args) {
        BankService service = new BankService();
        int totalCashback = service.cashBack(3, 30_000);
        System.out.println(totalCashback);
        int increasedDeposit = service.deposit(7, 100_000);
        System.out.println(increasedDeposit);
    }
}
