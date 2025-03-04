class CheckPowersOfThree {
    public boolean checkPowersOfThree(int n) {
        // Start recursion with power = 0 and sum = 0
        return checkPower(n, 0, 0);
    }

    public boolean checkPower(int number, int power, double sum) {
        // If the sum matches the target number, return true
        if (number == sum) {
            return true;
        }

        // Pruning conditions:
        // 1. If sum exceeds the number, stop recursion.
        // 2. If the smallest power of 3 left (3^power) is greater than the remaining number, stop recursion.
        if (sum > number || number < Math.pow(3, power)) {
            return false;
        }

        // Calculate the new sum by including 3^power
        double addedSum = sum + Math.pow(3, power);

        // Either we take the current power of 3 or we skip it
        boolean result = checkPower(number, power + 1, sum) 
                         ? true 
                         : checkPower(number, power + 1, addedSum);

        return result;
    }
}
