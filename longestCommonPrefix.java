class Solution {
    public String longestCommonPrefix(String[] strs) {
        // iterate through the array
        // set up a for loop

        String result= strs[0] ;

        for(int i=1 ; i<strs.length ; i++){
            while(strs[i].indexOf(result)!=0){
                result= result.substring(0, result.length()-1) ;
            }
        }
        return result ;
    }
}
