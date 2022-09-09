import java.util.Arrays;

public class WeakCharactersInGame{
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a,b) -> (a[0] == b[0]) ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));
        
        int weakCharacters = 0;
        int len = properties.length;
        int maximum = properties[len-1][1];
        
        for(int i = len-2; i>=0 ;i--) {
            if(properties[i][1] < maximum) {
                weakCharacters++;
            } 
            else {
                maximum = properties[i][1];
            }
        }
        return weakCharacters;
    }
}