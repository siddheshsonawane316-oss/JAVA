package JAVA.Arrays.Basics;

import java.util.HashMap;

public class FruitsIntoBasket {
    static void main() {

        int fruits[] = {1, 2, 3, 2, 2};

        // Left and right pointers of the sliding window.
        int l = 0;
        int r = 0;

        // Stores the maximum number of fruits collected.
        int ans = 0;

        // Stores: Fruit Type -> Frequency in the current window.
        HashMap<Integer, Integer> h1 = new HashMap<>();

        // Expand the window.
        for (; r < fruits.length; r++) {

            // Add the current fruit to the window.
            h1.put(fruits[r], h1.getOrDefault(fruits[r], 0) + 1);

            // If there are more than 2 fruit types,
            // shrink the window until it becomes valid.
            while (h1.size() > 2) {

                // Remove one occurrence of the leftmost fruit.
                h1.put(fruits[l], h1.get(fruits[l]) - 1);

                // Remove the fruit type completely
                // if its frequency becomes 0.
                if (h1.get(fruits[l]) == 0) {
                    h1.remove(fruits[l]);
                }

                // Shrink the window.
                l++;
            }

            // Update the maximum valid window size.
            ans = Math.max(ans, r - l + 1);
        }

        System.out.println(ans);
    }
}