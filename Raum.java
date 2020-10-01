
/**
 * In dieser Klasse werden die Atribute der Klasse Raum definiert. Dabei werden die Raumnummern und die Verfügbarkeit festgelegt. 
 *
 * @author Nicolas Fix, Erwin Malsam
 * @version 01.10.2020, 1.1
 */
public class Raum
{
    private int Raumnummer; // Die Raumnummer der einzelnen OP-Raeume
    private boolean FreiR; // Die Verügbarkeit der OP-Raeume
    /**
     * Konstruktor für Objekte der Klasse Raum 
     */
    public Raum(int Raumnummer, boolean FreiR)
    {
        this.Raumnummer = Raumnummer; // Raumnummer wird auf Raum festgelegt
        this.FreiR = FreiR;
    }
    
    /**
     * Standardkonstruktor für die Objekte der Klasse Raum mit ausgedachten Werten
     */
    public Raum()
    {
        Raumnummer = 4;
        FreiR = true;
    }

    /**
     * Set-Methode der Raumnummer 
     * 
     * Es gibt nur 6 OP-Räume, diese Methode prüft das keine Raumnummer < 1 und keine Raumnummer > 6 eingegeben werden können.
     * Bei falscher Eingabe wird durch eine Bildschirmausgabe darauf hingewiesen.
     *
     * @param Raumnummer gibt die Raumnummer an
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
     * Set-Methode von FreiR (Verfügbarkeit)
     * 
     * @param FreiR
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

