package dev;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write thRe wording of the language : ");
        String lang = scanner.nextLine();
        System.out.println("Send language creation request ...");

        AppMethode appMethode = new AppMethode();
        System.out.println("appMethode is create.");
        appMethode.create_language(lang);
        System.out.println("Language created !");

    }
}
