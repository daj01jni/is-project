public class Orderrad {
  private int Antal;
  private int Pris;
  private String KundNummer;
  private String Order;
    
    
  public Orderrad(int nyttAntal, int nyttPris, String nyttKundNummer, String nyttOrder) {
      sättAntal (nyttAntal);
      sättPris (nyttPris);
      sättKundNummer (nyttKundNummer);
      sättOrder (nyttOrder);
  }
  public void sättAntal (int nyttAntal) {
      Antal = nyttAntal;
  }
  public int avläsAntal () {
      return Antal;
  }
  public void sättPris (int nyttPris) {
      Pris = nyttPris;
  }
  public int avläsPris () {
      return Pris;
  }
  public void sättKundNummer (String nyttKundNummer) {
      KundNummer = nyttKundNummer;
  }
  public String avläsKundNummer () {
      return KundNummer;
  }
  public void sättOrder (String nyttOrder) {
      Order = nyttOrder;
  }
  public String avläsOrder () {
      return Order;
  }
  }

}

