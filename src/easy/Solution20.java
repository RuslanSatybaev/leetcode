package easy;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Solution20 {
    public static void main(String[] args) {
        System.out.println(new Solution20().isValid("{}"));
        System.out.println(new Solution20().isValid("{}}"));
        System.out.println(new Solution20().isValid("{{]]"));
    }

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');
        Deque<Character> stack = new LinkedList<>();
        for (Character character : s.toCharArray()) {
            if (brackets.containsValue(character)) {
                stack.push(character);
            } else if (brackets.containsKey(character)) {
                if (stack.isEmpty() || stack.pop() != brackets.get(character)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}