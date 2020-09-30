/**
 * Demonstriert die Klassen Bestandsverwalter und Artikel.
 * Die Demonstration wird funktionst�chtig, indem die
 * Klasse Bestandsverwalter vervollst�ndigt wird.
 * 
 * @author David J. Barnes und Michael K�lling
 * @version 2008.03.30
 */
public class BestandDemo
{
    // Der Bestandsverwalter
    private Bestandsverwalter verwalter;

    /**
     * Erzeuge einen Bestandsverwalter und f�ttere ihn mit
     * ein paar Beispielartikeln.
     */
    public BestandDemo()
    {
        verwalter = new Bestandsverwalter();
        verwalter.neuerArtikel(new Artikel(132, "Uhrenradio"));
        verwalter.neuerArtikel(new Artikel(37, "Mobiltelefon"));
        verwalter.neuerArtikel(new Artikel(23, "Mikrowellenherd"));
    }
    
    /**
     * Eine sehr einfache Demonstration, wie ein Bestandsverwalter
     * benutzt werden k�nnte. Informationen zu allen Artikeln werden
     * angezeigt, die Bestandsmenge eines Artikels wird aufgestockt
     * und anschlie�end werden erneut alle Artikel angezeigt.
     */
    public void demo()
    {
        // Zeige Infos zu allen Artikeln.
        verwalter.alleArtikelAnzeigen();
        // Eine Lieferung von 5 Artikeln aufnehmen.
        verwalter.aufnehmen(132, 5);
        verwalter.alleArtikelAnzeigen();
    }
    
    /**
     * Zeige Details eines bestimmten Artikels.
     * Wenn vorhanden, werden Name und Bestandsmenge
     * angezeigt.
     * @param nummer Die Nummer des zu suchenden Artikels.
     */
    public void zeigeDetails(int nummer)
    {
        Artikel artikel = gibArtikel(nummer);
        if(artikel != null) {
            System.out.println(artikel.toString());
        }
    }
    
    /**
     * Verkaufe ein Exemplar eines bestimmten Artikels.
     * Zeige den Status des Artikels vor und nach dem 
     * Verkauf.
     * @param nummer Die Nummer des verkauften Artikels.
     */
    public void verkaufeArtikel(int nummer)
    {
        Artikel artikel = gibArtikel(nummer);
        
        if(artikel != null) {
            zeigeDetails(nummer);
            artikel.verkaufeEinen();
            zeigeDetails(nummer);
        }
    }
    
    /**
     * Hole den Artikel mit der angegebenen Nummer vom 
     * Verwalter.
     * Eine Fehlermeldung wird ausgegeben, wenn kein
     * Artikel mit dieser Nummer existiert.
     * @param nummer Die Nummer des Artikels.
     * @return den Artikel oder null, wenn nicht gefunden wird.
     */
    public Artikel gibArtikel(int nummer)
    {
        Artikel artikel = verwalter.findeArtikel(nummer);
        if(artikel == null) {
            System.out.println("Artikel mit Nr: " + nummer +
                               " ist nicht bekannt.");
        }
        return artikel;
    }

    /**
     * @return den Bestandsverwalter.
     */
    public Bestandsverwalter gibVerwalter()
    {
        return verwalter;
    }
}
