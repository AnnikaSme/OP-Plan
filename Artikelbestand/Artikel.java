/**
 * Modelliert Informationen zu einem Artikel, der von
 * einer Firma verkauft wird.
 * 
 * @author David J. Barnes und Michael K�lling
 * @version 2008.03.30
 */
public class Artikel
{
    // Die Nummer dieses Artikels
    private int nummer;
    // Der Name dieses Artikels
    private String name;
    // Der aktuelle Bestand dieses Artikels im Lager
    private int bestand;

    /**
     * Konstruktor f�r Objekte der Klasse Artikel.
     * Der Anfangsbestand ist Null.
     * @param nummer Die Artikelnummer des Artikels.
     * @param name Der Name des Artikels.
     */
    public Artikel(int nummer, String name)
    {
        this.nummer = nummer;
        this.name = name;
        bestand = 0;
    }

    /**
     * @return die Artikelnummer.
     */
    public int gibNummer()
    {
        return nummer;
    }

    /**
     * @return den Artikelnamen.
     */
    public String gibName()
    {
        return name;
    }

    /**
     * @return den Bestand im Lager.
     */
    public int gibBestand()
    {
        return bestand;
    }

    /**
     * @return die Nummer, den Namen und den Lagerbestand als String.
     */
    public String toString()
    {
        return nummer + ": " +
               name +
               " Lagerbestand: " + bestand;
    }

    /**
     * Erh�he den Lagerbestand dieses Artikels um den 
     * angegebenen Wert.
     * @param anzahl Die Anzahl der zus�tzlichen Artikel.
     *               Dieser Wert muss gr��er als Null sein.
     */
    public void erhoeheBestand(int anzahl)
    {
        if(anzahl > 0) {
            bestand += anzahl;
        }
        else {
            System.out.println("Versuchte Aufstockung von " +
                               name +
                               " um einen negativen Wert: " +
                               anzahl);
        }
    }

    /**
     * Verkaufe einen dieser Artikel.
     * Ein Fehler wird gemeldet, wenn der Artikel nicht auf
     * Lager ist.
     */
    public void verkaufeEinen()
    {
        if(bestand > 0) {
            bestand--;
        }
        else {
            System.out.println(
                "Versuchter Verkauf eines nicht vorr�tigen Artikels: " + name);
        }
    }
}
