public class BankAccount {
    private String owner;
    private String branch;

    private BankAccount(String owner, String branch) {
        this.owner = owner;
        this.branch = branch;
    }

    public String getOwner() {
        return owner;
    }

    public String getBranch() {
        return branch;
    }

    public static class BankAccountBuilder {
        private String owner;
        private String branch;

        public BankAccount.BankAccountBuilder setOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public BankAccount.BankAccountBuilder setBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(owner, branch);
        }
    }
}
