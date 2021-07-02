import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> s = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            s.push(pushA[i]);
            while(!s.isEmpty() && s.peek() == popA[j]) {
                s.pop();
                j++;
            }
        }
        if (j != popA.length) {
            return false;
        } else {
            return true;
        }
        
    }
}
