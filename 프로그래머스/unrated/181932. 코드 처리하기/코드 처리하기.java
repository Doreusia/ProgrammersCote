class Solution {
    public String solution(String code) {
        String ret = "";
        char[] chCode = code.toCharArray();
        int mode = 0;
        
        for(int i = 0; i < chCode.length; i++) {
            if(mode == 0) {
                if(chCode[i] != '1') {
                    if(i % 2 == 0) {
                        ret += chCode[i];
                    }
                } else {
                    mode = 1;
                }
            } else if (mode == 1) {
                if(chCode[i] != '1') {
                    if(i % 2 != 0) {
                        ret += chCode[i];
                    }
                } else {
                    mode = 0;
                }
            }
        }
        
        if (ret.isEmpty()) {
            ret = "EMPTY";
        }
        
        return ret;
    }
}