class LemonadeChange {
    public  boolean lemonadeChange(int[] bills) {
        int fiveCount = 0, tenCount = 0; // Track counts of $5 and $10 bills

        for (int bill : bills) {
            if (bill == 5) {
                fiveCount++; // Accept the $5 bill
            } else if (bill == 10) {
                if (fiveCount > 0) {
                    fiveCount--; // Give one $5 as change
                    tenCount++; // Accept the $10 bill
                } else {
                    return false; // Cannot provide change
                }
            } else if (bill == 20) {
                // Try to give $10 and $5 as change
                if (tenCount > 0 && fiveCount > 0) {
                    tenCount--; // Give one $10
                    fiveCount--; // Give one $5
                } else if (fiveCount >= 3) {
                    fiveCount -= 3; // Give three $5 bills as change
                } else {
                    return false; // Cannot provide change
                }
            }
        }
        return true; // Successfully handled all transactions
    }
}
