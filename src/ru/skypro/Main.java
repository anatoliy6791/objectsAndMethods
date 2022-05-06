package ru.skypro;
public class Main {

    public static void main(String[] args) {

        Book voinaIMir = new Book("Война и Мир",1867,new Author("Толстой", "Лев"));
        Book evgenyOnegin = new Book("Евгений Онегин",1833,new Author("Пушкин","Александр"));

        System.out.println(voinaIMir.getAuthor().getFirstName() + " " + voinaIMir.getAuthor().getLastName() +  " " + voinaIMir.getNameOfBook() + " " + voinaIMir.getDateOfBook());

        System.out.println(" ");

        System.out.println(evgenyOnegin.getAuthor().getFirstName() + " " + evgenyOnegin.getAuthor().getLastName() + " " + evgenyOnegin.getNameOfBook() + " " + evgenyOnegin.getDateOfBook());

        System.out.println(" ");

        voinaIMir.setDateOfBook(15);
        System.out.print(voinaIMir.getAuthor().getFirstName() + " ");
        System.out.print(voinaIMir.getAuthor().getLastName() + " ");
        System.out.print(voinaIMir.getNameOfBook() + " ");
        System.out.print(voinaIMir.getDateOfBook());

    }
}