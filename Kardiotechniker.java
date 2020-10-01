
/**
 * Beschreiben Sie hier die Klasse Kardiotechniker.
 * 
 * @author Lilli Stoffels, Annika Smetaczko
 * @version 01.10.2020, 1.1
 */
public class Kardiotechniker extends Personal
{
    /**
     * Konstruktor für Objekte der Klasse KT
     */
    public Kardiotechniker( String Name, int Personalnummer, String Kontakt)
    {
        super(Name, Personalnummer, "Kardiotechniker", Kontakt);     // Arbeitszweig wird fest auf Kardiotechniker festgelegt. 
         
    }
    
     /**
     * Konstruktor für Objekte der Klasse KT
     */
    public Kardiotechniker( )
    {
        super("Müller", 3999302, "Kardiotechniker", "müller.Kardiotechniker@Perfecthospital.de");    
    }
}
