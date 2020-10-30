
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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.text.*;
import java.time.format.*;
import java.time.*;

public class MainWindowController extends Main
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
    private Button OPspeichern;

    @FXML
    private TextField Arztname;

    @FXML
    private TextField Arztpersonalnummer;

    @FXML
    private TextField Arztfachrichtung;

    @FXML
    private TextField Arztrang;

    @FXML
    private TextField Arztkontakt;

    @FXML
    private Alert alert1;

    @FXML
    private TextField Schwestername;

    @FXML
    private TextField Schwesterpersonalnummer;

    @FXML
    private TextField Schwesterstation;

    @FXML
    private TextField Schwesterkontakt;

    @FXML
    private TextField Kardiotechnikername;

    @FXML
    private TextField Kardiotechnikerpersonalnummer;

    @FXML
    private TextField Kardiotechnikerkontakt;

    @FXML
    private TextField OPNamePatient;

    @FXML
    private TextField OPAlterPatient;

    @FXML
    private TextField OPGesundheitszustand;

    @FXML
    private TextField OPAnzahlAerzte;

    @FXML
    private TextField OPAnzahlSchwestern;

    @FXML
    private TextField OPAnzahlKardiotechniker;

    @FXML
    private TextField OPDauer;

    @FXML
    private TextField OPTyp;

    @FXML
    private TextField OPDringlichkeit;

    @FXML
    private TextField Arztlöschenpersonalnummer;

    @FXML 
    private Button LöschenArzt;
    
    @FXML
    private TextField Schwesterlöschenpersonalnummer;
    
    @FXML
    private Button LöschenSchwester;
    
    @FXML
    private TextField Kardiotechnikerlöschenpersonalnummer;
    
    @FXML
    private Button LöschenKardiotechniker;

    @FXML
    private Button Zurück;

    @FXML
    private Button Zurück2;
    
    @FXML
    private Button Raum;
    

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
            Pane pane = loader.load();

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
    public void Zurück() throws Exception
    {
        main.mainWindow();
    }

    @FXML
    public void Zurück2() 
    {
        Verwaltung();
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

    @FXML
    public void OP()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("OP.fxml"));
            Pane pane = loader.load();

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
    public void Arzthinzufügen() throws Exception
    {   int a;
        int b;
        if(Arztname.getText() == null || Arztname.getText().trim().isEmpty() || Arztkontakt.getText() == null || 
        Arztkontakt.getText().trim().isEmpty() || Arztrang.getText() == null || Arztrang.getText().trim()
        .isEmpty() || Arztfachrichtung.getText() == null || Arztfachrichtung.getText().trim().isEmpty() ||
        Arztpersonalnummer.getText() == null || Arztpersonalnummer.getText().trim().isEmpty() )
        {
            warningDaten(); 
        }
        else
        {
            if(Arztname.getText().replaceAll(" ","").matches("[a-zA-Z]+") && Arztkontakt.getText().replaceAll(" ","").matches("[a-zA-Z]+") &&
            Arztrang.getText().replaceAll(" ","").matches("[1-4]+") && Arztfachrichtung.getText().replaceAll(" ","").matches("[a-zA-Z]+")&&
            Arztpersonalnummer.getText().replaceAll(" ","").matches("[0-9]+"))
            {
                a = Integer.parseInt(Arztrang.getText());
                b = Integer.parseInt(Arztpersonalnummer.getText());
                Main.verwalter.speicherPersonalarzt(Arztfachrichtung.getText(),a,  Arztname.getText(),  b, Arztkontakt.getText());
                Verwaltung();

            }

            if(Arztname.getText().matches("[a-zA-Z]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Namensfeld!");
                alert.setContentText("Bitte nur Buchstaben eingeben");

                alert.showAndWait();
                Arztname.clear(); 

            }
            else if(Arztkontakt.getText().matches("[a-zA-Z]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Kontaktfeld!");
                alert.setContentText("Bitte nur Buchstaben eingeben");

                alert.showAndWait();
                Arztkontakt.clear(); 
            }
            else if(Arztrang.getText().matches("[1-4]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Rangfeld!");
                alert.setContentText("Bitte nur Zahlen zwischen 1 und 4 eingeben");

                alert.showAndWait();
                Arztrang.clear(); 
            }
            else if(Arztfachrichtung.getText().matches("[a-zA-Z]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Fachrichtungsfeld!");
                alert.setContentText("Bitte nur Buchstaben eingeben");

                alert.showAndWait();
                Arztfachrichtung.clear(); 
            }
            else if(Arztpersonalnummer.getText().matches("[0-9]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Personalnummerfeld!");
                alert.setContentText("Bitte nur Zahlen eingeben");

                alert.showAndWait();
                Arztpersonalnummer.clear();

            }
        }
    }

    @FXML
    public void Schwesterhinzufügen()
    {   int a;
        int b;
        if(Schwestername.getText() == null || Schwestername.getText().trim().isEmpty() || Schwesterkontakt.getText() == null || 
        Schwesterkontakt.getText().trim().isEmpty() || Schwesterstation.getText() == null || Schwesterstation.getText().trim()
        .isEmpty() || Schwesterpersonalnummer.getText() == null || Schwesterpersonalnummer.getText().trim().isEmpty() )
        {
            warningDaten(); 
        }
        else
        {
            if(Schwestername.getText().replaceAll(" ","").matches("[a-zA-Z]+") && Schwesterkontakt.getText().replaceAll(" ","").matches("[a-zA-Z]+") &&
            Schwesterstation.getText().replaceAll(" ","").matches("[1-4]+") && Schwesterpersonalnummer.getText().replaceAll(" ","").matches("[0-9]+"))
            {
                a = Integer.parseInt(Schwesterstation.getText());
                b = Integer.parseInt(Schwesterpersonalnummer.getText());
                Main.verwalter.speicherSchwester(a, Schwestername.getText(), b, Schwesterkontakt.getText());

                Verwaltung();
            }

            if(Schwestername.getText().matches("[a-zA-Z]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Namensfeld!");
                alert.setContentText("Bitte nur Buchstaben eingeben");

                alert.showAndWait();
                Schwestername.clear(); 

            }
            else if(Schwesterkontakt.getText().matches("[a-zA-Z]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Kontaktfeld!");
                alert.setContentText("Bitte nur Buchstaben eingeben");

                alert.showAndWait();
                Schwesterkontakt.clear(); 
            }
            else if(Schwesterstation.getText().matches("[1-4]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Rangfeld!");
                alert.setContentText("Bitte nur Zahlen zwischen 1 und 4 eingeben");

                alert.showAndWait();
                Schwesterstation.clear(); 
            }
            else if(Schwesterpersonalnummer.getText().matches("[0-9]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Personalnummerfeld!");
                alert.setContentText("Bitte nur Zahlen eingeben");

                alert.showAndWait();
                Schwesterpersonalnummer.clear();

            }
        }
    }

    @FXML
    public void Kardiotechnikerhinzufügen()
    {   int a;
        if(Kardiotechnikername.getText() == null || Kardiotechnikername.getText().trim().isEmpty() || Kardiotechnikerkontakt.getText() == null || 
        Kardiotechnikerkontakt.getText().trim().isEmpty() || Kardiotechnikerpersonalnummer.getText() == null || Kardiotechnikerpersonalnummer.getText().trim().isEmpty() )
        {
            warningDaten(); 
        }
        else
        {
            if(Kardiotechnikername.getText().replaceAll(" ","").matches("[a-zA-Z]+") && Kardiotechnikerkontakt.getText().replaceAll(" ","").matches("[a-zA-Z]+") &&
            Kardiotechnikerpersonalnummer.getText().replaceAll(" ","").matches("[0-9]+"))
            {
                a = Integer.parseInt(Kardiotechnikerpersonalnummer.getText());
                Main.verwalter.speicherKardiotechniker(Kardiotechnikername.getText(),  a, Kardiotechnikerkontakt.getText());
                Verwaltung();
            }

            if(Kardiotechnikername.getText().matches("[a-zA-Z]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Namensfeld!");
                alert.setContentText("Bitte nur Buchstaben eingeben");

                alert.showAndWait();
                Kardiotechnikername.clear(); 

            }
            else if(Kardiotechnikerkontakt.getText().matches("[a-zA-Z]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Kontaktfeld!");
                alert.setContentText("Bitte nur Buchstaben eingeben");

                alert.showAndWait();
                Kardiotechnikerkontakt.clear(); 
            }

            else if(Kardiotechnikerpersonalnummer.getText().matches("[0-9]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Personalnummerfeld!");
                alert.setContentText("Bitte nur Zahlen eingeben");

                alert.showAndWait();
                Kardiotechnikerpersonalnummer.clear();

            }
        }

    }

    @FXML
    public void OPhinzufügen() throws Exception
    {   int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        if(OPNamePatient.getText() == null || OPNamePatient.getText().trim().isEmpty() || OPAlterPatient.getText() == null ||OPAlterPatient.getText().trim().isEmpty()
        || OPGesundheitszustand.getText() == null || OPGesundheitszustand.getText().trim().isEmpty() ||OPAnzahlAerzte.getText() == null || OPAnzahlAerzte.getText().trim().isEmpty() 
        || Arztfachrichtung.getText() == null || Arztfachrichtung.getText().trim().isEmpty() 
        ||OPAnzahlSchwestern.getText() == null || OPAnzahlSchwestern.getText().trim().isEmpty() 
        ||OPAnzahlKardiotechniker.getText() == null || OPAnzahlKardiotechniker.getText().trim().isEmpty() 
        ||OPDauer.getText() == null || OPDauer.getText().trim().isEmpty() 
        ||OPDringlichkeit.getText() == null || OPDringlichkeit.getText().trim().isEmpty() )
        {
            warningDaten(); 
        }
        else
        {
            if(OPNamePatient.getText().replaceAll(" ","").matches("[a-zA-Z]+") && OPGesundheitszustand.getText().replaceAll(" ","").matches("[a-zA-Z]+") &&
            OPAlterPatient.getText().replaceAll(" ","").matches("[0-150]+") && OPAnzahlAerzte.getText().replaceAll(" ","").matches("[2-4]+") && 
            OPAnzahlSchwestern.getText().replaceAll(" ","").matches("[1-4]+") &&
            OPAnzahlKardiotechniker.getText().replaceAll(" ","").matches("[0-1]+") &&
            OPTyp.getText().replaceAll(" ","").matches("[a-zA-Z]+")&&
            OPDauer.getText().replaceAll(" ","").matches("[1-10]+")&&
            OPDringlichkeit.getText().replaceAll(" ","").matches("[1-3]+"))
            {
                a = Integer.parseInt(OPAlterPatient.getText());
                b = Integer.parseInt(OPAnzahlAerzte.getText());
                c = Integer.parseInt(OPAnzahlSchwestern.getText());
                d = Integer.parseInt(OPAnzahlKardiotechniker.getText());
                e = Integer.parseInt(OPDauer.getText());
                f = Integer.parseInt(OPDringlichkeit.getText());
                Main.verwalter.speicherOP(OPNamePatient.getText(),a, OPGesundheitszustand.getText(),  b, c, d, e, OPTyp.getText(), f);
                Verwaltung();

            }

            if(OPNamePatient.getText().matches("[a-zA-Z]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Namensfeld!");
                alert.setContentText("Bitte nur Buchstaben eingeben");

                alert.showAndWait();
                OPNamePatient.clear(); 

            }
            else if(OPAlterPatient.getText().matches("[0-130]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Rangfeld!");
                alert.setContentText("Bitte nur Zahlen zwischen 0 und 130 eingeben");

                alert.showAndWait();
                OPAlterPatient.clear(); 
            }
            else if(OPGesundheitszustand.getText().matches("[a-zA-Z]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Kontaktfeld!");
                alert.setContentText("Bitte nur Buchstaben eingeben");

                alert.showAndWait();
                OPGesundheitszustand.clear(); 
            }
            else if(OPAnzahlAerzte.getText().matches("[1-4]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Rangfeld!");
                alert.setContentText("Bitte nur Zahlen zwischen 1 und 4 eingeben");

                alert.showAndWait();
                OPAnzahlAerzte.clear(); 
            }
            else if(OPAnzahlSchwestern.getText().matches("[1-4]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Rangfeld!");
                alert.setContentText("Bitte nur Zahlen zwischen 1 und 4 eingeben");

                alert.showAndWait();
                OPAnzahlSchwestern.clear(); 
            }
            else if(OPAnzahlKardiotechniker.getText().matches("[0-1]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Rangfeld!");
                alert.setContentText("Bitte nur die Zahlen 0 oder 1 eingeben");

                alert.showAndWait();
                OPAnzahlKardiotechniker.clear(); 
            }
            else if(OPDauer.getText().matches("[1-10]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Rangfeld!");
                alert.setContentText("Bitte nur Zahlen zwischen 1 und 10 eingeben");

                alert.showAndWait();
                OPDauer.clear(); 
            }
            else if(OPTyp.getText().matches("[a-zA-Z]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Fachrichtungsfeld!");
                alert.setContentText("Bitte nur Buchstaben eingeben");

                alert.showAndWait();
                OPTyp.clear(); 
            }
            else if(OPDringlichkeit.getText().matches("[1-3]+")==false)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Achtung");
                alert.setHeaderText("Falsche Eingabe im Personalnummerfeld!");
                alert.setContentText("Bitte nur Zahlen zwischen 1 und 3 eingeben");

                alert.showAndWait();
                OPDringlichkeit.clear();

            }
        }
    }

    @FXML
    public void ArztlöschenSub()
    {   
        try{

            FXMLLoader loader = new FXMLLoader(Main.class.getResource("ArztlöschenSub.fxml"));
            HBox pane = loader.load();

            main.substage = new Stage();
            main.substage.setMinHeight(200.00);
            main.substage.setMinWidth(300.00);

            main.substage.setTitle("Arzt löschen");

            MainWindowController mainWindowController = loader.getController();
            mainWindowController.setMain(main);
            Scene scene = new Scene(pane);

            main.substage.initModality(Modality.APPLICATION_MODAL);

            main.substage.setScene(scene);
            main.substage.show();

        } 
        catch(IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    public void Arztlöschen()
    {

        int a;

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Achtung");
        alert.setHeaderText("Notfallkontakt wird unwiderruflich gelöscht");
        alert.setContentText("Bitte bestätigen");

        Optional<ButtonType> result = alert.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK) 
        {
            if(Arztlöschenpersonalnummer.getText() == null || Arztlöschenpersonalnummer.getText().trim().isEmpty() )
            {
                warningDaten(); 
            }
            else
            {
                a = Integer.parseInt(Arztlöschenpersonalnummer.getText());
                Main.verwalter.ArztDatenLoeschen(a);
               
              Arztlöschenpersonalnummer.clear(); 
            }
        }
    }
    
    @FXML
    public void SchwesterlöschenSub()
    {   
        try{

            FXMLLoader loader = new FXMLLoader(Main.class.getResource("SchwesterlöschenSub.fxml"));
            HBox pane = loader.load();

            main.substage = new Stage();
            main.substage.setMinHeight(200.00);
            main.substage.setMinWidth(300.00);

            main.substage.setTitle("Schwester löschen");

            MainWindowController mainWindowController = loader.getController();
            mainWindowController.setMain(main);
            Scene scene = new Scene(pane);

            main.substage.initModality(Modality.APPLICATION_MODAL);

            main.substage.setScene(scene);
            main.substage.show();

        } 
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    @FXML
    public void Schwesterlöschen()
    {

        int a;

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Achtung");
        alert.setHeaderText("Notfallkontakt wird unwiderruflich gelöscht");
        alert.setContentText("Bitte bestätigen");

        Optional<ButtonType> result = alert.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK) 
        {
            if(Schwesterlöschenpersonalnummer.getText() == null || Schwesterlöschenpersonalnummer.getText().trim().isEmpty() )
            {
                warningDaten(); 
            }
            else
            {
                a = Integer.parseInt(Schwesterlöschenpersonalnummer.getText());
                Main.verwalter.SchwesterDatenLoeschen(a);

            }
        }
    }
    
    @FXML
    public void KardiotechnikerlöschenSub()
    {   
        try{

            FXMLLoader loader = new FXMLLoader(Main.class.getResource("KardiotechnikerlöschenSub.fxml"));
            HBox pane = loader.load();

            main.substage = new Stage();
            main.substage.setMinHeight(200.00);
            main.substage.setMinWidth(300.00);

            main.substage.setTitle("Kardiotechniker löschen");

            MainWindowController mainWindowController = loader.getController();
            mainWindowController.setMain(main);
            Scene scene = new Scene(pane);

            main.substage.initModality(Modality.APPLICATION_MODAL);

            main.substage.setScene(scene);
            main.substage.show();

        } 
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    @FXML
    public void Kardiotechnikerlöschen()
    {

        int a;

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Achtung");
        alert.setHeaderText("Notfallkontakt wird unwiderruflich gelöscht");
        alert.setContentText("Bitte bestätigen");

        Optional<ButtonType> result = alert.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK) 
        {
            if(Kardiotechnikerlöschenpersonalnummer.getText() == null || Kardiotechnikerlöschenpersonalnummer.getText().trim().isEmpty() )
            {
                warningDaten(); 
            }
            else
            {
                a = Integer.parseInt(Kardiotechnikerlöschenpersonalnummer.getText());
                Main.verwalter.KardiotechnikerDatenLoeschen(a);

            }
        }
    }
    
     @FXML
    public void RaumSub()
    {   
        try{

            FXMLLoader loader = new FXMLLoader(Main.class.getResource("RaumSub.fxml"));
            HBox pane = loader.load();

            main.substage = new Stage();
            main.substage.setMinHeight(200.00);
            main.substage.setMinWidth(300.00);

            main.substage.setTitle("Raum hinzufügen");

            MainWindowController mainWindowController = loader.getController();
            mainWindowController.setMain(main);
            Scene scene = new Scene(pane);

            main.substage.initModality(Modality.APPLICATION_MODAL);

            main.substage.setScene(scene);
            main.substage.show();

        } 
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    @FXML
    public void Raum()
    {
         if(Arztlöschenpersonalnummer.getText() == null || Arztlöschenpersonalnummer.getText().trim().isEmpty() )
            {
                warningDaten(); 
            }
            else
            {
                Main.verwalter.Raumzuweisen(OPNamePatient.getText());

            }
        
        
    }
    
}

