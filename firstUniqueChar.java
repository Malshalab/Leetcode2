class Solution {
    public int firstUniqChar(String s) {
        char[] chars=s.toCharArray() ;
        HashMap<Character, Integer> freq= new HashMap<>() ;
        int result ;
        for (int i =0 ; i<chars.length; i++){
            
                System.out.println(chars[i]) ;
                freq.put(chars[i], freq.getOrDefault(chars[i],0)+1) ;
            
            
        }

        for(int i =0 ; i<chars.length; i++){
            if(freq.get(chars[i])==1){
                result= freq.get(chars[i]) ;
                return i ;
            }
            else{
                continue ;
            }
        }
        return -1 ;
    }
}

// set up a hashmap
// the map will store the character as the key and index of this character as the value
//return the first value in hashmap that is==1
