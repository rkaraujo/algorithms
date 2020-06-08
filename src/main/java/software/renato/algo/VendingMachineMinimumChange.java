package software.renato.algo;

/*
You have a vending machine, you are given amount and price of item.
Vending machine has coins of the form 1c, 5c, 10c, 25c, 50c, $1.
You have to give minimum no. of coins for change.
 */
public class VendingMachineMinimumChange {

    public int solution(double itemValue, double paidValue) {
        int[] possibleCoins = {1, 5, 10, 25, 50, 100};

        int missingChange = (int) (paidValue * 100 - itemValue * 100);

        int count = 0;
        int idxCurCoin = possibleCoins.length - 1;
        int curCoin = possibleCoins[idxCurCoin];
        while (missingChange != 0) {
            if (missingChange - curCoin >= 0) {
                missingChange = missingChange - curCoin;
                count++;
            } else {
                if (idxCurCoin - 1 < 0) {
                    return -1;
                }
                curCoin = possibleCoins[idxCurCoin - 1];
                idxCurCoin--;
            }
        }
        return count;
    }
}
