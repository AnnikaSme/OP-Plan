
/**
 * Die Klasse Raum definiert den Raum mit Raummnummer, FreiR. 
 * Es gibt nur 6 OP-Räume.
 * @author Nicolas Fix, Erwin Malsam
 * @version 01.10.2020, 1.1
 */
public class Raum
{
    private int Raumnummer; // Die Raumnummer der einzelnen OP-Raeume
    private boolean FreiR; // Die Verügbarkeit der OP-Raeume
    /**
     * Konstruktor für Objekte der Klasse Raum.
     * @param Raumnummer Raumnummer des Raumes
     * @param FreiR Verfügbarkeit des Raumes
     */
    public Raum(int Raumnummer, boolean FreiR)
    {
        this.Raumnummer = Raumnummer; // Raumnummer wird auf Raum festgelegt
        this.FreiR = FreiR;
    }
    
    /**
     * Standardkonstruktor der Klasse Raum mit ausgedachten Werten.
     */
    public Raum()
    {
        Raumnummer = 4;
        FreiR = true;
    }

    /**
     * Set-Methode für Raumnummer.
     * 
     * Diese Methode prüft, dass keine Raumnummer < 1 und keine Raumnummer > 6 eingegeben können.
     * Bei ungültiger Eingabe wird mit einer Bildschirmausgabe darauf hingewiesen.
     *
     * @param Raumnummer Raumnummer des Raumes
     *
     */
    public void setRaumnummer(int Raumnummer)
    {
        if (Raumnummer < 1 || Raumnummer > 6) // Es gibt nur 6 OP-Räume
       {
           System.out.println ("Diese Raumnummer kann nicht vergeben werden"); // Exception muss gemacht werden
       }
       else
       {
        this.Raumnummer = Raumnummer;
       }
    }
    /**
     * Get-Methode Raumnummer
     * 
     * @return Raumnummer
     */
    public int getRaumnummer ()
    {
        return Raumnummer;
    }
    /**
     * Set-Methode für FreiR (Verfügbarkeit)
     * 
     * @param FreiR Verfügbarkeit des Raumes
     */
    public void setFreiR (boolean FreiR)
    {
        this.FreiR = FreiR;
    }
    /**
     * Get-Methode von FreiR (Verfügbarkeit)
     * 
     * @return FreiR
     */
    public boolean getFreiR ()
    {
        return FreiR;
    }
}

