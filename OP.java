
/**
 * Die Klasse definiert die OP mit NamePatient, AlterPatient, Gesundheitszustand, AnzahlAerzte, AnzahlSchwester, AnzahlKT, Dauer, OPTyp, Dringlichkeit.
 * 
 * 
 * @author Sarah Huber, Nathalie Schatz
 * @version 01.10.2020, 1.1
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
    public OP(String NamePatient,int AlterPatient, String Gesundheitszustand, int AnzahlAerzte, int AnzahlSchwester, int AnzahlKT, int Dauer, String OPTyp, int Dringlichkeit)
    {
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
        if ( AnzahlAerzte < 2|| AnzahlAerzte > 4)   //Es müssen mindestens 2 und es können nur maximal 4 Aerzte an einer Operation teilnehmen.
        { 
            System.out.println("Es müssen 2 bis 4 Ärzte bei einer Operation dabei sein.");           //Exception muss da gemacht werden!
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
            System.out.println("Es müssen 1 bis 4 Schwestern bei einer Operation dabei sein.");           //Exception muss da gemacht werden!
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
            System.out.println("Es können nicht weniger als 0 und nicht mehr als 1 Kardiotechniker bei einer Operation dabei sein.");           //Exception muss da gemacht werden!
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
            System.out.println("Die Dauer einer Operation muss mindestens 1 Stunde und kann höchstens 10 Stunden betragen.");           //Exception muss da gemacht werden!
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
         if ( Dringlichkeit < 1|| Dringlichkeit > 4)   //Es gibt nur die Dringlichkeitsstufen: Notoperation = 1, Dringend = 2, NIcht sehr Dringend = 3
        { 
            System.out.println("Diese Dringlichkeit existiert nicht! Es gibt nur die Dringlichkeitsstufen 1 bis 3.");           //Exception muss da gemacht werden!
        }
        else
        {
            this.Dringlichkeit = Dringlichkeit;
        }
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
    
     /**
     * Die Methode legt eine neue Operation an.
     * 
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
    public void Anlegen(String NamePatient, int AlterPatient, String Gesundheitszustand, int AnzahlAerzte, int AnzahlSchwester, int AnzahlKT, int Dauer, String OPTyp, int Dringlichkeit)
    {
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
