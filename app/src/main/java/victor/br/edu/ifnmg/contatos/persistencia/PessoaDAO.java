package victor.br.edu.ifnmg.contatos.persistencia;

import android.content.ContentValues;
import android.content.Context;

import victor.br.edu.ifnmg.contatos.entidade.Pessoa;

/**
 * Created by aluno on 03/12/15.
 */
public class PessoaDAO {
    private Context context;
    private static final String TABELA_CONTATO="contato";
    private static final String SQL_SELECT_TODOS = "SELECT + FROM contato";

    //Construtor- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    public PessoaDAO(Context context){
        this.context = context;
    }

    //Método Inserir- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    public void inserir(Pessoa pessoa){
        //Objeto para armazenar os valores dos campos
        ContentValues values = new ContentValues();

        //Definição de valores dos campos das tabelas - - - - - - - - - - - - - - - - - - - - - - -
        values.put("nome",pessoa.getNome());
        values.put("Telefone",pessoa.getTelefone());
        values.put("Email",pessoa.getEmail());
       // values.put("pathFoto",pessoa.getPathFoto());

        BancoDadosUtil bdUtil = new BancoDadosUtil(context);
        bdUtil.getWritableDatabase().insert(TABELA_CONTATO,null,values);
        bdUtil.close();
    }
}
