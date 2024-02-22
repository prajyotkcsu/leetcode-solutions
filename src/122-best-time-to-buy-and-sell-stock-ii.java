// Approach: Create a monotonic stack, lower at bottom
// sell previous stocks when stock drops, identified by currStock<stack.peek()
// store current stock if higher than previous stock
class Solution {
    Stack<Integer> stack = new Stack<>();
    int profit,sell,buy=0;
    public int maxProfit(int[] prices) {
        for (int currPrice : prices) {
            if (!stack.isEmpty() && currPrice < stack.peek()) { // Loss
                profit += earnProfit();
            }
            stack.push(currPrice);
        }
        //selling remaining stocks to make profit.
        if (!stack.isEmpty()) { 
            profit += earnProfit();
        }
        return profit;
    }
    
    private int earnProfit() {
        sell = stack.peek(); // Sell on highest
        while (!stack.isEmpty()) { // Sell all stocks
            buy = stack.pop(); // Buy on lowest
        }
        return sell-buy; 
    }
}
