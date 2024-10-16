class Solution {
    public String orderlyQueue(String s, int k) {
        if (k == 1) {
            String result = s;
            for (int i = 1; i < s.length(); i++) {
                String rotated = s.substring(i) + s.substring(0, i);
                if (rotated.compareTo(result) < 0) {
                    result = rotated;
                }
            }
            return result;
        } else {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }
    }
}
