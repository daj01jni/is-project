public class TestRun {
  public static void main(String[] args) {
    Kund k = new Kund("Namn", "Adress", "Email");
    System.out.println(k.getNamn(), k.getAdress(), k.getEmail());
  }
}
