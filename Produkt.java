public class Produkt {
  private String ProduktNr;
  private String ProduktNamn;
  private String Antal;
  private String Pris;

  public Produkt(String nyttProduktNr, String nyttProduktNamn, String nyttAntal,String Pris) {
      sättProduktNr (nyttProduktNr);
      sättProduktNamn (nyttProduktNamn);
      sättAntal (nyttAntal);
      sättPris (nyttPris);
  }
  public void sättProduktNr (String nyttProduktNr) {
      ProduktNr = nyttProduktNr;
  }
  public String avläsProduktNr () {
      return ProduktNr;
  }
  public void sättProduktNamn (String nyttProduktNamn) {
      ProduktNamn = nyttProduktNamn;
  }
  public String avläsProduktNamn () {
      return ProduktNamn;
  }
  public void sättAntal (String nyttAntal) {
      Antal = nyttAntal;
  }
  public String avläsAntal () {
      return Antal;
  }
  public void sättPris (String nyttPris) {
      Pris = nyttPris;
  }
  public String avläsPris () {
      return Pris;
  }
}

