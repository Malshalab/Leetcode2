class Solution {
    public boolean isPalindrome(String s) {
        int x =0 ;
        int y= s.length()-1 ;
        char[] chars = s.toCharArray();
        while(x<y){   
            if(!Character.isLetterOrDigit(chars[x])){
                x+=1 ;
                continue ;
            }
            if(!Character.isLetterOrDigit(chars[y])){
                y-=1 ;
                continue ;
            }
            if(Character.toLowerCase(chars[x])!=Character.toLowerCase(chars[y])){
                return false ;
            }
            x++ ;
            y-- ;
        }
        return true ;
    }

}
