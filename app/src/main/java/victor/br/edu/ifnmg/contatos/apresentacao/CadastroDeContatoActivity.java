package victor.br.edu.ifnmg.contatos.apresentacao;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import victor.br.edu.ifnmg.contatos.R;
import victor.br.edu.ifnmg.contatos.entidade.Pessoa;
import victor.br.edu.ifnmg.contatos.persistencia.PessoaDAO;

public class CadastroDeContatoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_de_contato);
    }

    public void salvar(View view){

        // instanciando objetos
        Pessoa pessoa = new Pessoa();
        PessoaDAO pessoaDAO = new PessoaDAO(this);

        // Recuperando os dado inseridos
        EditText edtNome = (EditText) findViewById(R.id.txtNome);
        EditText edtEmail = (EditText) findViewById(R.id.txtEmail);
        EditText edtTelefone = (EditText) findViewById(R.id.txtTelefone);

        pessoa.setNome(edtNome.getText().toString());
        pessoa.setEmail(edtEmail.getText().toString());
        pessoa.setTelefone(edtTelefone.getText().toString());

        pessoaDAO.inserir(pessoa);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(this);
        builder.setMessage("Contato Salvo com Sucesso!")
                .setTitle("Cadastro de contato");
        builder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id){
                dialog.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();

        edtNome.setText(" ");
        edtEmail.setText(" ");
        edtTelefone.setText(" ");
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cadastro_de_contato, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
