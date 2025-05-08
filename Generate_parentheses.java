import java.util.ArrayList;
import java.util.List;

/**
 * Cheat Sheet: Generate Parentheses (LeetCode)
 *
 * Problem: Given n pairs of parentheses, generate all combinations of well-formed parentheses.
 * This class uses recursion + backtracking to solve the problem.
 *
 * Concepts covered:
 * - Recursion and backtracking
 * - Constraints to prune invalid paths
 * - Java stack call flow (no manual backtracking needed)
 * - Base case handling
 * - Object comparisons and method scoping in Java
 */
public class GenerateParenthesesCheatSheet {

    /**
     * Entry point for generating parentheses.
     * @param n Number of pairs of parentheses
     * @return List of all valid combinations
     */
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack("", 0, 0, n, result);
        return result;
    }

    /**
     * Recursive backtracking function to build valid parenthesis strings.
     *
     * @param current Current parenthesis string being built
     * @param open Number of '(' used so far
     * @param close Number of ')' used so far
     * @param max Total number of pairs to use
     * @param result List to store valid results
     */
    private void backtrack(String current, int open, int close, int max, List<String> result) {
        // ✅ Base case: once the string has 2 * n characters, it's complete
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // ✅ Only add '(' if we haven't used all of them yet
        if (open < max) {
            backtrack(current + "(", open + 1, close, max, result);
        }

        // ✅ Only add ')' if it won't lead to invalid syntax
        if (close < open) {
            backtrack(current + ")", open, close + 1, max, result);
        }
    }

    /**
     * Main method for testing.
     */
    public static void main(String[] args) {
        GenerateParenthesesCheatSheet generator = new GenerateParenthesesCheatSheet();
        List<String> output = generator.generateParenthesis(3);

        System.out.println("Generated parentheses for n = 3:");
        for (String s : output) {
            System.out.println(s);
        }
    }
}
