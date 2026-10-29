package HashMap;
import java.util.*;
public class Demo {
    public static void main(String[] args){
        Map<String,Integer> m=new HashMap<>();
        m.put("PK",21);
        m.put("Rk",22);
        m.put("SK",23);
        m.put("MS",24);
        m.put("PS",25);
        System.out.println(m.get("PK"));
        System.out.println(m.containsKey("PS"));
        System.out.println(m.containsValue(23));
        m.put("PK",29);
        System.out.println(m.keySet());
        System.out.println(m.values());
        m.remove("PK");
        System.out.println(m.values());
        System.out.println(m.keySet());
    }
}
