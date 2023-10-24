package JavaBook.ADT;
import java.util.TreeMap;
public class TreeMapDemo {
    public static void main(String args[]){
        TreeMap<String, Integer> tmap = new TreeMap<String , Integer>();
        tmap.put("Ravi",37);
        tmap.put("Mishra",31);
        tmap.put("Shashamk",43);
        tmap.put("Sharma",12);
        tmap.put("Vandu",28);
        // System.out.println(tmap);
        for(String key :tmap.keySet()){
            System.out.println("Name: " +key +"\tRoll: "+ tmap.get(key));

        }
        System.out.println();
        System.out.println(tmap.containsKey("Ravi"));
        System.out.println(tmap.containsKey("Sweta"));
        System.out.println(tmap.isEmpty());
        System.out.println(tmap.lastKey());
    }
}
