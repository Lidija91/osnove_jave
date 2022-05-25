package p_24_05_2022;

public class UgovorFLMain {
    public static void main(String[] args) {

        FizickoLice Lida = new FizickoLice("Lidija Milivojevic", "1234567", "29505050505", true);
        FizickoLice Aca = new FizickoLice("Aleksandar", "98765432", "2515615165", false);

        Ugovor prviUgovor = new Ugovor("29.04.2022.", Aca, Lida, 200000, "Kragujevac");

        prviUgovor.stampaUgovora();


    }
}
