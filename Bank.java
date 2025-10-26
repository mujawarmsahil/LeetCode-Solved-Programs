class Bank {
    private long[] balance; // Stores the balance of each account

    // Constructor: initializes the bank with given balances
    public Bank(long[] balance) {
        this.balance = balance;        
    }
    
    // Transfers money from account1 to account2
    public boolean transfer(int account1, int account2, long money) {
        // Check if both accounts exist and account1 has enough balance
        if (account1 < 1 || account1 > balance.length ||
            account2 < 1 || account2 > balance.length ||
            balance[account1 - 1] < money)
            return false;
        
        // Perform transfer
        balance[account1 - 1] -= money;
        balance[account2 - 1] += money;
        return true;
    }
    
    // Deposits money into an account
    public boolean deposit(int account, long money) {
        // Check if account exists
        if (account < 1 || account > balance.length)
            return false;
        
        // Add money
        balance[account - 1] += money;
        return true;         
    }
    
    // Withdraws money from an account
    public boolean withdraw(int account, long money) {
        // Check if account exists and has sufficient funds
        if (account < 1 || account > balance.length || money > balance[account - 1])
            return false;
        
        // Deduct money
        balance[account - 1] -= money;
        return true;
    }
}
