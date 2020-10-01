
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
     * Definiert den Namen des Patienten
     * 
     * @param  NamePatient
     */
    public void setNamePatient(String NamePatient)
    {
        // tragen Sie hier den Code ein
        this.NamePatient = NamePatient;
    }
    
    /**
     * Definiert das Alter des Patienten
     * 
     * @param  AlterPatient
     */
    public void setAlterPatient(int AlterPatient)
    {
        // tragen Sie hier den Code ein
        this.AlterPatient = AlterPatient;
    }
    
    /**
     * Definiert den Gesundheitszustand des Patienten
     * 
     * @param  Gesundheitszustand
     */
    public void setGesundheitszustand(String Gesundheitszustand)
    {
        // tragen Sie hier den Code ein
        this.Gesundheitszustand = Gesundheitszustand;
    }
    
    /**
     * Definiert die Anzahl der Ärzte 
     * 
     * @param  AnzahlAerzte
     */
    public void setAnzahlAerzte(int AnzahlAerzte)
    {
        // tragen Sie hier den Code ein
        this.AnzahlAerzte = AnzahlAerzte;
    }
    
    /**
     * Definiert die Anzahl der Schwestern
     * 
     * @param  AnzahlSchwester
     */
    public void setAnzahlSchwester(int AnzahlSchwester)
    {
        // tragen Sie hier den Code ein
        this.AnzahlSchwester= AnzahlSchwester;
    }
    
    /**
     * Definiert die Anzahl der Kardiotechniker
     * 
     * @param  Anzahl der Kardiotechniker
     */
    public void setAnzahlKT(int AnzahlKT)
    {
        // tragen Sie hier den Code ein
        this.AnzahlKT = AnzahlKT;
    }
    
    /**
     * Definiert die Dauer 
     * 
     * @param  Dauer
     */
    public void setDauer(int Dauer)
    {
        // tragen Sie hier den Code ein
        this.Dauer = Dauer;
    }
    
    /**
     * Definiert den OPTyp
     * 
     * @param  OPTyp
     */
    public void setOPTyp(String OPTyp)
    {
        // tragen Sie hier den Code ein
        this.OPTyp = OPTyp;
    }
    
    /**
     * Definiert die Dringlichkeit
     * 
     * @param  Dringlichkeit
     */
    public void setDringlichkeit(int Dringlichkeit)
    {
        // tragen Sie hier den Code ein
        this.Dringlichkeit = Dringlichkeit;
    }
    
    /**
     * Gibt den Namen des Patienten aus.
     *
     * @return       NamePatient 
     */
    public String getNamePatient()
    {
        // tragen Sie hier den Code ein
        return NamePatient;
    }
    
    /**
     * Gibt das Alter des Patienten aus.
     * 
     * @return        AlterPatient
     */
    public int getAlterPatient()
    {
        // tragen Sie hier den Code ein
        return AlterPatient;
    }
    
    /**
     * Gibt den Gesundheitszustand des Patienten aus.
     * 
     * @return       Gesundheitszustand
     */
    public String getGesundheitszustand()
    {
        // tragen Sie hier den Code ein
        return Gesundheitszustand;
    }
    
    
    /**
     * Gibt die Anzahl der Aerzte aus.
     * 
     * @return        Anzahl Aerzte
     */
    public int getAnzahlAerzte()
    {
        // tragen Sie hier den Code ein
        return AnzahlAerzte;
    }
    
    /**
     * Gibt die Anzahl der Schwestern aus.
     * 
     * @return        AnzahlSchwester
     */
    public int getAnzahlSchwester()
    {
        // tragen Sie hier den Code ein
        return AnzahlSchwester;
    }
    
    /**
     * Gibt die Anzahl der Kardiotechniker aus.
     *
     * @return        AnzahlKT
     */
    public int getAnzahlKT()
    {
        // tragen Sie hier den Code ein
        return AnzahlKT;
    }
    
    /**
     * Gibt die Dauer der OP aus.
     * 
     * @return        Dauer
     */
    public int getDauer()
    {
        // tragen Sie hier den Code ein
        return Dauer;
    }
    
    /**
     * Gibt OPTyp aus.
     * 
     * @return        OPTyp
     */
    public String getOPTyp()
    {
        // tragen Sie hier den Code ein
        return OPTyp;
    }
    
    /**
     * Gibt Dringlichkeit aus.
     * 
     * @return        Dringlichkeit
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
