class Solution {
    public static void main(String [] args){
        int x = 121;
        Solution s1 = new Solution();
        boolean result = s1.isPalindrome(x);

        System.out.println(result);
    }
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        int reverse = 0;
        int copied = x;//to compare with reverse later

        while(x>0){ //modu
        //last dig of rev +last dig of x by %10
            reverse = (reverse * 10) + (x % 10);
            x /= 10;//x = x/10
        }
        return reverse == copied;
    }
}