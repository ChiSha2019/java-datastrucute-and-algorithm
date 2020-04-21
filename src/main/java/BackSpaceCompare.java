import java.util.Stack;

public class BackSpaceCompare {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
    }

    static public boolean backspaceCompare(String S, String T) {
        Stack stack1 = stringToStack(S);
        Stack stack2 = stringToStack(T);

        if(stack1.size() != stack2.size()) return false;
        while (!stack1.isEmpty() && !stack2.isEmpty()){
            if(stack1.pop() != stack2.pop())
                return false;
        }
        return true;

    }
    static Stack stringToStack(String S){
        Stack stack = new Stack<Character>();
        int index = 0;
        while(index < S.length()){
            if(S.charAt(index) == '#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.add(S.charAt(index));
            }
            index ++;
        }
        return stack;
    }


}
