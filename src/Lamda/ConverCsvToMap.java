package Lamda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConverCsvToMap {
    //TODO: Read a csv file and convert to map

    public static void main(String[] args) {
        convertCSVToMap();
    }

    public static Map<String, String> convertCSVToMap() {
        BufferedReader bufferedReader;
        List<String> listLines = new ArrayList<>();
        HashMap<String, String> hm = new HashMap<>();

        try {
            bufferedReader = new BufferedReader(new FileReader("E:/inteleij/src/Lamda/MyNewFile.csv"));
            String line = bufferedReader.readLine();
            while (line != null) {
                listLines.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("File couldn't be read " + e.getMessage());
        }
        System.out.println(listLines);

        for (String w : listLines) {
            String[] arr = w.split(",");
            hm.put(arr[0].trim(), arr[1].trim());
        }
        System.out.println(hm);

        return hm;
    }
}
