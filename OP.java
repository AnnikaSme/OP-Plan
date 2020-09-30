
/**
 * Die Klasse definiert einen OP. Der OP wird beschrieben durch die Attribute.
 * 
 * @author (Sarah Huber, Nathalie Schatz)
 * @version (30.09.2020, 1.0)
 */
public class OP
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String NamePatient;
    private int AlterPatient;
    private String Gesundheitszustand;
    private int AnzahlAerzte;
    private int AnzahlSchwester;
    private int AnzahlKT;
    private int Dauer;
    private String OPTyp;
    private int Dringlichkeit; 
    

    /**
     * Konstruktor für Objekte der Klasse OP
     */
    public OP(String NamePatient,int AlterPatient, String Gesundheitszustand, int Anzahlaerzte, int AnzahlSchwester, int AnzahlKT, int Dauer, String OPTyp, int Dringlichkeit)
    {
        // Instanzvariable initialisieren
        this.NamePatient = NamePatient;
        this.AlterPatient = AlterPatient;
        this.Gesundheitszustand = Gesundheitszustand;
        this.AnzahlAerzte = AnzahlAerzte;
        this.AnzahlSchwester = AnzahlSchwester;
        this.AnzahlKT = AnzahlKT;
        this.Dauer = Dauer;
        this.OPTyp = OPTyp;
        this.Dringlichkeit = Dringlichkeit;
    }

    /**
     * Name des Patienten definieren
     * 
     * @param  N
     * @return        die Summe aus x und y
     */
    public void setNamePatient(String NamePatient)
    {
        // tragen Sie hier den Code ein
        this.NamePatient = NamePatient;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void setAlterPatient(int AlterPatient)
    {
        // tragen Sie hier den Code ein
        this.AlterPatient = AlterPatient;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void setGesundheitszustand(String Gesundheitszustand)
    {
        // tragen Sie hier den Code ein
        this.Gesundheitszustand = Gesundheitszustand;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void setAnzahlAerzte(int AnzahlAerzte)
    {
        // tragen Sie hier den Code ein
        this.AnzahlAerzte = AnzahlAerzte;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void setAnzahlSchwester(int AnzahlSchwester)
    {
        // tragen Sie hier den Code ein
        this.AnzahlSchwester= AnzahlSchwester;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void setAnzahlKT(int AnzahlKT)
    {
        // tragen Sie hier den Code ein
        this.AnzahlKT = AnzahlKT;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void setDauer(int Dauer)
    {
        // tragen Sie hier den Code ein
        this.Dauer = Dauer;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void setOPTyp(String OPTyp)
    {
        // tragen Sie hier den Code ein
        this.OPTyp = OPTyp;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void setDringlichkeit(int Dringlichkeit)
    {
        // tragen Sie hier den Code ein
        this.Dringlichkeit = Dringlichkeit;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public String getNamePatient()
    {
        // tragen Sie hier den Code ein
        return NamePatient;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int getAlterPatient()
    {
        // tragen Sie hier den Code ein
        return AlterPatient;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public String getGesundheitszustand()
    {
        // tragen Sie hier den Code ein
        return Gesundheitszustand;
    }
    
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int getAnzahlAerzte()
    {
        // tragen Sie hier den Code ein
        return AnzahlAerzte;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int getAnzahlSchwester()
    {
        // tragen Sie hier den Code ein
        return AnzahlSchwester;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int getAnzahlKT()
    {
        // tragen Sie hier den Code ein
        return AnzahlKT;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int getDauer()
    {
        // tragen Sie hier den Code ein
        return Dauer;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public String getOPTyp()
    {
        // tragen Sie hier den Code ein
        return OPTyp;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int getDringlichkeit()
    {
        // tragen Sie hier den Code ein
        return Dringlichkeit;
    }
    
      /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void Anlegen (String NamePatient, int AlterPatient, String Gesundheitszustand, int AnzahlAerzte, int AnzahlSchwester, int AnzahlKT, int Dauer, String OPTyp, int Dringlichkeit)
    {
        // tragen Sie hier den Code ein
        setNamePatient(NamePatient);
        setAlterPatient(AlterPatient);
        setGesundheitszustand(Gesundheitszustand);
        setAnzahlAerzte(AnzahlAerzte);
        setAnzahlSchwester(AnzahlSchwester);
        setAnzahlKT(AnzahlKT);
        setDauer(Dauer);
        setOPTyp(OPTyp);
        setDringlichkeit(Dringlichkeit);
    }
    
        /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public String Abrufen ()
    {
        // tragen Sie hier den Code ein
        String N = getNamePatient();
        int A = getAlterPatient();
        String G = getGesundheitszustand();
        int AA = getAnzahlAerzte();
        int AS = getAnzahlSchwester();
        int AK = getAnzahlKT();
        int D = getDauer();
        String O = getOPTyp();
        int Dr = getDringlichkeit();
        
        return  N.concat(newLine).concat(A).concat(newLine).concat(G).concat(newLine).concat(AA).concat(newLine).concat(AS).concat(newLine).concat(AK).concat(newLine).concat(D).concat(newLine).concat(O).concat(newLine).concat(Dr); 
    }
}
