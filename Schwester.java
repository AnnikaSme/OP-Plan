
/**
 * Hier werden die Attribute der Schwestern definiert
 * 
 * @author (Lilli Stoffels, Annika Smetaczko) 
 * @version (30.09.2020, 1.0)
 */
public class Schwester extends Personal
{
    private int Station; //Station auf der die Schwester arbeitet, Chirurgie=1, Kinderstation = 2, Herzstation = 3, Innere Medizin = 4

     /**
     * Konstruktor für Objekte der Klasse Schwester
     */
    public Schwester(int Station, String Name, int Personalnummer, String Arbeitszweig, String Kontakt)
    {
        super(Name, Personalnummer, Arbeitszweig, Kontakt);     //Arbeitszweig Konstant auf Schwester setzen!!!
         SetStation(Station);
    }

    /**
     * Set-Methode für Station
     * 
     * @param  Station
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
     * Get-Methode für Station
     * 
     * @return    Station
     */
    public int GetStation()
    {
        return Station;
    }

}