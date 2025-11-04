import java.util.*;

class Solution {
    public int countGoodSubstrings(String s) {
        int l = 0, t = 0, n = s.length();
        HashMap<Character, Integer> hp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            hp.put(c, hp.getOrDefault(c, 0) + 1);
            if (i - l + 1 > 3) {
                char ch = s.charAt(l);
                hp.put(ch, hp.get(ch) - 1);
                if (hp.get(ch) == 0) hp.remove(ch);
                l++;
            }
            if (i - l + 1 == 3 && hp.size() == 3) {
                t++;
            }
        }
        return t;
    }
}
