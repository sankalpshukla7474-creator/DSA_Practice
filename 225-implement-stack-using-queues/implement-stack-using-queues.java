class MyStack {
    Queue<Integer> q1 ;
    Queue<Integer> q2 ;
    public MyStack() {
        q1 = new LinkedList<>() ;
        q2 = new LinkedList<>() ;
    }
    
    public void push(int x) {
        q1.offer(x) ;
    }
    
    public int pop() {
        int size = q1.size() ;
        int b = -1 ;
        for(int i = 1 ; i <= size ; i++){
            int a = q1.poll() ;
            if(i == size){
                b = a ;
                break ;
            } 
            q2.offer(a) ;
        }
        while(!q2.isEmpty()){
            q1.offer(q2.poll()) ;
        }
        return b ;
    }
    
    public int top() {
        int size = q1.size() ;
        int b = -1 ;
        for(int i = 1 ; i <= size ; i++){
            int a = q1.poll() ;
            if(i == size) b = a;
            q2.offer(a) ;
        }
        while(!q2.isEmpty()){
            q1.offer(q2.poll()) ;
        }
        return b ;
    }
    
    public boolean empty() {
        return q1.isEmpty() ;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */