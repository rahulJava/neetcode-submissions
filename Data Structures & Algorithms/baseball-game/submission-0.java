class Solution {
    public int calPoints(String[] operations) {
    Stack<Integer> stack = new Stack<>();

    for (String op : operations) {
        if (op.equals("+")) {
            // Sum of previous two scores
            int top = stack.pop();
            int newScore = top + stack.peek();
            stack.push(top);
            stack.push(newScore);
        } else if (op.equals("D")) {
            // Double the previous score
            stack.push(stack.peek() * 2);
        } else if (op.equals("C")) {
            // Remove the last score
            stack.pop();
        } else {
            // Record a new score
            stack.push(Integer.parseInt(op));
        }
    }

    // Calculate total sum
    int sum = 0;
    for (int score : stack) {
        sum += score;
    }
    return sum;
}
}