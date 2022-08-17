public class UniqueMorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        String[] alpha = {".-","-...","-.-.","-..",".","..-.","--.",
                       "....","..",".---","-.-",".-..","--","-.",
                       "---",".--.","--.-",".-.","...","-","..-",
                       "...-",".--","-..-","-.--","--.."};
        String[] code = new String[words.length];
        for(int i = 0;i< words.length;i++){
            String s = "";
            for(int j = 0;j<words[i].length();j++){
                char a = words[i].charAt(j);
                int pos = (int)(a - 'a');
                s = s + alpha[pos];
            }
            code[i] = s;
        }
        int count = 1;
        Arrays.sort(code);
        for(int i = 1;i < code.length;i++){
            if(!code[i].equals(code[i-1])){
                count++;
            }
        }
        return count;
    }
}