class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character,Character> map = Map.of(')','(','}','{',']','[');
        for(int i= 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='{' || c == '(' || c == '[')
            {
                stack.push(c);
            }
            else
            {
                if(stack.isEmpty() || stack.pop() != map.get(c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
        
        
    }
    
}