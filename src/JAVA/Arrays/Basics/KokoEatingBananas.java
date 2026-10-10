package JAVA.Arrays.Basics;

public class KokoEatingBananas {
    static void main() {
        int[] piles = {3, 6, 7, 11};
        int hours = 8;
        int minans = Integer.MAX_VALUE;

        int l = 1;                  // Minimum possible eating speed
        int h = Integer.MIN_VALUE;  // Maximum possible eating speed

        // Find the largest pile to set the upper bound
        for (int i = 0; i < piles.length; i++) {
            if (h < piles[i]) {
                h = piles[i];
            }
        }

        // Binary search for the minimum valid eating speed
        while (l <= h) {
            int k = l + (h - l) / 2;  // Current eating speed
            long hoursreq = 0;         // Hours required at speed k

            // Calculate the total hours needed for all piles
            for (int i = 0; i < piles.length; i++) {
                hoursreq += piles[i] / k;

                // If bananas remain, Koko needs one extra hour
                if (piles[i] % k != 0) {
                    hoursreq++;
                }
            }

            // If Koko can finish within the given hours,
            // this speed is valid; try a smaller speed
            if (hoursreq <= hours) {
                minans = Math.min(minans, k);
                h = k - 1;
            } else {
                // Not enough time at this speed; try a faster speed
                l = k + 1;
            }
        }

        // Print the minimum eating speed
        System.out.println(minans);
    }
}