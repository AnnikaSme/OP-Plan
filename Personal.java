
/**
 * Diese Klasse Personal ist eine  abstrakten Klasse, die ihre Attribute an die Klassen Arzt, Schwester und Kardiotechniker weitervererbt.
 * Die Klasse definiert das Personal mit Name, Personalnummer, Arbeitszweig, Kontakt.
 * 
 * @author Lilli  Stoffels, Annika Smetaczko
 * @version 01.10.2020, 1.1
 */
 abstract public  class Personal //Attribute werden mit protected geschrieben um von den vererbten Klassen darauf zuzugreifen.
{
    
    protected String Name;        
    protected int Personalnummer;   
    protected String Arbeitszweig;  
    protected String Kontakt;    
    
    

    /**
     * Konstruktor für Objekte der Klasse Personals
     
     * @param Name Name des Personals
     * @param Personalnummer Personalnummer des Personals
     * @param Kontakt Kontakt des Personals
      */
    public Personal(String Name, int Personalnummer, String Arbeitszweig, String Kontakt)
    {
        SetName(Name);
        SetPersonalnummer(Personalnummer);
        SetArbeitszweig(Arbeitszweig);
        SetKontakt(Kontakt);
        
    }
    
    /**
     * Standardkonstruktor der Klasse Personal mit ausgedachten Werten.
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
     * @param Name  Name des Personals
     */
    public void SetName(String Name)
    {
        this.Name = Name;
    }  
    
    /**
     * Set-Methode für Personalnummer
     * 
     * @param  Personalnummer   Personalnummer des Personals
     */
    public void SetPersonalnummer(int Personalnummer)
    {
        this.Personalnummer = Personalnummer;
    }
    
    /**
     * Set-Methode für Arbeitszweig
     * 
     * @param Arbeitszweig Arbeitszweig des Personals
     */
    public void SetArbeitszweig(String Arbeitszweig)
    {
        this.Arbeitszweig = Arbeitszweig;
    }
    
    /**
     * Set-Methode für Kontakt
     * 
     * @param  Kontakt Kontakt des Personals
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
