public class Kund {
  private String BeställarNr;
  private String Namn;
  private String PersonNr;

  public Kund(String nyttBeställarNr, String nyttNamn, String nyttPersonNr) {
      sättBeställarNr (nyttBeställarNr);
      sättNamn (nyttNamn);
      sättPersonNr (nyttPersonNr);
  }
  public void sättBeställarNr (String nyttBeställarNr) {
      BeställarNr = nyttBeställarNr;
  }
  public String avläsBeställarNr () {
      return BeställarNr;
  }
  public void sättNamn (String nyttNamn) {
      Namn = nyttNamn;
  }
  public String avläsNamn () {
      return Namn;
  }
  public void sättPersonNr (String nyttPersonNr) {
      PersonNr = nyttPersonNr;
  }
  public String avläsPersonNr () {
      return PersonNr;
  }
    
}

