
/**
 * Die Klasse definiert die OP mit NamePatient, AlterPatient, Gesundheitszustand, AnzahlAerzte, AnzahlSchwester, AnzahlKT, Dauer, OPTyp, Dringlichkeit.
 * 
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
     * @param NamePatient
     * @param AlterPatient
     * @param Gesundheitszustand
     * @param AnzahlAerzte
     * @param AnzahlSchwester
     * @param AnzahlKT
     * @param Dauer
     * @param OPTyp
     * @param Dringlichkeit
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
     * Standardkonstruktor der Klasse OP mit ausgedachten Werten.
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
     * Set-Methode für den Namen des Patienten
     * 
     * @param  NamePatient Name des Patienten
     */
    public void setNamePatient(String NamePatient)
    {
        // tragen Sie hier den Code ein
        this.NamePatient = NamePatient;
    }
    
    /**
     * Set-Methode für das Alter des Patienten
     * 
     * @param  AlterPatient Alter des Patienten kann nur zwischen 0 und 130 Jahren liegen.
     */
    public void setAlterPatient(int AlterPatient)
    {
        if (AlterPatient < 0 || AlterPatient > 130)   //Kein Mensch kann über 130 Jahre alt werden und kein Mensch kann unter 0 sein.
        { 
            System.out.println("Der Patient kann nicht unter 0 Jahre alt sein und nicht über 130 Jahre alt sein.");           //Exception muss da gemacht werden!
        }
        else
        {
            this.AlterPatient = AlterPatient;
        }
    }
    
    /**
     * Set-Methode für den Gesundheitszustand des Patienten
     * 
     * @param  Gesundheitszustand Gesundheitszustand des Patienten
     */
    public void setGesundheitszustand(String Gesundheitszustand)
    {
        this.Gesundheitszustand = Gesundheitszustand;
    }
    
    /**
     * Set-Methode für die Anzahl der Ärzte 
     * 
     * @param  AnzahlAerzte Anzahl der Ärzte kann nicht <2 oder >4 sein
     */
    public void setAnzahlAerzte(int AnzahlAerzte)
    {
        if ( AnzahlAerzte < 2|| AnzahlAerzte > 4)   //Es muessen mindestens 2 und es können nur maximal 4 Aerzte an einer Operation teilnehmen.
        { 
            System.out.println("Es muessen mindestens 2-4 Aerzte bei einer Operation dabei sein.");           //Exception muss da gemacht werden!
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
        if ( AnzahlSchwester < 2|| AnzahlSchwester > 4)   //Es muessen mindestens 1 und es können nur maximal 4 Schwestern an einer Operation teilnehmen.
        { 
            System.out.println("Es muessen mindestens 1-4 Schwestern bei einer Operation dabei sein.");           //Exception muss da gemacht werden!
        }
        else
        {
            this.AnzahlSchwester= AnzahlSchwester;
        }
    }
    
    /**
     * Set-Methode Anzahl der Kardiotechniker
     * 
     * @param  AnzahlKT Gibt die Anzahl der Kardiotechniker an.
     */
    public void setAnzahlKT(int AnzahlKT)
    {
        // tragen Sie hier den Code ein
        if ( AnzahlKT < 0|| AnzahlKT > 1)   //Es wird nicht bei jeder Operation ein Kardiotechniker benönigt, wenn ein Kardiotechniker benötigt wird, kann nur einer bei einer Operation dabei sein.
        { 
            System.out.println("Es können nicht weniger als 0 und nicht mehr als 1 Kardiotechniker bei einer Operation dabei sein.");           //Exception muss da gemacht werden!
        }
        else
        {
            this.AnzahlKT = AnzahlKT;
        }
    }
    
    /**
     * Set-Methode Dauer 
     * 
     * @param  Dauer Gibt die Dauer der Operation an.
     */
    public void setDauer(int Dauer)
    {
        // tragen Sie hier den Code ein
         if ( Dauer < 1|| Dauer > 10)   //Eine Operation muss mindestens 1 Stunde und kann nur bis zu 10 Stunden dauern.
        { 
            System.out.println("Die Dauer einer Operation muss mindestens 1 Stunde und kann höchstens 10 Stunden betragen.");           //Exception muss da gemacht werden!
        }
        else
        {
            this.Dauer = Dauer;
        }
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
         if ( Dringlichkeit < 2|| Dringlichkeit > 4)   //Es gibt nur die Dringlichkeitsstufen: Notoperation = 1, Dringend = 2, NIcht sehr Dringend = 3
        { 
            System.out.println("Diese Dringlichkeit existiert nicht! Es gibt nur die Dringlichkeitsstufen 1 bis 3..");           //Exception muss da gemacht werden!
        }
        else
        {
            this.Dringlichkeit = Dringlichkeit;
        }
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
