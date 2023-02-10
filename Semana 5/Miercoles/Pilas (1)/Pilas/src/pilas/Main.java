
package pilas;

public class Main {

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);
        arrayStack.push(6);
        arrayStack.printStack();
        System.out.println("Nueva pila");
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.printStack();
        System.out.println("Pila final");
        arrayStack.push(6);
        arrayStack.printStack();

    }
    
}
