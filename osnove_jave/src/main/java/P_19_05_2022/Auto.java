//package P_19_05_2022;
//
//public class Auto {
//    public String imeIPrezime;
//    public String marka;
//    public int brojVrata;
//    public int potrosnja;
//    public int brzina;
//    public String brojRegistracije;
//    public boolean daLiJeUkljucenaKlima;
//    public int godinaProizvodnje;
//    public int mesecRegistracije;
//    public int kubikaza;
//    public int kapacitetRezervoara;
//    public int trenutnaKolicinaGoriva;
//
//
//    public void stampa() {
//        System.out.println(this.imeIPrezime);
//        System.out.println(this.marka + "- " + this.brojVrata + "-ro vrata");
//        System.out.println("Sa potrošnjom od " + this.potrosnja + "l na 100km");
//        System.out.println(this.brzina + "km/h je trenutna brzina.");
//    }
//
//    public boolean daLiJePrekoracioBrzinu(int ogranicenje) {
//        int prekoracenje = brzina - ogranicenje;
//        if (prekoracenje > 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public int kazna(int ogranicenje) {
//        int prekoracenje = brzina - ogranicenje;
//        int visinaNovcaneKazne = 0;
//        if (prekoracenje > 0) {
//            visinaNovcaneKazne = prekoracenje * 1000;
//        }
//        return visinaNovcaneKazne;
//    }
////
////    public void dodajGas() {
////        brzina = brzina + 10;
////    }
////
////    public void koci() {
////        if (brzina > 10) {
////            brzina = brzina - 10;
////        }
////    }
////
////    public double potrosnja() {
////        double trenutnaPotrosnja = 1;
////        if (daLiJeUkljucenaKlima) {
////            return trenutnaPotrosnja = brzina / 100 * potrosnja * 1.2;
////        } else {
////            return trenutnaPotrosnja = brzina / 100 * potrosnja * 1.0;
////        }
////
////    }
////
////    public boolean oldtimer() {
////        if (godinaProizvodnje < 1950)
////    }
////
////    public boolean isteklaRegistracija(int trenutniMesec) {
////        if (trenutniMesec > mesecRegistracije) {
////    }
////
////    public double cenaRegistracije() {
////         double cenaReg=1;
////        if (kubikaza < 2000) {
////            return cenaReg=kubikaza*100;
////        } else
////            return cenaReg=kubikaza*100*1.30;
////    }
////
////    public int natociGorivo(int litraza) {
////        int novcanaCenaGoriva = 1;
////        int ukupnoStaloGoriva;
////        if (kapacitetRezervoara >= litraza + trenutnaKolicinaGoriva) {
////            novcanaCenaGoriva = litraza * 170;
////        }
////        else {
////            int visak = litraza + trenutnaKolicinaGoriva - kapacitetRezervoara;
////            novcanaCenaGoriva=(litraza-visak)*170;
////        }
////        return novcanaCenaGoriva;
////
////    }
////
////    public boolean isteBrzine (Auto Auto1, Auto Auto2) {
////         if (Auto1.brzina==Auto2.brzina) {return true;}
////    }
////
//}