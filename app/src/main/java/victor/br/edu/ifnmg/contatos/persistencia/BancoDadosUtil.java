package victor.br.edu.ifnmg.contatos.persistencia;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by aluno on 03/12/15.
 */
public class BancoDadosUtil extends SQLiteOpenHelper {

    private static final int VERSAO=1;
    private static final String TABELA_CONTATO="contato";
    private static final String DATABASE="db_contato.db";

    public BancoDadosUtil(Context context){
        super(context,DATABASE,null,VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String ddlContato = "CREATE TABLE "+ TABELA_CONTATO + " ( "
                +"[_id] INTEGER PRIMARY KEY AUTOINCREMENT, "
                +"nome TEXT, "
                +"telefone TEXT, "
                +"email TEXT, "
                +"pathFoto TEXT)";
        db.execSQL(ddlContato);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
