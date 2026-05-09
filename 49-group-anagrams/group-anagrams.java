class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ls = new ArrayList<>() ;
        boolean[] visit = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            if (visit[i])
                continue;
            List<String> pb = new ArrayList<>();
            pb.add(strs[i]) ;
            int[] fre = new int[26];
            String o = strs[i] ;
            for (char ch : o.toCharArray()) {
                fre[ch - 'a']++;
            }
            for (int j = i + 1; j < strs.length; j++) {
                if (strs[i].length() == strs[j].length()) {
                    int[] pre = new int[26];
                    for (char ch : strs[j].toCharArray()) {
                        pre[ch - 'a']++;
                    }
                    boolean flag = false ;
                    for(int k = 0 ; k < 26 ; k++){
                        if(fre[k] != pre[k]){
                            flag = true ;
                            break ;
                        }
                    }
                    if(!flag){
                        pb.add(strs[j]) ;
                        visit[j] = true ;
                    }
                }
            }
            ls.add(new ArrayList<>(pb)) ;
        }
        return ls ;
    }
}