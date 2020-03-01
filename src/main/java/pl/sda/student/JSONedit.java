package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSONedit {
    public JSONedit() {
    }

    public JSONedit(String file, ArrayList list) {
    }

    public void writeList(String filename, List<Book> bookList) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(filename + ".json"), bookList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
