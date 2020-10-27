
/**
 * Die Klasse MainWindowController dient zur Steuerung der Oberfläche.
 * 
 * @author Annika Smetaczko 
 * @version 19.10.2020, 0.0.1
 */

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.collections.*;
import javafx.fxml.*;
import java.io.*;
import javafx.scene.control.Alert;
import java.awt.Frame;
import java.util.*;
import java.util.*;
import java.io.File;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.commons.collections4.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.text.*;
import java.time.format.*;
import java.time.*;
public class MainWindowController extends Verwaltung
{   
    public Main main;
    
    @FXML
    private Button Verwaltung;
    
    @FXML
    private Button Personal;
    
    @FXML 
    private Text OPPlanungssystem;
    

    /**
     * Konstruktor für Objekte der Klasse n
     */
    public MainWindowController() throws Exception
    {
    }

    public void setMain(Main main)
    {
        this.main = main;
    }
    
   
    public void Verwaltung()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("Verwaltung.fxml"));
            VBox pane = loader.load();

            MainWindowController mainWindowController = loader.getController();
            mainWindowController.setMain(main);

            Scene scene = new Scene(pane);
            Main.primaryStage.setScene(scene);
            Main.primaryStage.show();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
