import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> acervo;

    //Construtor
    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }

    //Add Livros
    public void adicionarLivro(Livro livro) {
        if (livro!=null) {
            this.acervo.add(livro);
            System.out.println("Livro " + livro.getNomeLivro() + " adicionado ao acervo");
        } else {
            System.out.println("Erro: Não foi possível adicionar um livro nulo.");
        }
    }

    //Listar todos os livros
    public void listarTodosLivros() {
        if (acervo.isEmpty()) {
            System.out.println("O acervo da biblioteca está vazio.");
            return;
        }

        System.out.println("\n--- Acervo Completo da Biblioteca ---");
        for (Livro livro : acervo) {
            System.out.println(livro);
        }
        System.out.println("------------------------------------");
    }

    //Listar todos os livros disponíveis
    public void listarLivrosDisponiveis() {
        if (acervo.isEmpty()) {
            System.out.println("O acervo da biblioteca está vazio.");
            return;
        }
        System.out.println("\n--- Acervo Disponível da Biblioteca ---");
        for (Livro livro : acervo) {
            if (!livro.isEmprestado()) {
                System.out.println(livro);
            }
        }
        System.out.println("------------------------------------");
    }

    public void emprestarLivro(Long idLivro) {
        for (Livro livro : acervo) {
            if (livro.getIdLivro().equals(idLivro)) {
                if (!livro.isEmprestado()) {
                    livro.setEmprestado(true);
                    System.out.println("Livro '"+ livro.getNomeLivro() + "' (ID: " + idLivro + ") emprestado com sucesso!");
                    return;
                } else {
                    System.out.println("Erro: Livro '" + livro.getNomeLivro() + "' (ID: " + idLivro + ") já está emprestado.");
                    return;
                }
            }
        }
        System.out.println("Erro: Livro com ID " + idLivro + " não encontrado no acervo.");
    }

    public void devolverLivro(Long idLivro) {
        for (Livro livro : acervo) {
            if (livro.getIdLivro().equals(idLivro)) {
                if (livro.isEmprestado()) {
                    livro.setEmprestado(false);
                    System.out.println("Livro '"+ livro.getNomeLivro() + "' (ID: " + idLivro + ") devolvido com sucesso!");
                    return;
                } else {
                    System.out.println("Erro: Livro '" + livro.getNomeLivro() + "' (ID: " + idLivro + ") não está emprestado.");
                    return;
                }
            }
        }
        System.out.println("Erro: Livro com ID " + idLivro + " não encontrado no acervo.");
    }
}
