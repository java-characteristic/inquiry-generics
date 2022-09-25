package org.javacharacteristic.generics;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.Map;

public class Test01 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("id", "123");
        map.put("name", "name");
        Gson gson = new Gson();
        String str = gson.toJson(map);

        EntityVO entityVO = gson.fromJson(str, new TypeToken<EntityVO>() {
        }.getType());
        System.out.println(entityVO);
    }
}

