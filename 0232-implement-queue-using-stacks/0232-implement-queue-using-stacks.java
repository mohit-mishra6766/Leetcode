class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> t = new Stack<>();
    public MyQueue() {
        
        
    }
    
    public void push(int x) {
       st.push(x);
        
    }
    
    public int pop() {
      while(st.size()>1){
          t.push(st.pop());
      }
        int x = st.pop();
        while(t.size()>0){
            st.push(t.pop());
        }
        return x;
    }
    
    public int peek() {
        while(st.size()>1){
            t.push(st.pop());
        }
        int x=st.peek();
        while(t.size()>0){
           st.push(t.pop());
            
        }
        return x;
        
    }
    
    public boolean empty() {
        if(st.size()==0) return true;
        else return false;
        
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