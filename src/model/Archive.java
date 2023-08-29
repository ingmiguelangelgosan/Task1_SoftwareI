package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Archive {

    private String word;
    private String route;

    public Archive(String route, String word) {
        this.word = word;
        this.route = route;
    }

    public static int searchWord(String route, String word) {
        int counter = 0;

        try (BufferedReader readText = new BufferedReader(new FileReader(route))) {
            String line;
            while ((line = readText.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String i : words) {
                    if (i.equalsIgnoreCase(word)) {
                        counter++;
                    }
                }
            }
        } catch (IOException m) {
            m.printStackTrace();
        }

        return counter;

    }
}
