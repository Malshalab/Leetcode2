class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>() ;
        Map<String, List<String>> map = new HashMap<>() ;

        for (String str : strs){
            char chars[]=str.toCharArray();
            Arrays.sort(chars) ;
            String sortedString = new String(chars) ;
            if (map.containsKey(sortedString)==false){
                map.put(sortedString, new ArrayList<> ());
            }
            map.get(sortedString).add(str) ;
        }
        result.addAll(map.values());
        return result ;
    }
}

// Create a hashmap
// iterate through each string in the array of strings
// convert each string into individual character arrays
// then sort the characters in the array and combine them again to be a sorted string
// then check if the hashmap contains this combination of strings already if not then add it to the hashmap but as an arraylist
