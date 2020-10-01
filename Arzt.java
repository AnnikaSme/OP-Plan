
/**
 * Beschreiben Sie hier die Klasse Arzt.
 * 
 * @author (Lilli Stoffels, Annika Smetaczko) 
 * @version (30.09.2020 1.0)
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
        super(Name, Personalnummer, "Arzt", Kontakt);  
        
        SetFachrichtung(Fachrichtung);
        SetRang(Rang);
    }

    /**
     * Set-Methode für Fachrichtung
     * 
     * @param  Fachrichtung
     */
    public void SetFachrichtung(String Fachrichtung)
    {
        this.Fachrichtung = Fachrichtung;
    }
    
    /**
     * Get-Methode für Fachrichtung
     * 
     * @return    Fachrichtung
     */
    public String GetFachrichtung()
    {
        return Fachrichtung;
    }

 /**
     * Set-Methode für Rang
     * 
     * @param  Rang
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
     * Get-Methode für Rang
     * 
     * @return   Rang
     */
    public int GetRang()
    {
        return Rang;
    }
}
