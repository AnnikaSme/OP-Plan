
/**
 * Das ist die Klasse Raum
 * 
 *
 * @author (Nicolas Fix, Erwin Malsam)
 * @version (30.9.2020, 1.0)
 */
public class Raum
{
    private int Raumnummer;
    private boolean FreiR;
    /**
     * Kosntruktor der Klasse Raum
     */
    public Raum(int Raumnummer, boolean FreiR)
    {
        this.Raumnummer = Raumnummer;
        this.FreiR = FreiR;
    }
    public Raum()
    {
        Raumnummer = 4;
        FreiR = true;
    }

    /**
     * Get und Set-Methode der Raumnummer
     *
     * 
     *
     */
    public void setRaumnummer(int Raumnummer)
    {
        this.Raumnummer = Raumnummer;
    }
    public int getRaumnummer ()
    {
        return Raumnummer;
    }
    /**
     * Get und Set-Methode von FreiR
     */
    public void setFreiR (boolean FreiR)
    {
        this.FreiR = FreiR;
    }
    public boolean getFreiR ()
    {
        return FreiR;
    }
}

