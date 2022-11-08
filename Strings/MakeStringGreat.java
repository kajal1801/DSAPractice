class MakeStringGreat {
    public String makeGood(String s) {
        if(s.length() == 0 || s.length() == 1){
            return s;
        }
        boolean f = true;
        while(f){
            f = false;
            for(int i = 0;i < s.length() - 1;i++){
                char c = s.charAt(i);
                char d = s.charAt(i+1);
                if((Character.isLowerCase(c) && Character.isUpperCase(d)) || (Character.isLowerCase(d) && Character.isUpperCase(c))){
                    if(Character.toUpperCase(c) == d || Character.toUpperCase(d) == c){
                        s = s.substring(0,i) + ((i+2<s.length()) ? s.substring(i+2) : "");
                        f = true;
                    }
                }
            }
        }
        return s;
    }
}