package application;

import java.util.Map;
import java.util.TreeMap;

public class TesteMap {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "997111111");

        cookies.remove("email");
        cookies.put("phone", "133321312");

        System.out.println("Contains 'Phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("emnail"));
        System.out.println("Size: " + cookies.size());

        System.out.println("All Cookies:");
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));

        }

    }
}
