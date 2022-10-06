import java.util.*;

class TimeMap {
    Map<String, TreeMap<Integer, String>> timeMap;
    
    public TimeMap() {
        timeMap = new HashMap<>();    
    }
    
    public void set(String key, String value, int timestamp) {
        timeMap.putIfAbsent(key, new TreeMap<>());
        timeMap.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if (!timeMap.containsKey(key)) 
            return "";
        Map.Entry<Integer, String> entry = timeMap.get(key).floorEntry(timestamp);
        if (entry == null) 
            return "";
        return entry.getValue();
    }
}