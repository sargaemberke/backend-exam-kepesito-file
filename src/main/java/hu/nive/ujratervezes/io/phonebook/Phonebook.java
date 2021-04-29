package hu.nive.ujratervezes.io.phonebook;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) throws IOException {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException();
        }

        try (FileWriter fw = new FileWriter(Paths.get(output).toFile())) {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                fw.append(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        }
    }

}