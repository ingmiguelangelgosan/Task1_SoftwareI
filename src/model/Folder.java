package model;

import java.io.File;
import java.io.FilenameFilter;

public class Folder {

    private String folderPath;
    private String word;

    public Folder(String folderPath, String word) {
        this.folderPath = folderPath;
        this.word = word;
    }

    public static void getFiles(String folderPath, String word) {

        File folder = new File(folderPath);

        // Crear un filtro para archivos con extensiones .txt, .xml, .json o .csv
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt") || name.endsWith(".xml") || name.endsWith(".json")
                        || name.endsWith(".csv");
            }
        };

        // Obtener una lista de archivos en la carpeta que cumplan con el filtro
        File[] files = folder.listFiles(filter);
        int totalWords = 0;

        // Verificar que la dirección de la carpeta sea correcta o que la carpeta exista
        if (files != null) {

            // Verificar que si existan archivos con las extensiones requeridas
            if (files.length == 0) {
                System.out.println("\nNo se encontraron archivos de texto en la carpeta\n");
            } else {
                System.out.println();

                // Recorrer la lista de archivos y obtener la ruta de cada uno
                for (File file : files) {
                    String filePath = file.getAbsolutePath();
                    int wordsByFile = Archive.searchWord(filePath, word);
                    totalWords += wordsByFile;

                    System.out.println(file.getName() + " " + wordsByFile + " veces");
                }
                System.out.println("\nTotal: " + totalWords + " veces");
            }
        } else {
            System.out.println("\nNo se ha podido encontrar la carpeta indicada\n");
        }
    }
}
