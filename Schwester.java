
/**
 * Diese Klasse Schwester ist eine vererbte Klassse der abstrakten Klasse Personal.
 * Die Klasse definiert die Schwester mit Name, Personalnummer, Arbeitszweig, Kontakt und Station.
 * Es gibt 4 Stationen: Chirurgie=1, Kinderstation = 2, Herzstation = 3, Innere Medizin = 4.
 * Der Arbeitszweig ist "Schwester"
 * 
 * @author Lilli Stoffels, Annika Smetaczko
 * @version 01.10.2020, 1.1
 */
public class Schwester extends Personal
{
    private int Station; //Station auf der die Schwester arbeitet, Chirurgie=1, Kinderstation = 2, Herzstation = 3, Innere Medizin = 4

     /**
     * Konstruktor für Objekte der Klasse Schwester. 
     * Die Attribute der abstrakten Klasse sind geerbt. 
     * @param Station Station der Schwester
     * @param Name Name der Schwester
     * @param Personalnummer Personalnummer der Schwester
     * @param Kontakt Kontakt der Schwester
     */
    public Schwester(int Station, String Name, int Personalnummer, String Kontakt)
    {
        super(Name, Personalnummer, "Schwester", Kontakt);    // Arbeitszweig wird fest auf Schwester festgelegt. 
        SetStation(Station);
    }

    /**
     * Standardkonstruktor der Klasse Schwester mit ausgedachten Werten. 
     */
    public Schwester()
    {
        super("Mayer", 291736, "Schwester", "mayer.schwester@perfecthospital.de");     
        this.Station = 3;
    }
    
    /**
     * Set-Methode für die Station. Es gibt nur 4 Stationen. Diese Methode prüft, dass keine Stationen <1 und >4 eingegeben werden.
     * Bei ungültiger Eingabe wird mit einer Bildschirmausgabe darauf hingewiesen.
     * 
     * @param  Station  Es gibt 4 Stationen, welche mit Nummern gekennzeichnet sind: Chirurgie=1, Kinderstation=2, Herzstation=3, Innere Medizin=4
     */
    public void SetStation(int Station)
    {
        if (Station < 1 || Station > 4)   //Es gibt nur die Stationen Chirurgie=1, Kinderstation = 2, Herzstation = 3, Innere Medizin = 4
        { 
            System.out.println("Station existiert nicht!");           //Exception muss da gemacht werden!
        }
        else
        {this.Station = Station;
    }
}
    
    /**
     * Get-Methode für Station gibt die Informationen 
     * 
     * @return    Station   (als Ziffer, die für eine bestimmte Station steht)
     */
    public int GetStation()
    {
        return Station;
    }

}