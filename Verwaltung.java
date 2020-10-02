
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
    //private Personal[] personal;


    /**
     * Konstruktor der Verwaltung, welcher die OP-Räume in einem Array der Länge 6 speichert und erzeugt drei ArryList (Arzt, Schwester, Kardiotechniker).
     *
     */
    public Verwaltung () throws Exception
    {
        raeume = new Raum [5];  //Array mit 6 Speicherplätze für die 6 Räume wird erzeugt.
        for (int i=0; i<raeume.length; i++)     //Befüllung des Arrays
        {   
            int a = 1;
            raeume [i] = new Raum (a, true);
            a++;
        }

        personalarzt=new ArrayList<Arzt>();
        personalschwester=new ArrayList<Schwester>();
        personalkardiotechniker=new ArrayList<Kardiotechniker>();
        operationsliste=new ArrayList<OP>();

        /*
        personal = new Personal[3];
        personal[0] = personalarzt;
        personal[1] = personalschwester;
        personal[2] = personalkardiotechniker;
         */ 
    }

    public void speicherPersonalarzt(String Fachrichtung, int Rang, String Name, int Personalnummer, String Kontakt) throws Exception
    {
        Arzt b = new Arzt( Fachrichtung,  Rang,  Name,  Personalnummer, Kontakt);
        boolean ans = personalarzt.contains(b);
        if(ans==true)
        {
            System.out.println("Diese Personalnummer existiert schon");
        }
        else
        {
            personalarzt.add(b);
        }

    }

    public void speicherSchwester(int Station, String Name, int Personalnummer, String Kontakt) throws Exception
    {
        Schwester b = new Schwester( Station, Name,  Personalnummer, Kontakt);
        personalschwester.add(b);
    }

    public void speicherKardiotechniker( String Name, int Personalnummer, String Kontakt)
    {
        Kardiotechniker b = new Kardiotechniker(  Name,  Personalnummer, Kontakt);
        personalkardiotechniker.add(b);
    }

    public void speicherOP(String NamePatient,int AlterPatient, String Gesundheitszustand, int AnzahlAerzte, int AnzahlSchwester, int AnzahlKT, int Dauer, String OPTyp, int Dringlichkeit)throws Exception
    {
        OP b = new OP( NamePatient, AlterPatient, Gesundheitszustand, AnzahlAerzte, AnzahlSchwester, AnzahlKT, Dauer, OPTyp, Dringlichkeit );
        operationsliste.add(b);
    }

    public void PersonalDatenLoeschen(int Personalnummer) //Die Daten zu einer bestimmten Person des Personales sollen gelöscht werde. Gesucht wird über die Personalnummer.
    {
        Integer p = new Integer (Personalnummer);
        String gesuchtA = p.toString();
        boolean gefunden = true;
        int i = 0;
        while (i<personalarzt.size() && !gefunden)
        {
            gefunden = gesuchtA.equals(personalarzt.get(i));
            i++;
        }
        if (i<personalarzt.size())
        {
            personalarzt.remove(i);
        }
        else
        {
            System.out.println("Diese Personalnummer ist nicht in der Datenbank");      // Exceptions hinzufügen!
        }
    }

    public void OpDatenLöschen() //Alle Daten aus der OP-Array-List sollen gelöscht werden.
    {
        int i = 0;
        while (i<operationsliste.size())
        {
            operationsliste.remove(i);
            i++;
        }
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
