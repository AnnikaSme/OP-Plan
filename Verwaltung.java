
/**
 * Die Klasse Verwaltung ist die Klasse, die alle weiteren Klassen verwaltet. 
 * Hierbei werden die Räume in eine Array gespeichert und verwaltet.
 * Die Personalakten der Ärzte, Schwestern und Kardiotechniker werden in einzelnen ArrayListen verwaltet, welche in ein einem Array gespeichert sind.
 * 
 *
 * @author Nicolas Fix, Erwin Malsam, Sarah Huber, Nathalie Schatz, Lilli Stoffels, Annika Smetaczko
 * @version 13.10.2020, 0.0.6
 */

import java.util.ArrayList;
import java.io.*;

public class Verwaltung
{
    private Raum[] raeume;
    private ArrayList<Arzt>personalarzt;
    private ArrayList<Schwester>personalschwester;
    private ArrayList<Kardiotechniker>personalkardiotechniker;
    private ArrayList<OP>operationsliste;
    private ArrayList[] personal;
    public static Verwaltung verwalter;

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

        personal = new ArrayList[3];
        personal[0] = personalarzt;
        personal[1] = personalschwester;
        personal[2] = personalkardiotechniker;

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
            personalarzt.add(b);
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
        boolean ans = false;
        for(int i=0; i<personalschwester.size(); i++)
        {
            if(personalschwester.get(i).GetPersonalnummer()==b.GetPersonalnummer())
            {
                ans=true;
            }
        }

        if(ans==false)
        {
            personalschwester.add(b);
        }
        else
        {
            throw new IllegalArgumentException("Diese Personalnummer existiert schon");
        }

    }

    /**
     * In der Methode speicherKardiotechniker werden die Daten in die ArrayList personalkardiotechniker geschrieben. 
     * Die Daten werden von Hand eingegeben.
     * Mit der If-Bedingung wird getestet ob dieser Kardiotechniker schon existiert und wird mit einer Bildschirmausgabe zurückgemeldet.
     */
    public void speicherKardiotechniker( String Name, int Personalnummer, String Kontakt)
    {
        Kardiotechniker b = new Kardiotechniker(  Name,  Personalnummer, Kontakt);
        boolean ans = false;
        for(int i=0; i<personalkardiotechniker.size(); i++)
        {
            if(personalkardiotechniker.get(i).GetPersonalnummer()==b.GetPersonalnummer())
            {
                ans=true;
            }
        }

        if(ans==false)
        {
            personalkardiotechniker.add(b);
        }
        else
        {
            throw new IllegalArgumentException("Diese Personalnummer existiert schon");
        }

    }

    /**
     * In der Methode speicherOP werden die Daten in die ArrayList operationsliste geschrieben. 
     * Die Daten werden von Hand eingegeben.
     * Mit der If-Bedingung wird getestet ob diese OP schon existiert und wird mit einer Bildschirmausgabe zurückgemeldet.
     */
    public void speicherOP(String NamePatient, int AlterPatient, String Gesundheitszustand, int AnzahlAerzte, int AnzahlSchwester, int AnzahlKT, int Dauer, String OPTyp, int Dringlichkeit)throws Exception
    {
        OP b = new OP( NamePatient, AlterPatient, Gesundheitszustand, AnzahlAerzte, AnzahlSchwester, AnzahlKT, Dauer, OPTyp, Dringlichkeit);
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
        while (j<operationsliste.size() && !gefunden)
        {
            gefunden = NamePatient.equals(operationsliste.get(j));
            j++;
        }
        if (j<operationsliste.size())
        { 
            if(Raumsuche()!=null)
            {
                operationsliste.get(j).setRaum(Raumsuche());
                return operationsliste.get(j).getRaum();
            }
            else
            {
                throw new IllegalArgumentException("Kein freier Raum mehr zur Verfügung");
            }
        }
        else
        {
            throw new IllegalArgumentException("Diese OP ist nicht in der Datenbank");
        }
    }

    // Diese Methode Zeitzuweisung() wird in der Version nicht verwendet, da nur eine OP pro Raum pro Tag eingeplant wird.
    
    ///**
     // * In der Methode Zeitzuweisung wird die Zeit einer OP zugewiesen. 
     // * Rückgegeben wird der entsprechende Timeslot.
     // **/
    // public int Zeitzuweisung()
    // {
        // return 2;
    // }

    /**
     * In der Methode Eintragen wird mit dem Eintragen einer Person in einer OP verwaltet. 
     * Zurückgegeben werden die Daten des Personals, der OP, der Zeit und des Raums in Form eines Strings.
     **/
    public void Eintragen (int Personalnummer, String NamePatient) throws Exception
    {
        Integer p = new Integer (Personalnummer);
        String gesuchtA = p.toString();
        boolean gefunden = true;
        int i = 0;
        while (i<personalarzt.size() && !gefunden)
        {
            gefunden = gesuchtA.equals(personalarzt.get(i));
            i++;
            if(i>= personalarzt.size())
            {
                throw new Exception("Dieser Arzt existiert nicht.");
            }
        }
        if (i<personalarzt.size())
        {
            String n = new String (NamePatient);
            gefunden = true;
            int j = 0;
            while (j<operationsliste.size() && !gefunden)
            {
                gefunden = gesuchtA.equals(operationsliste.get(j));
                j++;
            }

            if (j<operationsliste.size())
            {
                operationsliste.get(j).setAnzahlAerzte(operationsliste.get(j).getAnzahlAerzte()-1);

            }
            else
            {
                System.out.println("Diese OP existiert noch nicht");
            }
        }
        else 
        {
            while (i<personalschwester.size() && !gefunden)  
            {
                gefunden = gesuchtA.equals(personalschwester.get(i));
                i++;
                if(i>= personalschwester.size())
            {
                throw new Exception("Dieser Schwester existiert nicht.");
            }
            }

            if (i<personalschwester.size())
            {
                String n = new String (NamePatient);
                gefunden = true;
                int j = 0;
                while (j<operationsliste.size() && !gefunden)
                {
                    gefunden = gesuchtA.equals(operationsliste.get(j));
                    j++;
                }

                if (j<operationsliste.size())
                {
                    operationsliste.get(j).setAnzahlSchwester(operationsliste.get(j).getAnzahlSchwester()-1);

                }
                else
                {
                    System.out.println("Diese OP existiert noch nicht");
                }
            }
            else
            {
                while (i<personalschwester.size() && !gefunden)  
                {
                    gefunden = gesuchtA.equals(personalkardiotechniker.get(i));
                    i++;
                    if(i>= personalschwester.size())
                    {
                        throw new Exception("Diese OP ist schon belegt");
                    }
                }

                if (i<personalkardiotechniker.size())
                {
                    String n = new String (NamePatient);
                    gefunden = true;
                    int j = 0;
                    while (j<operationsliste.size() && !gefunden)
                    {
                        gefunden = gesuchtA.equals(operationsliste.get(j));
                        j++;
                    }
                    if(j>= personalkardiotechniker.size())
                    {
                        throw new Exception("Diese OP ist schon belegt");
                    }
                    if (j<operationsliste.size())
                    {
                        operationsliste.get(j).setAnzahlKT(operationsliste.get(j).getAnzahlKT()-1);

                    }
                    else
                    {
                        System.out.println("Diese OP existiert noch nicht");
                    }
                }

                else
                {
                    System.out.println("Diese Personalnummer ist nicht in der Datenbank");      // Exceptions hinzufügen!
                }
            }
        }
    }

    /**
     * In der Methode DatenExportieren werden die Daten exportiert, sodass sie in Excel oder einer anderen Datenbank längerfristig gespeichert werden können. 
     **/
    public void DatenExportieren () // Oberfläche benötigt
    {
        try
        {
            FileOutputStream out = new FileOutputStream("test.txt");
            ObjectOutputStream oout = new ObjectOutputStream(out);
            oout.writeObject(verwalter);
            oout.close();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));
        }
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
    }

    public void DatenImportieren () //geht erst, wenn die Oberfläche vorhanden ist
    {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));)
        {
            Verwaltung verwalter = (Verwaltung)ois.readObject();  
        }  
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

}