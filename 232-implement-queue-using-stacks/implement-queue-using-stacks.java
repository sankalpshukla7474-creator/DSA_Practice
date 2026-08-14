class MyQueue {
    Stack<Integer> st ;
    public MyQueue() {
        st = new Stack<>() ;
    }
    
    public void push(int x) {
        st.push(x) ;
    }
    
    public int pop() {
        Stack<Integer> pt = new Stack<>() ;
        while(!st.isEmpty()){
            pt.push(st.pop()) ;
        }
        int ans = pt.pop() ;
        while(!pt.isEmpty()){
            st.push(pt.pop()) ;
        }
        return ans ;
    }
    
    public int peek() {
        Stack<Integer> pt = new Stack<>() ;
        while(!st.isEmpty()){
            pt.push(st.pop()) ;
        }
        int ans = pt.peek() ;
        while(!pt.isEmpty()){
            st.push(pt.pop()) ;
        }
        return ans ;
    }
    
    public boolean empty() {
        return st.isEmpty() ;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */