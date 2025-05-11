class Solution {
    public boolean detectCapitalUse(String word) {
       return conditionOne(word) || conditionTwo(word) || conditionThree(word) ;

    }

    public boolean conditionOne(String word){
        for(char c: word.toCharArray()){
            if(!Character.isUpperCase(c)){
                return false ;
            }
        }
        return true ;
    }

    public boolean conditionTwo(String word){
        for(char c: word.toCharArray()){
            if(Character.isUpperCase(c)){
                return false ;
            }
        }
        return true ;
    }

    public boolean conditionThree(String word){
        char[] chars= word.toCharArray() ;
        if(!Character.isUpperCase(chars[0]))
        {
            return false ;
        }

        for(int i=1; i<word.length(); i++){
            if(Character.isUpperCase(chars[i])){
                return false ;
            }
        }

        return true ;
    }
}
