import java.util.HashSet;

public class S3 {

    public static void main(String[] args) {
        System.out.println("hello world");
    }

    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0;
        HashSet<Character> cache = new HashSet<>();
        int max = 0;
        while (end < s.length()) {
            if (cache.contains(s.charAt(end))) {
                cache.remove(s.charAt(start));
                start++;
                continue;
            }
            cache.add(s.charAt(end));
            System.out.println(cache);
            max = max > cache.size() ? max : cache.size();
            end++;
        }
        return max;
    }
}
