package JavaQuestions.map;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        // map is set of key and value pairs
        //map is interface
        // names , Ids
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("John", 1234);
        empIds.put("Carl", 233);
        empIds.put("Jerry", 87326);

        System.out.println(empIds);
        System.out.println(empIds.get("Carl"));
        System.out.println(empIds.containsKey("George"));
        System.out.println(empIds.containsValue(233));
        System.out.println(empIds.entrySet().size());
        empIds.put("John", 2223);// will update value for existing key
        System.out.println(empIds);
        empIds.replace("John", 777);// replace existing values
        System.out.println(empIds);
        empIds.putIfAbsent("Steve",73);// will not do anything if we already have key and value
        System.out.println(empIds);
        empIds.remove("Steve");
        System.out.println(empIds);


    }
}
