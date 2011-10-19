import java.util.*;
public class Modell {
    
  private ArrayList <Kund> kundReg;
  private ArrayList <Produkt> produktReg;
  private ArrayList <Order> orderReg;
  private ArrayList <Orderrad> orderradReg;
    
  public Modell() {
      kundReg  = new ArrayList <Kund> ();
      produktReg  = new ArrayList <Produkt> ();
      orderReg  = new ArrayList <Order> ();
      orderradReg  = new ArrayList <Orderrad> ();
     
  }
    
  //Lägger in en kund i listan
  public void läggInNyKund (Kund nyKund) {
      kundReg.add(nyKund);
  }
  //Lägger in en produkt i listan
  public void läggInNyProdukt (Produkt nyProdukt) {
      produktReg.add(nyProdukt);
  }
  //Lägger in en order i listan
  public void läggInNyOrder (Order nyOrder) {
      orderReg.add(nyOrder);
  }
  //Lägger in en orderrad i listan
  public void läggInNyOrderrad (Orderrad nyOrderrad) {
      orderradReg.add(nyOrderrad);
  }
    
  //Raderar en kund u listan
  public void taBortKund(String id) {
      Kund = tmpKund;
      int i = 0
      boolean funnen = false;
     
      while (i < kundReg.size() && funnen == false) {
          tmpKund = kundReg.get(i);
          if (tmpKund.avlästPersNr().equals(id)){
              kundReg.remove(i);
              funnen = true;
          }
          i++;
      }  
  }
    
  //Söker och returnerar en kund ur listan
  public Kund sökKund(String id) {
      Kund tmpKund = null;
      int i = 0;
      boolean funnen = false;
     
      while (i < kundReg.size() && funnen == false) {
          tmpKund = kundReg.get(i);
          if (tmpKund.avlästPersNr().equals(id)) {
              funnen = true;
          }
          i++;
      }
      if (funnen == false) {
          tmpKund = null;
      }
      return tmpKund
  }
          //Uppdaterar en kunds namn
  public void uppdateraKundsNamn(String id, String nyttNamn) {
      Kund kund = sökKund(id);
     
      if (kund != null) {
          kund.sättNamn(nyttNamn);
      }
  }
      //Uppdaterar en produkt
  public void uppdateraOrderNamn(String id, String nyttProdukt) {
      Produkt produkt = sökProdukt(id);
       
      if (produkt != null) {
          produkt.sättProdukt(nyttProdukt);
      }
  }
  //Uppdaterar en order
  public void uppdateraKundsNamn(String id, String nyttNamn) {
      Kund kund = sökKund(id);
       
      if (kund != null) {
          kund.sättNamn(nyttNamn);
      }
  }
  //Uppdaterar en orderrad
  public void uppdateraKundsNamn(String id, String nyttNamn) {
      Kund kund = sökKund(id);
       
      if (kund != null) {
          kund.sättNamn(nyttNamn);
      }
    }

  //Uppdaterar en kunds kreditkortsnummer
  public void nyttBeställarNr(String id, int nyttNummer) {
      Kund tmpKund;
      tmpKund = sökKund(id);
     
      if (tmpKund != null) {
          tmpKund.nyttKreditkortsnummer(nyttNummer);
      }
    }
 }

