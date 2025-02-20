package com.tracker;

import com.tracker.model.entities.Book;
import com.tracker.model.services.GoogleBooksApi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GoogleBooksApi googleBooksApi = new GoogleBooksApi();

        welcomeMessage();

        try {
            boolean continueAdding = true;
            while (continueAdding) {

                String bookName = getBookName(scanner);
                Book book = googleBooksApi.getBookDetails(bookName);

                if (book != null) {
                    displayBookDetails(book);
                    continueAdding = confirmAddition(scanner, book);
                } else {
                    System.out.println("Livro não encontrado. Tente novamente.");
                }
            }
        } catch (Exception e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }


    private static void welcomeMessage() {
        System.out.println("""
                Seja bem-vindo(a) ao trackReader! 📚✨
                Estamos aqui para te ajudar a organizar e acompanhar suas leituras diárias de forma simples e eficiente!""");
        System.out.println();
    }

    private static String getBookName(Scanner scanner) {
        System.out.print("Digite o nome do livro que deseja adicionar: ");
        return scanner.nextLine().replaceAll("\\s+", "");
    }

    private static void displayBookDetails(Book book) {
        System.out.println("\nLivro encontrado!\n");
        System.out.println(book);
        System.out.println();
    }

    private static boolean confirmAddition(Scanner scanner, Book book) {
        System.out.printf("Deseja adicionar o livro \"%s\" à sua lista de leitura? (S/N): ", book.getTitle());
        char response = scanner.next().toLowerCase().charAt(0);
        scanner.nextLine();

        if (response == 's') {
            System.out.println("Livro adicionado!");

            // Lógica para adicionar o livro à lista

            System.out.println("Deseja buscar outro livro? (S/N): ");
            char retry = scanner.next().toLowerCase().charAt(0);
            scanner.nextLine();
            return retry == 's';

        } else if (response == 'n') {
            System.out.println("Deseja buscar outro livro? (S/N): ");
            char retry = scanner.next().toLowerCase().charAt(0);
            scanner.nextLine();
            return retry == 's';
        }
        return false;
    }
}