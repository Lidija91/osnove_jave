package d_16_05_2022;

public class ObrniOkreni {
 public static void main(String[] args) {
////        Zadatak Obrni okreni
////Napisati metodu koja vraca obrnuti string od onog koji je prosledjen.
////Poziv metode:
////Ako se metoda pozove sa prosledjenom vrednoscu IT Bootcamp metoda vraca pmactooB TI
////Primer pozvia bi bio: String obrnut = obrniString("IT Bootcamp");
////Pomoc: Bilo kom karakteru iz stringa mozete pristupiti koristeci metodu charAt(int index) Koristan
        String obrniOkreni = okrenutString("Lidija");
     System.out.print(obrniOkreni);
    }

    static String okrenutString(String normalanString) {
    String obrnutiString = "";
        for (int i = (normalanString.length()-1); i == 0; i--) {
            obrnutiString = obrnutiString + "" + normalanString.charAt(i);
        }
        return obrnutiString;
 }
 }
