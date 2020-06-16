package mparish;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonProcessor {
    ObjectMapper mapper = new ObjectMapper();

    public Person testMe() throws IOException {
        return mapper.readValue(
                JsonProcessor.class.getResourceAsStream("/name.json"),
                Person.class
        );
    }
}
