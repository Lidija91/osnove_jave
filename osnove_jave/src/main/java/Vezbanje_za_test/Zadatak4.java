package Vezbanje_za_test;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {


        ArrayList<String> pretraga = new ArrayList<String>();

        pretraga.add("ITBootcamp - Besplatna IT prekvalifikacija - Free IT Bootcamp ...");
        pretraga.add("Prijava - Beograd - ITBootcamp");
        pretraga.add("IT Bootcamp kursevi");
        pretraga.add("IT Bootcamp - Education - Belgrade, Serbia - 1 Review - 342 ...");
        pretraga.add("IT Bootcamp - Образовање - Belgrade, Serbia - 1 утисак ...");
        pretraga.add("IT Bootcamp | LinkedIn");
        pretraga.add("Otvorene prijave za IT Bootcamp, program obuke ... - Startit");
        pretraga.add("Specijalizovani sistem za ŠKOLE SRBIJE - IT Bootcamp ...");
        pretraga.add("Vesti - Početak rada neprofitne IT škole - IT Bootcamp");
        pretraga.add("Otvorene prijave za IT Bootcamp u Nišu : Ekonomija : Južne ...");
        pretraga.add("Vesti - IT Bootcamp: traži se predavač Jave u Beogradu");
        pretraga.add("I spent 3 months applying to jobs after a coding bootcamp ...");
        pretraga.add("Are Coding Bootcamps Worth It? | Course Report");
        pretraga.add("Free Coding Bootcamps: The Best No-Cost Coding Programs");
        pretraga.add("Coding Dojo: Coding Bootcamp - Learn Coding &amp; Data Science");
        pretraga.add("Free Coding Bootcamp Prep Course | Flatiron School");
        pretraga.add("Coding Bootcamp Kyoto | Le Wagon");
        pretraga.add("Bootcamps won't make you a coder: Here's what will ...");
        pretraga.add("2020 Best Coding Bootcamps - SwitchUp.org");
        pretraga.add("Software Engineering Coding Bootcamp | Hack Reactor");
        pretraga.add("Coding Bootcamp | USF Corporate Training and Professional ...");
        pretraga.add("Is a Coding Bootcamp right for me? | Ubiqum Code Academy");
        pretraga.add("What Are IT Boot Camps? Webopedia Definition");
        pretraga.add("Coding bootcamp - Wikipedia");
        pretraga.add("IT Bootcamp #2 online edition – Data Analytics in the Cloud");
        pretraga.add("Coding Bootcamp Market Current Trends, Segmentation, Key ...");
        pretraga.add("Learn Coding Bootcamps with Online Courses and Lessons ...");
        pretraga.add("What is a coding bootcamp? — Firehose Project");
        pretraga.add("Coding Bootcamp Programs Overview| ComputerScience.org");
        pretraga.add("Program Details | Tech Elevator Coding Bootcamp");
        pretraga.add("IT Bootcamp škola nastavlja online nastavu - Resurs Centar");
        pretraga.add("Houston's #1 Rated Coding Bootcamp - DigitalCrafts");
        pretraga.add("Toronto Coding Bootcamp: Advanced Front End Web ...");
        pretraga.add("The 15 best coding schools and coding bootcamps in Europe ...");
        pretraga.add("How Much Can You Make After Coding Bootcamp? Eleven ...");
        pretraga.add("Is a Coding Bootcamp Worth It? Find out. - Analytics, Product ...");
        pretraga.add("7 Phases of Changing Careers through a Coding Bootcamp ...");

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite stranu: ");
        int strana = s.nextInt();
        System.out.println("Unesite broj rezultata po strani: ");
        int brojRezultata = s.nextInt();
        System.out.println("Rezultati pretrage su: ");
        for (int i = 0; i < brojRezultata; i++) {
            System.out.println(pretraga.get(brojRezultata * (strana - 1) + i));
        }


    }
}