import java.util.Stack;
class Main {
    static int precedence(char c) {
        switch (c) {
            case'+':
                case'-':
                    return 1;
                    case '*':
                        case'/':
                            return 2;
                            case'^':
                                return 3;
        }
        return -1;
    }
    static String infixTopostfix(String expression) {
        String result = "";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < expression.length(); i++) {
            char c= expression.charAt(i);
            if(Character.isLetterOrDigit(c)) {
                result+= c;
            } else if(c == '(') {
                stack.push(c);
            } else if (c==')') {
                while (!stack.isEmpty() &&stack.peek() != '(') {
                    result += stack.pop();
                }
                stack.pop();
            } else {
                while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()) {
            if(stack.peek() == '('|| stack.peek () ==')') {
                return"Invalid Expression";
            }
            result += stack.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        String infixExpression = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Infix Expression:" + infixExpression);
        System.out.println("postfix Expression:" + infixTopostfix(infixExpression));
    }
}