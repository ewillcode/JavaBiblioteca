import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca minhaBiblioteca = new Biblioteca();

        minhaBiblioteca.adicionarLivro(new Livro(101L, "O Senhor dos Anéis", "J.R.R. Tolkien"));
        minhaBiblioteca.adicionarLivro(new Livro(102L, "1984", "George Orwell"));
        minhaBiblioteca.adicionarLivro(new Livro(103L, "Dom Quixote", "Miguel de Cervantes"));
        minhaBiblioteca.adicionarLivro(new Livro(104L, "A Revolução dos Bichos", "George Orwell"));
        minhaBiblioteca.adicionarLivro(new Livro(105L, "Cem Anos de Solidão", "Gabriel García Márquez"));

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibir as opções do menu
            System.out.println("\n--- Sistema de Gerenciamento de Biblioteca ---");
            System.out.println("1. Listar todos os livros");
            System.out.println("2. Listar livros disponíveis");
            System.out.println("3. Emprestar livro");
            System.out.println("4. Devolver livro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            // Tentar ler a opção do usuário
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                scanner.nextLine();
                opcao = -1;
            }

            // Switch-case
            switch (opcao) {
                case 1:
                    minhaBiblioteca.listarTodosLivros();
                    break;
                case 2:
                    minhaBiblioteca.listarLivrosDisponiveis();
                    break;
                case 3:
                    System.out.print("Digite o ID do livro que deseja emprestar: ");
                    try {
                        Long idEmprestar = scanner.nextLong();
                        scanner.nextLine();
                        minhaBiblioteca.emprestarLivro(idEmprestar);
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("ID inválido! Por favor, digite um número para o ID.");
                        scanner.nextLine();
                    }
                    break;
                case 4:
                    System.out.print("Digite o ID do livro que deseja devolver: ");
                    try {
                        Long idDevolver = scanner.nextLong();
                        scanner.nextLine();
                        minhaBiblioteca.devolverLivro(idDevolver);
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("ID inválido! Por favor, digite um número para o ID.");
                        scanner.nextLine();
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
