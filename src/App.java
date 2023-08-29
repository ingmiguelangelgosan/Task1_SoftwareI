import java.util.Scanner;

import model.Folder;

public class App {
    public static void main(String[] args) throws Exception {
        // /home/sirmiguel/Documentos/Universidad/VII Semestre/Ing de Software I/POO/Tarea 1/CountWords/Tests/pruebas1
        // /home/sirmiguel/Documentos/Universidad/VII Semestre/Ing de Software I/POO/Tarea 1/CountWords/Tests/pruebas2
        // /home/sirmiguel/Documentos/Universidad/VII Semestre/Ing de Software I/POO/Tarea 1/CountWords/Tests/pruebas3

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIntroduce la ruta completa de la carpeta: ");
        String folderPath = sc.nextLine();

        System.out.print("\nIntroduce la palabra que deseas buscar: ");
        String wordSearch = sc.nextLine();

        Folder.getFiles(folderPath, wordSearch);
        //Folder.getFiles("/home/sirmiguel/Documentos/Universidad/VII Semestre/Ing de Software I/POO/Tarea 1/CountWords/Tests/pruebas1/", "arar");
    }
}
