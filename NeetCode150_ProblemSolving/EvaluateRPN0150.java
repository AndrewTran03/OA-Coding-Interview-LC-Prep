package NeetCode150_ProblemSolving;

import java.util.*;

public class EvaluateRPN0150 {
    public int evalRPN(String[] tokens) {
        HashSet<String> operators = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (!operators.contains(token)) {
                stack.push(Integer.parseInt(token));
            } else if (operators.contains(token) && stack.size() >= 2) {
                int secondNum = stack.pop();
                int firstNum = stack.pop();

                int result = 0;
                switch (token) {
                    case "+": {
                        result = firstNum + secondNum;
                        break;
                    }
                    case "-": {
                        result = firstNum - secondNum;
                        break;
                    }
                    case "*": {
                        result = firstNum * secondNum;
                        break;
                    }
                    case "/": {
                        result = firstNum / secondNum;
                        break;
                    }
                }
                stack.push(result);
            } else {
                return 0;
            }
        }

        return stack.size() != 1 ? 0 : stack.pop();
    }

    public static void main(String[] args) {
    }
}
