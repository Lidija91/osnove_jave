package d_20_05_2022;

public class FacebookPostMain {
    public static void main(String[] args) {
        FacebookPost prvi = new FacebookPost("Lidija Milivojevic", "Aleksandar Nesovic", "Cao cao");
        System.out.println(prvi.koJeObjavio);
        prvi.like();
//        System.out.println(prvi.brojLajkova);

        prvi.print();

    }
}
