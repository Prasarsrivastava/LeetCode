class Solution {
    public boolean isPalindrome(int x) {
        int n,r=0,d;
        n=x;
        while(x>0)
        {
            d=x%10;
            r=r*10+d;
            x=x/10;
        }
        if(r==n)
        {
            return true;
        
        }
        else{
            return false;
        }
   }

}
