
/**
 * Abstrakte Klasse Personal von der weitere Klassen vererbt werden.
 * 
 * @author Lilli  Stoffels, Annika Smetaczko
 * @version 01.10.2020, 1.1
 */
 abstract public  class Personal
{
    
    protected String Name;          // Nachname des Personals 
    protected int Personalnummer;   // Personalnummer
    protected String Arbeitszweig;  // Arbeitszweig des Personals: Arzt, Schwester oder Kardiotechniker
    protected String Kontakt;       // Kontaktdaten des Personals
    
    

    /**
     * Konstruktor für Objekte der Klasse Personal
     */
    public Personal(String Name, int Personalnummer, String Arbeitszweig, String Kontakt)
    {
        SetName(Name);
        SetPersonalnummer(Personalnummer);
        SetArbeitszweig(Arbeitszweig);
        SetKontakt(Kontakt);
        
    }
    
    /**
     * Konstruktor für Objekte der Klasse Personal
     */
    public Personal()
    {
        this.Name = "Schmidt";
        this.Personalnummer = 739203;
        this.Arbeitszweig = "Arzt";
        this.Kontakt = "schmidt.arzt@perfercthospital.de";
        
    }
    
    /**
     * Set-Methode für Name
     * 
     * @param Name
     */
    public void SetName(String Name)
    {
        this.Name = Name;
    }  
    
    /**
     * Set-Methode für Personalnummer
     * 
     * @param  Personalnummer   
     */
    public void SetPersonalnummer(int Personalnummer)
    {
        this.Personalnummer = Personalnummer;
    }
    
    /**
     * Set-Methode für Arbeitszweig
     * 
     * @param Arbeitszweig
     */
    public void SetArbeitszweig(String Arbeitszweig)
    {
        this.Arbeitszweig = Arbeitszweig;
    }
    
    /**
     * Set-Methode für Kontakt
     * 
     * @param  Kontakt
     */
    public void SetKontakt(String Kontakt)
    {
        this.Kontakt = Kontakt;
    }
    
    /**
     * Get-Methode für Name
     * 
     * @return   Name
     */
    public String GetName()
    {
        return Name;
    }
    
     /**
     * Get-Methode für Personalnummer
     * 
     * @return   Personalnummer
     */
    public int GetPersonalnummer()
    {
        return Personalnummer;
    }
    
     /**
     * Get-Methode für Arbeitszweig
     * 
     * @return   Arbeitszweig
     */
    public String GetArbeitszweig()
    {
        return Arbeitszweig;
    }
    
     /**
     * Get-Methode für Kontakt
     * 
     * @return   Kontakt
     */
    public String GetKontakt()
    {
        return Kontakt;
    }
    
}
