
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
     * Kosntruktor für die Klasse Raum 
     */
    public Raum(int Raumnummer, boolean FreiR)
    {
        this.Raumnummer = Raumnummer; // Raumnummer wird auf Raum festgelegt
        this.FreiR = FreiR;
    }
    
    /**
     * Satndardkonstruktor für die Klasse Raum
     */
    public Raum()
    {
        Raumnummer = 4;
        FreiR = true;
    }

    /**
     * Set-Methode der Raumnummer
     *
     * @param Raumnummer
     *
     */
    public void setRaumnummer(int Raumnummer)
    {
        this.Raumnummer = Raumnummer;
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
     * Get-Mathode von FreiR (Verfügbarkeit)
     * 
     * @return FreiR
     */
    public boolean getFreiR ()
    {
        return FreiR;
    }
}

