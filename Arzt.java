
/**
 * Diese Klasse Arzt ist eine vererbte Klasse der abstrakten Klasse Personal.
 * Die Klasse definiert den Arzt mit Fachrichtung, Rang, Name, Personalnummer, Kontakt. Die Fachrichtungen können frei eingegeben werden.
 * Es gibt 4 Arztränge: Chefarzt=1, Oberarzt=2, Facharzt=3, Assistenzarzt=4.
 * Der Arbeitszweig ist "Arzt".
 * 
 * @author Lilli Stoffels, Annika Smetaczko
 * @version 01.10.2020, 1.1
 */
public class Arzt extends Personal
{
    
    private String Fachrichtung;  //Fachrichtung des Arztes, z.B. Anästhesist, Kardiologe, Chirurg...
    private int Rang;             //Rang des Arztes, Chefarzt = 1, Oberarzt = 2, Facharzt = 3,Assistenzarzt = 4

    /**
     * Konstruktor für Objekte der Klasse Arzt.
     * Die Attribute der abstrakten Klasse sind geerbt.
     * 
     * @param Fachrichtung  Fachrichtung des Arztes 
     * @param Rang  Rang des Arztes
     * @param Name Name des Arztes
     * @param Personalnummer Personalnummer des Arztes
     * @param Kontakt Kontakt des Arztes
     */
    public Arzt(String Fachrichtung, int Rang, String Name, int Personalnummer, String Kontakt)
    {
        super(Name, Personalnummer, "Arzt", Kontakt);  // Arbeitszweig wird fest auf Arzt festgelegt. 
        this.Fachrichtung = Fachrichtung;
        this.Rang = Rang;
    }
    
    /**
     * Standardkonstruktor der Klasse Arzt mit ausgedachten Werten.
     */
    public Arzt()
    {
        super("Willi", 12345, "Arzt", "willi.arzt@Perfecthospital.de"); 
        Fachrichtung = "Chirurg";
        Rang = 1;
    }


    /**
     * Set-Methode für Fachrichtung. Die Fachrichtung kann frei eingegeben werden. 
     * 
     * @param  Fachrichtung  Fachrichtung des Arztes 
     */
    public void SetFachrichtung(String Fachrichtung)
    {
        this.Fachrichtung = Fachrichtung;
    }
    
    /**
     * Get-Methode für Fachrichtung gibt Fachrichtung zurück.
     * 
     * @return    Fachrichtung
     */
    public String GetFachrichtung()
    {
        return Fachrichtung;
    }

 /**
     * Set-Methode für Rang. 
     * Diese Methode prüft, dass keine Ränge <1 oder >4 eingegeben werden. Bei ungültiger Eingabe wird mit einer Bildschirmausgabe darauf hingewiesen.
     * 
     * @param  Rang  Es gibt 4 Ränge, welche mit Nummern gekennzeichnet sind: Chefarzt=1, Oberarzt=2, Facharzt=3, Assistenzarzt=4.
     */
    public void SetRang(int Rang)
    {
        if (Rang < 1 || Rang > 4)   //Es gibt nur die Ränge: Chefarzt = 1, Oberarzt = 2, Facharzt = 3, Assistenzarzt = 4
        { 
            throw new IllegalArgumentException("Dieser Rang existiert nicht! Es gibt nur die Ränge 1 bis 4.");           //Exception --> Fehlerweitergabe
        }
        else
        {
            this.Rang = Rang;
        }
    }
  
    /**
     * Get-Methode für Rang gibt den Rang zurück. Chefarzt = 1, Oberarzt = 2, Facharzt = 3, Assistenzarzt = 4
     * 
     * @return   Rang  (als Ziffer, die für einen bestimmten Rang steht)
     */
    public int GetRang()
    {
        return Rang;
    }
}
