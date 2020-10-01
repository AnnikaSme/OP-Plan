
/**
 * Diese Klasse Kardiotechniker ist eine vererbte Klasse der abstrakten Klasse Personal.
 * Die Klasse definiert den Kardiotechniker mit Name, Personalnummer und Kontakt. 
 * Der Arbeitszweig ist "Kardiotechniker".
 * 
 * @author Lilli Stoffels, Annika Smetaczko
 * @version 01.10.2020, 1.1
 */
public class Kardiotechniker extends Personal
{
    /**
     * Konstruktor für Objekte der Klasse Kardiotechniker
     * Die Attribute der abstrakten Klasse sind geerbt.
     * @param Name Name des Kardiotechnikers
     * @param Personalnummer Personalnummer des Kardiotechnikers
     * @param Kontakt Kontakt des Kardiotechnikers
     */
    public Kardiotechniker( String Name, int Personalnummer, String Kontakt)
    {
        super(Name, Personalnummer, "Kardiotechniker", Kontakt);     // Arbeitszweig wird fest auf Kardiotechniker festgelegt. 
         
    }
    
     /**
     * Standardkonstruktor der Klasse Kardiotechniker mit ausgedachten Werten.
     */
    public Kardiotechniker( )
    {
        super("Müller", 3999302, "Kardiotechniker", "müller.Kardiotechniker@Perfecthospital.de");    
    }
}
