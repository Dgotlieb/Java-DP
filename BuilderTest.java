public class BuilderTest {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount.BankAccountBuilder().setBranch("Ramat-gan").setOwner("john").build();
        System.out.println(ba.getBranch());
        System.out.println(ba.getOwner());
    }
}
