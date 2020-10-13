
/**
 * Die Hauptklasse einer JavaFX-Applikation
 * @author GOD
 * @version 0.0.2
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.*;
import java.io.*;
import javafx.scene.layout.*;


public class Main extends Application 
{

    public static void main(String [] args)
    {

        launch(args);

    }

    /**
     * Start-Methode für die JavaFX-Applikation. 
     * In dieser Methode wird insbesondere die grafische Benutzeroberfläche erzeugt. 
     * Sie wird einmalig nach der Init()-Methode und im JavaFX-Thread ausgeführt. 
     */
    /**
     * Start-Methode für die JavaFX-Applikation
     */
    public void start(Stage stage) throws Exception 
    {

        String fxmlFile = "main.fxml";

        try
        {

            VBox root = FXMLLoader.load(getClass().getResource(fxmlFile));
            Scene scene = new Scene(root);
            stage.setTitle("Meine JavaFX App");
            stage.setScene(scene);
            stage.show();

        }
        catch(IOException e)
        {

            System.err.println("FXML-Ressource konnte nicht aus der Datei geladen werden: " + fxmlFile);

        }
        catch(NullPointerException e)
        {

            System.err.println("Beim Laden der FXML-Datei wurde kein Objekt der Basisklasse javafx.scene.Parent erzeugt.");

        }

    }

    /**
     * Programmeinstiegspunkt fuer das Java-Programm. Es ist lediglich die launch()-Methode aufzurufen. 
     * Initialisierungen passieren dann in der init()-Methode sowie der start()-Methode. Die MainLoop verbirgt 
     * sich sozusagen in der Anwendung selbst. 
     * Nach dem Ausstieg aus der "Mainloop" können notwendige Aufräumarbeiten in der stop()-Methode erfolgen.
     * 
     * @param  args   Kommandozeilenparameter zu Übergabe an den Application Launcher
     */

}