package p_18_05_2022;

public class MainSlackMessage {
    public static void main(String[] args) {

//        U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//[ime i prezime osobe] - [kad je poslata]npr: 26.08.2021 18:55)
//[Tekst poruke]

        SlackMessage poruka1 = new SlackMessage();
        poruka1.tekst = "Hello";
        poruka1.imeIPrezime = "Lidija Milivojevic";
        poruka1.datumIVreme = "18.05.2022 18:00";

        System.out.println(poruka1.imeIPrezime + " - " + poruka1.datumIVreme);
        System.out.println(poruka1.tekst);

        SlackMessage poruka2 = new SlackMessage();
        poruka2.tekst = "Dovidjenja";
        poruka2.imeIPrezime = "Marko Markovic";
        poruka2.datumIVreme = "18.05.2022 22:00";

        System.out.println(poruka2.imeIPrezime + " - " + poruka2.datumIVreme);
        System.out.println(poruka2.tekst);
    }
}
