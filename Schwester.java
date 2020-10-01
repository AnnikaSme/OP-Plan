
/**
 * In dieser Klasse werden die Schwestern mit Name, Personalnummer, Arbeitszweig, Kontakt und Station festgelegt. 
 * 
 * @author Lilli Stoffels, Annika Smetaczko
 * @version 30.09.2020, 1.0
 */
public class Schwester extends Personal
{
    private int Station; //Station auf der die Schwester arbeitet, Chirurgie=1, Kinderstation = 2, Herzstation = 3, Innere Medizin = 4

     /**
     * Konstruktor für Objekte der Klasse Schwester, die Attribute der abstrakten Klasse werden vererbt. 
     */
    public Schwester(int Station, String Name, int Personalnummer, String Kontakt)
    {
        super(Name, Personalnummer, "Schwester", Kontakt);    // Arbeitszweig wird fest auf Schwester festgelegt. 
        SetStation(Station);
    }

    /**
     * Set-Methode für die Station. Es gibt nur 4 Stationen und dementsprechend ist die Eingabe <0 und >4 ungültig.
     * Auf ungültige Eingabe wird mit Ausgabe auf dem Bildschirm hingewiesen.
     * 
     * @param  Station  Es gibt 4 Stationen welche mit Nummern gekennzeichnet sind: Chirurgie=1, Kinderstation=2, Herzstation=3, Innere Medizin=4
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
     * @return    Station   
     */
    public int GetStation()
    {
        return Station;
    }

}