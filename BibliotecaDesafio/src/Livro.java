import java.time.LocalDate; // Importa a classe LocalDate para trabalhar com datas

public class Livro {
    private Long idLivro;
    private String nomeLivro;
    private String autor;
    private boolean emprestado;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;

    public Livro(Long idLivro, String nomeLivro, String autor) {
        this.idLivro = idLivro;
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.emprestado = false;
        this.dataCadastro = LocalDate.now();
        this.dataAtualizacao = LocalDate.now();
    }

    // Getters

    public Long getIdLivro() {
        return idLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    // Setters

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
        this.dataAtualizacao = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Livro{" +
                "idLivro=" + idLivro +
                ", nomeLivro='" + nomeLivro + '\'' +
                ", autor='" + autor + '\'' +
                ", emprestado=" + emprestado +
                ", dataCadastro=" + dataCadastro +
                ", dataAtualizacao=" + dataAtualizacao +
                '}';
    }
}