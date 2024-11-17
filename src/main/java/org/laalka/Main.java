package org.laalka;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        try {
            String jsonResponse = "{ \"userId\": 1, \"id\": 1, \"title\": \"Sample Task\", \"completed\": false }";

            ObjectMapper objectMapper = new ObjectMapper();
            ToDo todo = objectMapper.readValue(jsonResponse, ToDo.class);

            System.out.println("Заголовок задачи: " + todo.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
