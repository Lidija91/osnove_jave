package d_16_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class ZadatakBrowser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> bookmarks = new ArrayList<String>();
        bookmarks.add("Apps");
        bookmarks.add("YouTube");
        bookmarks.add("Google");
        bookmarks.add("Gmail");
        bookmarks.add("Miro | Online Whiteboard for Visual Collaboration");
        bookmarks.add("Confluence");
        bookmarks.add("JIRA");
        bookmarks.add("Bitbucket");
        bookmarks.add("Google Calendar");
        bookmarks.add("Timesheet");
        bookmarks.add("Google Drive");
        bookmarks.add("IX CIKLUS");

        System.out.println("Unesite širinu pretraživača: ");
        int sirina = s.nextInt();
        int sirinabookmarka = 0;

        while (sirina >= sirinabookmarka) {
            for (int i = 0; i < sirina - sirinabookmarka; i++) {
                System.out.print(bookmarks.get(i));
                System.out.print("     ");
                sirinabookmarka = sirinabookmarka + bookmarks.get(i).length() + 5;

            }
        }
    }
}
