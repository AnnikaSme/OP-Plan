
/**
 * Die Klasse definiert die OP mit NamePatient, AlterPatient, Gesundheitszustand, AnzahlAerzte, AnzahlSchwester, AnzahlKT, Dauer, OPTyp, Dringlichkeit.
 * 
 * 
 * @author Sarah Huber, Nathalie Schatz
 * @version 13.10.2020, 0.0.2
 */
public class OP
{
    private String NamePatient;
    private int AlterPatient;
    private String Gesundheitszustand;
    private int AnzahlAerzte;
    private int AnzahlSchwester;
    private int AnzahlKT;
    private int Dauer;
    private String OPTyp;
    private int Dringlichkeit; 
    private Raum raum;
    

    /**
     * Konstruktor für Objekte der Klasse OP
     * @param NamePatient Name des Patienten
     * @param AlterPatient Alter des Patienten
     * @param Gesundheitszustand Gesundheitszustand des Patienten
     * @param AnzahlAerzte Anzahl der benötigten Ärzte
     * @param AnzahlSchwester Anzahl der benötigten Schwestern
     * @param AnzahlKT Anzahl der benötigten Kardiotechniker
     * @param Dauer Dauer der OP
     * @param OPTyp Typ der OP
     * @param Dringlichkeit Dringlichkeit der OP
     */
    public OP(String NamePatient, int AlterPatient, String Gesundheitszustand, int AnzahlAerzte, int AnzahlSchwester, int AnzahlKT, int Dauer, String OPTyp, int Dringlichkeit)
    {
        this.NamePatient = NamePatient;
        this.AlterPatient = AlterPatient;
        this.Gesundheitszustand = Gesundheitszustand;
        this.AnzahlAerzte = AnzahlAerzte;
        this.AnzahlSchwester = AnzahlSchwester;
        this.AnzahlKT = AnzahlKT;
        this.Dauer = Dauer;
        this.OPTyp = OPTyp;
        this.Dringlichkeit = Dringlichkeit;
        raum = new Raum();
    }
    
    /**
     * Standardkonstruktor der Klasse OP mit ausgedachten Werten.
     */
    public OP()
    {
        NamePatient = "Miller";
        AlterPatient = 45;
        Gesundheitszustand = "Der Patient ist in einem schwachen Zustand.";
        AnzahlAerzte = 2;
        AnzahlSchwester = 3;
        AnzahlKT = 1;
        Dauer = 5;
        OPTyp = "Herzklappenrekonstruktion";
        Dringlichkeit = 2;
        raum = new Raum();
    }

    /**
     * Set-Methode für den Namen des Patienten
     * 
     * @param  NamePatient Name des Patienten
     */
    public void setNamePatient(String NamePatient)
    {
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
            throw new IllegalArgumentException("Der Patient kann nicht unter 0 Jahre alt sein und nicht über 130 Jahre alt sein.");           //Exception geworfen
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
     * @param  AnzahlAerzte Anzahl der Ärzte kann nicht <1oder >4 sein
     */
    public void setAnzahlAerzte(int AnzahlAerzte)
    {
        if ( AnzahlAerzte < 1|| AnzahlAerzte > 4)   //Es müssen mindestens 1 und es können nur maximal 4 Aerzte an einer Operation teilnehmen.
        { 
            throw new IllegalArgumentException("Es müssen 1 bis 4 Ärzte bei einer Operation dabei sein.");                                                     //Exception geworfen
        }
        else
        {
            this.AnzahlAerzte = AnzahlAerzte;
        }
    }
    
    /**
     * Set-Methode für die Anzahl der Schwestern
     * 
     * @param  AnzahlSchwester Anzahl der Schwestern muss zwischen 1 und 4 liegen.
     */
    public void setAnzahlSchwester(int AnzahlSchwester)
    {
        if ( AnzahlSchwester < 1 || AnzahlSchwester > 4)   //Es muessen mindestens 1 und es können nur maximal 4 Schwestern an einer Operation teilnehmen.
        { 
            throw new IllegalArgumentException("Es müssen 1 bis 4 Schwestern bei einer Operation dabei sein.");                                                  //Exception geworfe!
        }
        else
        {
            this.AnzahlSchwester= AnzahlSchwester;
        }
    }
    
    /**
     * Set-Methode für die Anzahl der Kardiotechniker
     * 
     * @param  AnzahlKT Anzahl der Kardiotechniker kann 0 oder 1 sein
     */
    public void setAnzahlKT(int AnzahlKT)
    {
        if ( AnzahlKT < 0|| AnzahlKT > 1)   //Es wird nicht bei jeder Operation ein Kardiotechniker benötigt, mehr als einer wird nicht gebraucht.
        { 
            throw new IllegalArgumentException("Es können nicht weniger als 0 und nicht mehr als 1 Kardiotechniker bei einer Operation dabei sein.");           //Exception geworfen
        }
        else
        {
            this.AnzahlKT = AnzahlKT;
        }
    }
    
    /**
     * Set-Methode für die Dauer der OP
     * 
     * @param  Dauer Dauer der OP kann nicht negativ und nicht >10 Stunden sein
     */
    public void setDauer(int Dauer)
    {
         if ( Dauer < 1|| Dauer > 10)   //Eine Operation muss mindestens 1 Stunde und kann nur bis zu 10 Stunden dauern.
        { 
            throw new IllegalArgumentException("Die Dauer einer Operation muss mindestens 1 Stunde und kann höchstens 10 Stunden betragen.");           //Exception geworfen
        }
        else
        {
            this.Dauer = Dauer;
        }
    }
    
    /**
     * Set-Methode für den OPTyp
     * 
     * @param  OPTyp Typ der Operation (z.B. Aortenklappenersatz OP oder Appendektomie...)
     */
    public void setOPTyp(String OPTyp)
    {
        this.OPTyp = OPTyp;
    }
    
    /**
     * Set-Methode für die Dringlichkeit
     * 
     * @param  Dringlichkeit Dringlichkeit der Operation
     */
    public void setDringlichkeit(int Dringlichkeit)
    {
         if ( Dringlichkeit < 1|| Dringlichkeit > 3)   //Es gibt nur die Dringlichkeitsstufen: Notoperation = 1, Dringend = 2, NIcht sehr Dringend = 3
        { 
            throw new IllegalArgumentException("Diese Dringlichkeit existiert nicht! Es gibt nur die Dringlichkeitsstufen 1 bis 3.");           //Exception geworfen
        }
        else
        {
            this.Dringlichkeit = Dringlichkeit;
        }
    }
    public void setRaum(Raum raum)
    {
        this.raum = raum;
    }
    
    /**
     * Get-Methode für den  Namen des Patienten.
     *
     * @return       NamePatient 
     */
    public String getNamePatient()
    {
        return NamePatient;
    }
    
    /**
     * Get-Methode für das Alter des Patienten.
     * 
     * @return        AlterPatient
     */
    public int getAlterPatient()
    {
        return AlterPatient;
    }
    
    /**
     * Get-Methode für den Gesundheitszustand des Patienten.
     * 
     * @return       Gesundheitszustand 
     */
    public String getGesundheitszustand()
    {
        return Gesundheitszustand;
    }
    
    
    /**
     * Get-Methode für die Anzahl der Ärzte.
     * 
     * @return        Anzahl
     */
    public int getAnzahlAerzte()
    {
        return AnzahlAerzte;
    }
    
    /**
     * Get-Methode für die Anzahl der Schwestern.
     * 
     * @return        AnzahlSchwester
     */
    public int getAnzahlSchwester()
    {
        return AnzahlSchwester;
    }
    
    /**
     * Get-Methode für die Anzahl der Kardiotechniker.
     *
     * @return        AnzahlKT 
     */
    public int getAnzahlKT()
    {
        return AnzahlKT;
    }
    
    /**
     * Get-Methode für die Dauer der OP.
     * 
     * @return        Dauer
     */
    public int getDauer()
    {
        return Dauer;
    }
    
    /**
     * Get-Methode für den OPTyp.
     * 
     * @return        OPTyp 
     */
    public String getOPTyp()
    {
        return OPTyp;
    }
    
    /**
     * Get-Methode für die Dringlichkeit.
     * 
     * @return        Dringlichkeit 
     */
    public int getDringlichkeit()
    {
        return Dringlichkeit;
    }
    public Raum getRaum()
    {
        return raum;
    }
    
     // /**
     // * Die Methode legt eine neue Operation an.
     // * 
     // * @param NamePatient Name des Patienten
     // * @param AlterPatient Alter des Patienten
     // * @param Gesundheitszustand Gesundheitszustand des Patienten
     // * @param AnzahlAerzte Anzahl der benötigten Ärzte
     // * @param AnzahlSchwester Anzahl der benötigten Schwestern
     // * @param AnzahlKT Anzahl der benötigten Kardiotechniker
     // * @param Dauer Dauer der OP
     // * @param OPTyp Typ der OP
     // * @param Dringlichkeit Dringlichkeit der OP
     // */
    // public void Anlegen(String NamePatient, int AlterPatient, String Gesundheitszustand, int AnzahlAerzte, int AnzahlSchwester, int AnzahlKT, int Dauer, String OPTyp, int Dringlichkeit)
    // {
        // setNamePatient(NamePatient);
        // setAlterPatient(AlterPatient);
        // setGesundheitszustand(Gesundheitszustand);
        // setAnzahlAerzte(AnzahlAerzte);
        // setAnzahlSchwester(AnzahlSchwester);
        // setAnzahlKT(AnzahlKT);
        // setDauer(Dauer);
        // setOPTyp(OPTyp);
        // setDringlichkeit(Dringlichkeit);
    // }
    
     /**
     * Die Methode soll die Daten der Operation ausgeben.
     *
     * @return        NamePatient, AlterPatient, Gesundheitszustand, AnzahlAerzte, AnzahlSchwester, AnzahlKT, Dauer, OPTyp, Dringlichkeit
     */
    public String Abrufen()
    {
        String N = getNamePatient();    
        int A = getAlterPatient();
        String G = getGesundheitszustand();
        int AA = getAnzahlAerzte();
        int AS = getAnzahlSchwester();
        int AK = getAnzahlKT();
        int D = getDauer();
        String O = getOPTyp();
        int Dr = getDringlichkeit();
        
        String allesA = "Name des Patienten: " + N +"\r\n" + "Alter des Patienten:" + A +"\r\n" + "Gesundheitszustand des Patienten: " + G + "\r\n" + "Anzahl der Aerzte:" + AA +"\r\n" + "Anzahl der Schwestern:" + AS;
        String allesB = "Anzahl der Kardiotechniker: " + AK + "\r\n" + "Dauer der Operation:" + D +"\r\n"+ "Typ der Operation:" + O +"\r\n" + "Dringlichkeit der Operation:" + Dr;
        
        String gesamt = allesA + "\n" + allesB;
        
        System.out.println(gesamt); // Zeilenumbruch 
        
        return  gesamt;
    }
}
