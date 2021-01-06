package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
    private Map<String, String> mappieee;
    private String bestand;

    public SaveableDictionary() {
        this.mappieee = new HashMap<>();
    }

    public SaveableDictionary(String file) {
     this.bestand = file;
     this.mappieee = new HashMap<>();
    }

    public boolean save() {
        try {
            PrintWriter schrijverT = new PrintWriter(bestand);
        }
    }

    public boolean load() {
       try  (Scanner bestandLezer = new Scanner(Paths.get(bestand))) {
           while (bestandLezer.hasNextLine()) {
               String regel = bestandLezer.nextLine();
               String[] deling = regel.split(":");

               add(deling[0], deling[1]);
           }
           return true;


       } catch (Exception e) {
           System.out.println("Foutmelding! " + e);
       }
       return false;
    }

    public void add(String words, String translation) {
        mappieee.putIfAbsent(words, translation);
        mappieee.putIfAbsent(translation, words);
    }

    public String translate(String word) {
        return mappieee.get(word);
    }

    public void delete(String word) {
        if (mappieee.containsKey(word)) {
            mappieee.remove(word);
        }

        if (mappieee.containsValue(word)) {
            mappieee.values().remove(word);
        }

    }
}

