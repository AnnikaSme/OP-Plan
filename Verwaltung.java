
/**
 * Klasse Verwaltung
 *
 * @author Nicolas Fix, Erwin Malsam, Sarah Huber, Nathalie Schatz, Lilli Stoffels, Annika Smetaczko
 * @version 01.10.2020, 1.1
 */
import java.util.ArrayList;
public class Verwaltung
{
    private Raum[] raeume;
    private ArrayList<Arzt>personalarzt;
    private ArrayList<Schwester>personalschwester;
    private ArrayList<Kardiotechniker>personalkardiotechniker;
    private ArrayList<OP>operationsliste;

    /**
     * Konstruktor der Verwaltung, welcher die OP-Räume in einem Array der Länge 6 speichert und erzeugt drei ArryList (Arzt, Schwester, Kardiotechniker).
     *
     */
    public Verwaltung ()
    {
        raeume = new Raum [5];  //Array mit 6 Speicherplätze für die 6 Räume wird erzeugt.
        for (int i=0; i<raeume.length; i++)     //befüllung des Arrays
        {   
            int a = 1;
            raeume [i] = new Raum (a, true);
            a++;
        }

        personalarzt=new ArrayList<Arzt>();
        personalschwester=new ArrayList<Schwester>();
        personalkardiotechniker=new ArrayList<Kardiotechniker>();
        operationsliste=new ArrayList<OP>();
    }

    public void speicherPersonalarzt(String Fachrichtung, int Rang, String Name, int Personalnummer, String Kontakt)
    {
        Arzt b = new Arzt( Fachrichtung,  Rang,  Name,  Personalnummer, Kontakt);
        personalarzt.add(b);
    }

    public void speicherSchwester(int Station, String Name, int Personalnummer, String Kontakt)
    {
        Schwester b = new Schwester( Station, Name,  Personalnummer, Kontakt);
        personalschwester.add(b);
    }

    public void speicherKardiotechniker( String Name, int Personalnummer, String Kontakt)
    {
        Kardiotechniker b = new Kardiotechniker(  Name,  Personalnummer, Kontakt);
        personalkardiotechniker.add(b);
    }

    public void speicherOP(String NamePatient,int AlterPatient, String Gesundheitszustand, int AnzahlAerzte, int AnzahlSchwester, int AnzahlKT, int Dauer, String OPTyp, int Dringlichkeit)
    {
        OP b = new OP( NamePatient, AlterPatient, Gesundheitszustand, AnzahlAerzte, AnzahlSchwester, AnzahlKT, Dauer, OPTyp, Dringlichkeit );
        operationsliste.add(b);
    }

    public void PersonalDatenLoeschen(int Personalnummer) //Die Daten zu einer Bestimmten Person des Personales sollen gelöscht werde. Gesucht wird über die Personalnummer.
    {

    }

    public void OpDatenLöschen() //Alle Daten aus der OP-Array-List sollen gelöscht werden.
    {

    }

    public int Raumzuweisen ()
    {
        return 1;
    }

    public int Zeitzuweisung()
    {
        return 2;
    }

    public String Eintragen ()
    {
        return "Daten"; //Personal trägt sich zur OP ein und die Daten des Personals werden ausgegeben.
    }

    public String DatenExportieren ()
    {
        return "daten";      // Alle Daten zu einer Operation sollen ausgegeben werden. Zum langfristigen Speichern.ß
    }
}
