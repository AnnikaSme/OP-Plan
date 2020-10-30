
/**
 * Die Hauptklasse einer JavaFX-Applikation
 * @author Annika Smetaczko, Nathalie Schatz
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
   public static Stage primaryStage;
    
    public static Stage substage;
    public static Verwaltung verwalter;
    
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Op-Planungssytem");
        mainWindow();
    }

    public void mainWindow() throws Exception
    {   

        try{
            Main.verwalter = new Verwaltung();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("main.fxml"));
            VBox pane = loader.load();

            primaryStage.setMinHeight(500.00);
            primaryStage.setMinWidth(660.00);

            MainWindowController mainWindowController = loader.getController();
            mainWindowController.setMain(this);
            Scene scene = new Scene(pane);
            
            
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } 
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args)
    {
        launch(args);
        
    }

}