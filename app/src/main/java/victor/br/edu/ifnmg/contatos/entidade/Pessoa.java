package victor.br.edu.ifnmg.contatos.entidade;

/**
 * Created by aluno on 03/12/15.
 */
public class Pessoa {
    private long id;
    private String nome;
    private String telefone;
    private String email;
    private String pathFoto;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPathFoto() {
        return pathFoto;
    }

    public void setPathFoto(String pathFoto) {
        this.pathFoto = pathFoto;
    }

     @Override
    public String toString() {
        return    nome +"\n"
                + telefone +"\n"
                + email +"\n";
    }
}
