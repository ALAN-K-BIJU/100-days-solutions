class Solution {
    public int strStr(String haystack, String needle) {
        int k = needle.length();
        int l = haystack.length();
        String inputed="";
        int q= -1;
        if (needle.equals(haystack)){
            return 0;
        }
        for(int i=0; i <= (l - k); i++){
            inputed="";
            inputed =haystack.substring(i,i+k);
            if (inputed.equals(needle)){
                q=i;
                break;
            }else{
                continue;
            }
        }
        return q;
    }
}