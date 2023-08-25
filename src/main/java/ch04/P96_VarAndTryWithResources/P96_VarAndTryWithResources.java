package ch04.P96_VarAndTryWithResources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class P96_VarAndTryWithResources {

    public static void main(String[] args) {

        try (var writer = new PrintWriter(new File("welcome.txt"))) {
            writer.println("Welcome message");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(P96_VarAndTryWithResources.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
