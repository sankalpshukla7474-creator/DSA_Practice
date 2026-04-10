class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>() ;
        for(char ch : s.toCharArray()){
            if(ch == '(') st.push('(') ;
            else if(ch == '{') st.push('(') ;
            else if(ch == '[') st.push('{') ;
            else{
                if(!st.isEmpty() && check(st.peek(),ch)) st.pop() ;
                else st.push(ch) ;
            }
        }
        return st.size() ;
    }
    public boolean check(Character a , Character b){
        if(b == ')' && a == '(') return true ;
        else if(b == '}' && a == '{') return true ;
        else if(b == ']' && a == '[') return true ;
        else return false ;
    }
}