 java.util.ArrayList;
imimportport java.util.List;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] digitCounts = new int[10];
        for (int digit : digits) {
            digitCounts[digit]++;
        }
        
        List<Integer> resultList = new ArrayList<>();
        
        for (int i = 100; i <= 998; i += 2) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int ones = i % 10;
            
            int[] neededCounts = new int[10];
            neededCounts[hundreds]++;
            neededCounts[tens]++;
            neededCounts[ones]++;
            
            if (digitCounts[hundreds] >= neededCounts[hundreds] &&
                digitCounts[tens] >= neededCounts[tens] &&
                digitCounts[ones] >= neededCounts[ones]) {
                
                resultList.add(i);
            }
        }
        
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}
