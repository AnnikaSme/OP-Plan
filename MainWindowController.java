
/**
 * Die Klasse MainWindowController dient zur Steuerung der Oberfläche.
 * 
 * @author Annika Smetaczko, Nathalie Schatz 
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
public class MainWindowController
{   
    public Main main;

    @FXML
    private Button Verwaltung;

    @FXML
    private Button Personal;

    @FXML 
    private Text OPPlanungssystem;

    @FXML
    private Button PersonalEintragen; // um sich für einen op einzutragen

    @FXML
    private TextField Personalnummer; // damit sucht das system die gesamten daten eines personals und trägt sie in die gewünschte op

    @FXML
    private Button OPListe; // Button um zur OP liste zu kommen

    @FXML
    private Text Operationen; // OPListe

    @FXML
    private Button OPanlegen; // Button um eine neue OP anzulegen

    // textfelder um Op anzulegen 

    @FXML
    private Button DatenExportieren;

    @FXML
    private MenuButton Personalanlegen;

    // Textfelder um Personal anzulegen

    @FXML
    private MenuButton Personalloeschen; 

    @FXML
    private TextField Personalnummerloeschen; // Personalnummer wird eingegeben und Daten des personals werden gesucht und gelöscht

    @FXML
    private Button OPloeschen; // Op wird gelöscht

    @FXML
    private TextField OPeingeben;  

    @FXML
    private Button Raumzuweisen;

    @FXML
    private MenuItem Arzt;

    @FXML
    private MenuItem Schwester;

    @FXML
    private MenuItem Kardiotechniker;

    @FXML
    private MenuItem ArztLö;

    @FXML
    private MenuItem SchwesterLö;

    @FXML
    private MenuItem KardiotechnikerLö;

    @FXML 
    private Button Arztspeichern;

    @FXML 
    private Button Schwesterspeichern;

    @FXML 
    private Button Kardiotechnikerspeichern;
    
    @FXML
    private TextField Artzname;
    
    @FXML
    private TextField Artzpersonalnummer;
    
    @FXML
    private TextField Artzfachrichtung;
    
    @FXML
    private TextField Artzrang;
    
    @FXML
    private TextField Artzkontakt;
    

    

    public void setMain(Main main)
    {
        this.main = main;
    }

    @FXML
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

    @FXML
    public void Personal()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("Personal.fxml"));
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

    @FXML
    public void Arzt()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("Arzt.fxml"));
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

    @FXML
    public void Schwester()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("Schwester.fxml"));
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

    @FXML
    public void Kardiotechniker()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("Kardiotechniker.fxml"));
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

    public void warningDaten() 
    {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Achtung");
        alert.setHeaderText("Achtung!");
        alert.setContentText("Bitte Daten eingeben");

        alert.showAndWait();
    }

    @FXML
    public void Arzthinzufügen()
    {

    }
    // public void notfallspeichern()
    // {
        // if(notfallname.getText() == null || notfallname.getText().trim().isEmpty() || notfalladresse.getText() == null || 
        // notfalladresse.getText().trim().isEmpty() || notfallbeziehung.getText() == null || notfallbeziehung.getText().trim()
        // .isEmpty() || notfalltelefonnummer.getText() == null || notfalltelefonnummer.getText().trim().isEmpty() ||
        // notfallblutgruppe.getText() == null || notfallblutgruppe.getText().trim().isEmpty())
        // {
            // warningDaten(); 
        // }
        // else
        // {
            // if(notfallname.getText().replaceAll(" ","").matches("[a-zA-Z]+") && notfallbeziehung.getText().replaceAll(" ","").matches("[a-zA-Z]+") &&
            // notfalltelefonnummer.getText().replaceAll(" ","").matches("[0-9]+") && notfallblutgruppe.getText().replaceAll(" ","").matches("[a-zA-Z]+"))
            // {
                // verwalter.Aktesuchen(p.getKrankenkassenNr()).Notfallkontakterstellen(notfallname.getText(), notfalladresse.
                    // getText(), notfallbeziehung.getText(), notfalltelefonnummer.getText(), notfallblutgruppe.getText());
                // String nr = p.getKrankenkassenNr();
                // p = verwalter.Aktesuchen(nr);
                // patientenakteladen();
            // }
            // else
            // {
                // if(notfallbeziehung.getText().matches("[a-zA-Z]+")==false)
                // {
                    // Alert alert = new Alert(Alert.AlertType.WARNING);
                    // alert.setTitle("Achtung");
                    // alert.setHeaderText("Falsche Eingabe im Beziehungsfeld!");
                    // alert.setContentText("Bitte nur Buchstaben eingeben");

                    // alert.showAndWait();
                    // notfallbeziehung.clear(); 
                // }
                // else if(notfallname.getText().matches("[a-zA-Z]+")==false)
                // {
                    // Alert alert = new Alert(Alert.AlertType.WARNING);
                    // alert.setTitle("Achtung");
                    // alert.setHeaderText("Falsche Eingabe im Namenfeld!");
                    // alert.setContentText("Bitte nur Buchstaben eingeben");

                    // alert.showAndWait();
                    // notfallname.clear(); 
                // }
                // else if(notfalltelefonnummer.getText().matches("[0-9]+")==false)
                // {
                    // Alert alert = new Alert(Alert.AlertType.WARNING);
                    // alert.setTitle("Achtung");
                    // alert.setHeaderText("Falsche Eingabe im Telefonnummerfeld!");
                    // alert.setContentText("Bitte nur Zahlen eingeben");

                    // alert.showAndWait();
                    // notfalltelefonnummer.clear(); 
                // }
                // else if(notfallblutgruppe.getText().matches("[a-zA-Z]+")==false)
                // {
                    // Alert alert = new Alert(Alert.AlertType.WARNING);
                    // alert.setTitle("Achtung");
                    // alert.setHeaderText("Falsche Eingabe im Blutgruppefeld!");
                    // alert.setContentText("Bitte nur Buchstaben eingeben");

                    // alert.showAndWait();
                    // notfallblutgruppe.clear(); 
                // }
            // }
        // }
    // }
}