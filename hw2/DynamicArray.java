public class DynamicArray {
    private int[] arr;
    private int capacity;
    private int size; // Last element can be indexed at size-1
    
    public DynamicArray(int cap){ // Class Constructor
        arr = new int[cap];
        capacity = cap;
    }
    
    public void PushBack(int data){
        // START FIX CODE HERE
        // END CODE HERE
    }
    public int PopBack(){
        // START FIX CODE HERE
        return 0;
        // END CODE HERE
    }

    public int Get(int i){
        // START FIX CODE HERE
        return 0;
        // END CODE HERE
    }
    public void Set(int i, int value){
        // START FIX CODE HERE
        // END CODE HERE
    }
    
    public void Remove(int i){
        // START FIX CODE HERE
        // END CODE HERE
    }
    
    public boolean IsEmpty(){
        // START FIX CODE HERE
        return false;
        // END CODE HERE
    }
    
    public int GetSize(){
        // START FIX CODE HERE
        return 0;
        // END CODE HERE
    }
    
    public void PrintStructure(){
        // START FIX CODE HERE
        System.out.print("Size = " + size + ", Cap = " + capacity + ", arr = [ ] ");
        // END CODE HERE
    }
}