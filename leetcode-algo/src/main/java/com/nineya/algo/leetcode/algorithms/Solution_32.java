public class Solution_32 {
    public int longestValidParentheses(String s) {
        char[] chars = s.toCharArray();
        int max = 0;
        int num = 0;
        int n = 0;
        int m = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ')') {
                if (n == 0) {
                    max = Math.max(num + m, max);
                    num = 0;
                    m = 0;
                } else {
                    n--;
                    m++;
                    if (n == 0) {
                        num+= m;
                        m = 0;
                    }
                }
            } else {
                n++;
                m++;
            }
        }
        if (n == 0) {
            num += m;
        }
        max = num>max?num:max;
        num = 0;
        n = 0;
        m = 0;
        for (int i = chars.length -1; i >=0; i--) {
            if (chars[i] == '(') {
                if (n == 0) {
                    max = Math.max(num + m, max);
                    num = 0;
                    m = 0;
                } else {
                    n--;
                    m++;
                    if (n == 0) {
                        num+= m;
                        m = 0;
                    }
                }
            } else {
                n++;
                m++;
            }
        }
        if (n == 0) {
            num += m;
        }
        return num>max?num:max;
    }

    public static void main(String[] args) {
        Solution_32 solution = new Solution_32();
        System.out.println(solution.longestValidParentheses("(()"));
        System.out.println(solution.longestValidParentheses("()(())"));
        System.out.println(solution.longestValidParentheses(")()())"));
        System.out.println(solution.longestValidParentheses(""));
    }
}
