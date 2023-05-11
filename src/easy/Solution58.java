package easy;

public class Solution58 {

    public int lengthOfLastWord1(String s) {
        StringBuilder lastWord = new StringBuilder();
        String stripped = s.strip();
        if (stripped.length() == 1) {
            return 1;
        }
        for (int i = stripped.length() - 1; i >= 0; i--) {
            if (stripped.charAt(i) == 32) {
                break;
            } else {
                lastWord.append(stripped.charAt(i));
            }
        }
        return lastWord.length();
    }

    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        return str[str.length - 1].length();
    }
}
