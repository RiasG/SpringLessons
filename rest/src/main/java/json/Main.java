package json;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
  добавить зависимость в pom.xml для преобразования json
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.11.4</version>
    </dependency>
 */

public class Main {
     public static void main(String[] args) throws JsonProcessingException {
         ObjectMapper objectMapper = new ObjectMapper();
         SomeData someData = new SomeData();
         someData.setParam1(32);
         someData.setParam2(true);
         someData.setParam3("Stroka");

         String rebuild = objectMapper.writeValueAsString(someData);
         System.out.println(rebuild);
     }

}
