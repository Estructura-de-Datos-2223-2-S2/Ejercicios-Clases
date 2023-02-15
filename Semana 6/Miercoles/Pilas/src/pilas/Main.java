
package pilas;

public class Main {

    public static void main(String[] args) {
        
        Stack stack = new Stack();
        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.printStack();
        System.out.println("PILA NUEVA");
        Stack stackResult = sumInPairs(stack);
        stackResult.printStack();
        
        /*
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
        arrayStack.printStack();*/

    }
    
    public static Stack sumInPairs(Stack stack) {
        Nodo pointer = stack.getPeek();
        int cont = 0, contRepeat =0;
        int acumSum = 0;
        int size = stack.getSize();
        boolean isEven = (size %2 == 0);
        int repeats = (isEven) ? size/2 : (size/2)+1;
        if (isEven) {
            while (contRepeat < repeats){
                acumSum += (int) stack.pop();
                cont++;
                if (cont == 2) {
                    stack.append(acumSum);
                    cont = 0;
                    acumSum =0;
                    contRepeat++;
                }
            }    
        } else {
            while (contRepeat < repeats){
                acumSum += (int) stack.pop();
                cont++;
                if (cont == 2 || contRepeat == repeats-1) {
                    stack.append(acumSum);
                    cont = 0;
                    acumSum =0;
                    contRepeat++;
                }
            }
        }
        return stack;
        
    }
    
}
