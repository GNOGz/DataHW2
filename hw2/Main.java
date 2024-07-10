public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        DynamicArray var1 = new DynamicArray(2);
        //test below
        var1.PushBack(3);
        var1.PushBack(4);
        var1.PrintStructure();
        var1.PushBack(5);
        var1.PrintStructure();
        var1.PushBack(5);
        var1.PushBack(8);
        var1.PushBack(20);
        var1.PrintStructure();
    }
    
}
