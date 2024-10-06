class Solution {
    boolean sameFreq(String s) {
        int[] count = new int[26];
        
        for(char ch : s.toCharArray()){
            count[ch-'a']++;
        }
        Map<Integer,Integer> mp = new HashMap<>();
      
        for(int cnt : count){
            if(cnt!=0){
                mp.put(cnt,mp.getOrDefault(cnt,0)+1);
            }
        }
        if(mp.size()==1)return true;
        if(mp.size()>2)return false;
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
            
        for(int keys : mp.keySet()){
            max = Math.max(max,keys);
            min = Math.min(min,keys);
        }
        
        if(max-min==1 && mp.get(max)==1)return true;
        if(min==1 && mp.get(min)==1 && max-min>=1)return true;
            
        return false;
    }
}
