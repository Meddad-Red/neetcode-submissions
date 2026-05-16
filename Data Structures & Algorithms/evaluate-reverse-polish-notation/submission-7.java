class Solution {
    public int evalRPN(String[] tokens) {
        HashSet<String> operatorSet = new HashSet<>();
        operatorSet.add("+");
        operatorSet.add("-");
        operatorSet.add("*");
        operatorSet.add("/");

        Stack<Integer> tokenStack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String currentToken = tokens[i];

            if (!operatorSet.contains(currentToken)) {
                int num = Integer.parseInt(currentToken);
                tokenStack.push(num);
            } else {
                int num2 = tokenStack.pop();
                int num1 = tokenStack.pop();

                tokenStack.push(parseOperation(num2,num1,currentToken));
            }
        }

        return tokenStack.pop();
    }

    public int parseOperation(int num2, int num1, String op) {
        int result = 0;

        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;                
        }

        return result;
    }
}
