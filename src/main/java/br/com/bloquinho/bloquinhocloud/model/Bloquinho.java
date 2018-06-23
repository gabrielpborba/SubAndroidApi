package br.com.bloquinho.bloquinhocloud.model;


        import org.springframework.data.annotation.Id;
        import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Bloquinho {

    @Id
    private String id;
    private String nome;
    private String descricao;
    private String endereco;
    private String data;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}