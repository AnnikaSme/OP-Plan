
/**
 * Die Klasse Verwaltung ist die Klasse die alle weiteren Klassen verwaltet. 
 * Hierbei werden die Räume in eine Array gespeichert und verwaltet.
 * Die Personalakten der Ärzte, Schwestern und Kardiotechniker werden in einzelnen ArrayListen verwaltet, welche in ein einem Array gespeichert sind.
 * 
 *
 * @author Nicolas Fix, Erwin Malsam, Sarah Huber, Nathalie Schatz, Lilli Stoffels, Annika Smetaczko
 * @version 01.10.2020, 0.0.2
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
     * Konstruktor der Verwaltung, welcher die OP-Räume in einem Array der Länge 6 speichert.
     * Er erzeugt vier ArryList für die Daten des Arzts, der Schwester, des Kardiotechniker und der OP.
     * Das Array personal beinhaltet die ArrayLists personalarzt, personalschwester, personalkardiotechniker.
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

    /**
     * In der Methode speicherPersonalarzt werden die Daten in die ArrayList personalarzt geschrieben. 
     * Die Daten werden von Hand eingegeben.
     * Mit der If-Bedingung wird getestet ob dieser Arzt schon existiert und wird mit einer Bildschirmausgabe zurückgemeldet.
     */
    public void speicherPersonalarzt(String Fachrichtung, int Rang, String Name, int Personalnummer, String Kontakt) throws Exception
    {
        Arzt b = new Arzt( Fachrichtung,  Rang,  Name,  Personalnummer, Kontakt);
        boolean ans = false;
        for(int i=0; i<personalarzt.size(); i++)
        {
            if(personalarzt.get(i).GetPersonalnummer()==b.GetPersonalnummer())
            {
                ans=true;
            }
        }
        
        if(ans==false)
        {
              personalarzt.add(b);  //funktioniert noch nicht, Fehlermeldung wird nicht ausgegeben!
        }
        else
        {
            throw new IllegalArgumentException("Diese Personalnummer existiert schon");
        }
        
    }

    /**
     * In der Methode speicherSchwester werden die Daten in die ArrayList personalschwester geschrieben. 
     * Die Daten werden von Hand eingegeben.
     * Mit der If-Bedingung wird getestet ob diese Schwester schon existiert und wird mit einer Bildschirmausgabe zurückgemeldet.
     */
    public void speicherSchwester(int Station, String Name, int Personalnummer, String Kontakt) throws Exception
    {
        Schwester b = new Schwester( Station, Name,  Personalnummer, Kontakt);
        personalschwester.add(b);
    }

    /**
     * In der Methode speicherKardiotechniker werden die Daten in die ArrayList personalkardiotechniker geschrieben. 
     * Die Daten werden von Hand eingegeben.
     * Mit der If-Bedingung wird getestet ob dieser Kardiotechniker schon existiert und wird mit einer Bildschirmausgabe zurückgemeldet.
     */
    public void speicherKardiotechniker( String Name, int Personalnummer, String Kontakt)
    {
        Kardiotechniker b = new Kardiotechniker(  Name,  Personalnummer, Kontakt);
        personalkardiotechniker.add(b);
    }

    /**
     * In der Methode speicherOP werden die Daten in die ArrayList operationsliste geschrieben. 
     * Die Daten werden von Hand eingegeben.
     * Mit der If-Bedingung wird getestet ob diese OP schon existiert und wird mit einer Bildschirmausgabe zurückgemeldet.
     */
    public void speicherOP(String NamePatient,int AlterPatient, String Gesundheitszustand, int AnzahlAerzte, int AnzahlSchwester, int AnzahlKT, int Dauer, String OPTyp, int Dringlichkeit)throws Exception
    {
        OP b = new OP( NamePatient, AlterPatient, Gesundheitszustand, AnzahlAerzte, AnzahlSchwester, AnzahlKT, Dauer, OPTyp, Dringlichkeit );
        operationsliste.add(b);
    }

    /**
     * In der Methode PersonalDatenLoeschen wird per Eingabe der Personalnummer nach vorhandenen Daten mit der Personalnummer gesucht. 
     * Ist diese Personalnummer vorhanden wird dieser Datensatz gelöscht. Wenn nicht wird eine Fehlermeldung auf dem Bildschirm zurück gegeben.
     */
    public void PersonalDatenLoeschen(int Personalnummer) throws Exception//Die Daten zu einer bestimmten Person des Personales sollen gelöscht werde. Gesucht wird über die Personalnummer.
    {
        Integer p = new Integer (Personalnummer);
        String gesuchtA = p.toString();
        boolean gefunden = true;
        int i = 0;
        while (i<personalarzt.size() && !gefunden)  //Bisher funktioniert es nur für personalarzt. Um alle zu verwenden muss das auskommentierte Array personal fertig sein.
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
            throw new Exception("Diese Personalnummer ist nicht in der Datenbank");      // Exceptions hinzufügen!
        }
    }

    /**
     * In der Methode OPDatenLoeschen werden alle Daten in der operationsliste gelöscht. 
     * Sinn dahinter ist das Löschen am Ende eines Tages oder entsprechenden Zeitraums.
     **/
    public void OpDatenLoeschen() //Alle Daten aus der OP-Array-List sollen gelöscht werden.
    {
        int i = 0;
        while (i<operationsliste.size())
        {
            operationsliste.remove(i);
            i++;
        }
    }

    /**
     * In der Methode Raumsuche wird in den 6 Räumen nach einem freien Raum gesucht. Ist der Raum frei wird er zurückgegeben.
     * Ist kein Raum frei wird ein nullPointer zurückgegeben.
     **/
    public Raum Raumsuche()
    {
        int i = 0;
        while(i<raeume.length)
        {
            if(raeume[i].getFreiR() == true)
            {
                return raeume [i];
            }
        }
        return null;
    }
    
        public Raum Raumzuweisen (String NamePatient)
    {
        boolean gefunden = true;
        int j = 0;
        while (j<operationsliste.size() && !gefunden)  //Bisher funktioniert es nur für personalarzt. Um alle zu verwenden muss das auskommentierte Array personal fertig sein.
        {
            gefunden = NamePatient.equals(operationsliste.get(j));
            j++;
        }
        if (j<operationsliste.size())
        {
            
            OP.setRaum(Raumsuche());
        }
        else
        {
            System.out.println("Diese OP ist nicht in der Datenbank");      // Exceptions hinzufügen!
        }
        
        // if(raum==null)
        // {
            // return false;
        // }
        // else
        // {
            // raum=v.Raumsuche();
            // return true;    
        // } 
    }

    /**
     * In der Methode Zeitzuweisung wird die Zeit einer OP zugewiesen. 
     * Rückgegeben wird der entsprechende Timeslot.
     **/
    public int Zeitzuweisung()
    {
        return 2;
    }

    /**
     * In der Methode Eintragen wird mit dem Eintragen einer Person in einer OP verwaltet. 
     * Zurückgegeben werden die Daten des Personals, der OP, der Zeit und des Raums in Form eines Strings.
     **/
    public String Eintragen ()
    {
        return "Daten"; //Personal trägt sich zur OP ein und die Daten des Personals werden ausgegeben.
    }

    /**
     * In der Methode DatenExportieren werden die Daten exportiert, sodass sie in Excel oder einer anderen Datenbank längerfristig gespeichert werden können. 
     **/
    public String DatenExportieren ()
    {
        return "daten";      // Alle Daten zu einer Operation sollen ausgegeben werden. Zum langfristigen Speichern.
    }
}