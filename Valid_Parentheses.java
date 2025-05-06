class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> matching = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
        );
        Stack<Character> stack= new Stack<>() ;
        char[] chars = s.toCharArray();

        
        for (int i=0 ; i<chars.length; i++){

            if(chars[i]=='(' || chars[i]=='{' || chars[i]=='['){
                stack.push(chars[i]) ;
            }
            else{
                if(stack.isEmpty() || stack.peek()!=matching.get(chars[i]) ){
                    return false ;
                }
                stack.pop() ;
            }
        }

        if(stack.isEmpty()){
            return true ;
        }
        else{
            return false ;
        }
    }
}

// First step is to create a stack
// I would also create a hashmap where the opening brackets are the keys and the values are the closing
// Create a chars array from the string
// In this stack if there is an openenign bracket I would push this opening bracket
// Then if there is a closing bracket that matches the top of the stack I would pop the top of the stack
// If the stack is empty at the end of this operation we return true otherwise false
