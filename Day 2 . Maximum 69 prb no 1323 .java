class Solution {
    public int maximum69Number (int num) {
        int temp = num;
        int index6 = -1;
        int currentPlace = 0;
        
        // Traverse digits from right to left
        while (temp > 0) {
            if (temp % 10 == 6) {
                index6 = currentPlace; 
            }
            temp /= 10;
            currentPlace++;
        }
        if (index6 != -1) {
            num += 3 * Math.pow(10, index6);
        }
        
        return num;
    }
}
