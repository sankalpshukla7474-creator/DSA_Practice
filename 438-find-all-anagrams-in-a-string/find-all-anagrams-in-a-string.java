class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ls = new ArrayList<>();
        if (p.length() == 0 || s.length() == 0)
            return ls;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        for (char ch : p.toCharArray()) {
            hm1.put(ch, hm1.getOrDefault(ch, 0) + 1);
        }
        HashMap<Character, Integer> hm2 = new HashMap<>();
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            hm2.put(ch, hm2.getOrDefault(ch, 0) + 1);
            if (j - i + 1 < p.length())
                continue;
            if (hm1.size() == hm2.size()) {
                if (hm1.equals(hm2)) {
                    ls.add(i);
                }
            }
            hm2.put(s.charAt(i), hm2.get(s.charAt(i)) - 1);
            if (hm2.get(s.charAt(i)) == 0) {
                hm2.remove(s.charAt(i));
            }
            i++;
        }
        return ls;
    }
}