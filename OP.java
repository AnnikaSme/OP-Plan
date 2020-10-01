
/**
 * Die Klasse definiert einen OP. Der OP wird beschrieben durch die Attribute.
 * 
 * @author Sarah Huber, Nathalie Schatz
 * @version 01.10.2020, 1.1
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
     * Standartkonstruktor für Objekte der Klasse OP
     */
    public OP()
    {
        // Instanzvariable initialisieren
        NamePatient = "Miller";
        AlterPatient = 45;
        Gesundheitszustand = "Der Patient ist in einem schwachen Zustand.";
        AnzahlAerzte = 2;
        AnzahlSchwester = 3;
        AnzahlKT = 1;
        Dauer = 5;
        OPTyp = "Herzklappenrekonstruktion";
        Dringlichkeit = 2;
    }

    /**
     * Set-Methode Namen des Patienten
     * 
     * @param  NamePatient
     */
    public void setNamePatient(String NamePatient)
    {
        // tragen Sie hier den Code ein
        this.NamePatient = NamePatient;
    }
    
    /**
     * Set-Methode Alter des Patienten
     * 
     * @param  AlterPatient
     */
    public void setAlterPatient(int AlterPatient)
    {
        // tragen Sie hier den Code ein
        this.AlterPatient = AlterPatient;
        if (AlterPatient < 1 || AlterPatient > 4)   //Es gibt nur die Ränge: Chefarzt = 1, Oberarzt = 2, Facharzt = 3, Assistenzarzt = 4
        { 
            System.out.println("Dieser Rang existiert nicht! Es gibt nur die Ränge 1 bis 4.");           //Exception muss da gemacht werden!
        }
        else
        {
            this.Rang = Rang;
        }
    }
    
    /**
     * Set-Methode Gesundheitszustand des Patienten
     * 
     * @param  Gesundheitszustand
     */
    public void setGesundheitszustand(String Gesundheitszustand)
    {
        // tragen Sie hier den Code ein
        this.Gesundheitszustand = Gesundheitszustand;
    }
    
    /**
     * Set-Methode Anzahl der Ärzte 
     * 
     * @param  AnzahlAerzte
     */
    public void setAnzahlAerzte(int AnzahlAerzte)
    {
        // tragen Sie hier den Code ein
        this.AnzahlAerzte = AnzahlAerzte;
        if ( AnzahlAerzte < 2|| AnzahlAerzte > 4)   //Es müssen mindestens 2 und es können nur maximal 4 Aerzte an einer Operation teilnehmen.
        { 
            System.out.println("Dieser Rang existiert nicht! Es gibt nur die Ränge 1 bis 4.");           //Exception muss da gemacht werden!
        }
        else
        {
            this.AnzahlAerzte = AnzahlAerzte;
        }
    }
    
    /**
     * Set-Methode Anzahl der Schwestern
     * 
     * @param  AnzahlSchwester
     */
    public void setAnzahlSchwester(int AnzahlSchwester)
    {
        // tragen Sie hier den Code ein
        this.AnzahlSchwester= AnzahlSchwester;
    }
    
    /**
     * Set-Methode Anzahl der Kardiotechniker
     * 
     * @param  AnzahlKT Gibt die Anzahl der Kardiotechniker an.
     */
    public void setAnzahlKT(int AnzahlKT)
    {
        // tragen Sie hier den Code ein
        this.AnzahlKT = AnzahlKT;
    }
    
    /**
     * Set-Methode Dauer 
     * 
     * @param  Dauer Gibt die Dauer der Operation an.
     */
    public void setDauer(int Dauer)
    {
        // tragen Sie hier den Code ein
        this.Dauer = Dauer;
    }
    
    /**
     * Set-Methode OPTyp
     * 
     * @param  OPTyp Gibt den Typ der Operation an.
     */
    public void setOPTyp(String OPTyp)
    {
        // tragen Sie hier den Code ein
        this.OPTyp = OPTyp;
    }
    
    /**
     * Set-Methode Dringlichkeit
     * 
     * @param  Dringlichkeit Gibt die Dringlichkeit der Operation an.
     */
    public void setDringlichkeit(int Dringlichkeit)
    {
        // tragen Sie hier den Code ein
        this.Dringlichkeit = Dringlichkeit;
    }
    
    /**
     * Get-Methode Namen des Patienten.
     *
     * @return       NamePatient Gibt den Namen des Patienten aus.
     */
    public String getNamePatient()
    {
        // tragen Sie hier den Code ein
        return NamePatient;
    }
    
    /**
     * Get-Methode Alter des Patienten.
     * 
     * @return        AlterPatient Gibt das Alter des Patienten aus.
     */
    public int getAlterPatient()
    {
        // tragen Sie hier den Code ein
        return AlterPatient;
    }
    
    /**
     * Get-Methode Gesundheitszustand des Patienten.
     * 
     * @return       Gesundheitszustand Gibt den Gesunheitszustand des Patienten aus.
     */
    public String getGesundheitszustand()
    {
        // tragen Sie hier den Code ein
        return Gesundheitszustand;
    }
    
    
    /**
     * Get-Methode Anzahl der Aerzte.
     * 
     * @return        Anzahl Aerzte Gibt die Anzahl der Ärzte aus.
     */
    public int getAnzahlAerzte()
    {
        // tragen Sie hier den Code ein
        return AnzahlAerzte;
    }
    
    /**
     * Get-Methode Anzahl der Schwestern.
     * 
     * @return        AnzahlSchwester Gibt die Anzahl der Schwestern aus.
     */
    public int getAnzahlSchwester()
    {
        // tragen Sie hier den Code ein
        return AnzahlSchwester;
    }
    
    /**
     * Get-Methode Anzahl der Kardiotechniker.
     *
     * @return        AnzahlKT Gibt die Anzahl der Kardiotechniker aus.
     */
    public int getAnzahlKT()
    {
        // tragen Sie hier den Code ein
        return AnzahlKT;
    }
    
    /**
     * Get-Methode Dauer der OP.
     * 
     * @return        Dauer Gibt die Dauer der Operation aus.
     */
    public int getDauer()
    {
        // tragen Sie hier den Code ein
        return Dauer;
    }
    
    /**
     * Get-Methode OPTyp.
     * 
     * @return        OPTyp Gibt den Typ der Operation aus.
     */
    public String getOPTyp()
    {
        // tragen Sie hier den Code ein
        return OPTyp;
    }
    
    /**
     * Get-Methode Dringlichkeit.
     * 
     * @return        Dringlichkeit Gibt die Dringlichkeit der Operation aus.
     */
    public int getDringlichkeit()
    {
        // tragen Sie hier den Code ein
        return Dringlichkeit;
    }
    
     /**
     * Die Methode legt eine neue Operation an.
     * 
     * @param  NamePatient, AlterPatient, Gesundheitszustand, AnzahlAerzte, AnzahlSchwester, AnzahlKT, Dauer, OPTyp, Dringlichkeit
     */
    public void Anlegen(String NamePatient, int AlterPatient, String Gesundheitszustand, int AnzahlAerzte, int AnzahlSchwester, int AnzahlKT, int Dauer, String OPTyp, int Dringlichkeit)
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
     * Die Methode soll die Daten der Operation ausgeben.
     *
     * @return        NamePatient, AlterPatient, Gesundheitszustand, AnzahlAerzte, AnzahlSchwester, AnzahlKT, Dauer, OPTyp, Dringlichkeit
     */
    public String Abrufen()
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
        
        String allesA = "Name des Patienten: " + N + "Alter des Patienten:" + A + "Gesundheitszustand des Patienten: " + G + "Anzahl der Aerzte:" + AA + "Anzahl der Schwestern:" + AS;
        String allesB = "Anzahl der Kardiotechniker: " + AK + "Dauer der Operation:" + D + "Typ der Operation:" + O + "Dringlichkeit der Operation:" + Dr;
        
        String gesamt = allesA + "\n" + allesB;
        
        System.out.println(gesamt); // Zeilenumbruch 
        
        return  gesamt;
    }
}
