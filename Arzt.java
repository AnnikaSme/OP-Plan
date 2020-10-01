
/**
 * Die Klasse Arzt definiert den Arzt mit Fachrichtung, Rang, Name, Personalnummer, Kontakt. Die Fachrichtungen können frei eingegeben.
 * Es gibt 4 Arztränge: Chefarzt=1, Oberarzt=2, Facharzt=3, Assistenzarzt=4
 * 
 * @author Lilli Stoffels, Annika Smetaczko
 * @version 01.10.2020, 1.1
 */
public class Arzt extends Personal
{
    
    private String Fachrichtung;  //Fachrichtung des Arztes, z.B. Anästhesist, Kardiologe, Chirurg...
    private int Rang;             //Rang des Arztes, Chefarzt = 1, Oberarzt = 2, Facharzt = 3,Assistenzarzt = 4

    /**
     * Konstruktor für Objekte der Klasse Arzt
     */
    public Arzt(String Fachrichtung, int Rang, String Name, int Personalnummer, String Kontakt)
    {
        super(Name, Personalnummer, "Arzt", Kontakt);  // Arbeitszweig wird fest auf Arzt festgelegt. 
        SetFachrichtung(Fachrichtung);
        SetRang(Rang);
    }
    
    /**
     * Standardkonstruktor der Klasse Arzt mit ausgedachten Werten
     */
    public Arzt()
    {
        super("Willi", 12345, "Arzt", "willi.arzt@Perfecthospital.de"); 
        this.Fachrichtung = "Chirurg";
        this.Rang = 1;
    }


    /**
     * Set-Methode für Fachrichtung. Die Fachrichtung kann frei eingegeben werden. 
     * 
     * @param  Fachrichtung gibt die Fachrichtung an
     */
    public void SetFachrichtung(String Fachrichtung)
    {
        this.Fachrichtung = Fachrichtung;
    }
    
    /**
     * Get-Methode für Fachrichtung gibt Fachrichtung wieder.
     * 
     * @return    Fachrichtung
     */
    public String GetFachrichtung()
    {
        return Fachrichtung;
    }

 /**
     * Set-Methode für Rang. Es gibt nur 4 Ränge: Chefarzt=1, Oberarzt=2, Facharzt=3, Assistenzarzt=4.
     * Diese Methode prüft, dass keine Ränge <0 oder >4 eingegeben werden. Bei falscher Eingabe wird mit einer Bildschirmausgabe darauf hingewiesen.
     * 
     * @param  Rang beschreibt den Rang des Arzts
     */
    public void SetRang(int Rang)
    {
        if (Rang < 1 || Rang > 4)   //Es gibt nur die Ränge: Chefarzt = 1, Oberarzt = 2, Facharzt = 3, Assistenzarzt = 4
        { 
            System.out.println("Dieser Rang existiert nicht! Es gibt nur die Ränge 1 bis 4.");           //Exception muss da gemacht werden!
        }
        else
        {
            this.Rang = Rang;
        }
    }
  
    /**
     * Get-Methode für Rang gibt den Rang zurück
     * 
     * @return   Rang
     */
    public int GetRang()
    {
        return Rang;
    }
}
