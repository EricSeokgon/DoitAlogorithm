package chapter2;

public class CardConvRev {
    static int cardConvR(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLNMOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
        } while (x != 0);
        return digits;
    }
}
