package NeetCode150_ProblemSolving;

public class ValidPalindrome0125 {
    public boolean isPalindrome(String s) {
        if (s.trim().length() <= 1) {
            return true;
        }

        int leftPos = 0, rightPos = s.length() - 1;
        while (leftPos <= rightPos) {
            char leftChar = s.charAt(leftPos), rightChar = s.charAt(rightPos);
            if (!Character.isLetterOrDigit(leftChar)) {
                leftPos++;
                continue;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                rightPos--;
                continue;
            }

            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            }

            leftPos++;
            rightPos--;
        }
        return true;
    }

    public static void main(String[] args) {
    }
}