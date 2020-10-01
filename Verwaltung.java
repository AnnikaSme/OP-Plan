
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
    private ArrayList<String>personalarzt;
    
    
   /**
    * Konstriktor der Verwaltung, welcher die OP-Räume der einem Array der länge 6 speichert
    *
    */
   public Verwaltung ()
    {
        raeume = new Raum [5];
        for (int i=0; i<raeume.length; i++)
        {   
            int a = 1;
            raeume [i] = new Raum (a, true);
            a++;
        }
       //personalarzt=new ArrayList<String>();
    }
    /*public void speicherpersonalarzt ()
    {
        personalarzt.add();
    }
   
    /**
     *
     */
    /*public String DatenExportieren ()
    {
       return Daten
    }
    public String DatenLoeschen ()
    {
        get.
    }
    public int Raumzuweisen ()
    {
        get
    }
    public int Zeitzuweisung()
    {
        get
    }
    public String Eintragen ()
    {
        return 
    }
    public String getArrayList ()
    {
        private ArrayList<String>=new ArrayList<String>();
    }*/
}
