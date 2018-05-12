package amigoool.hamilton.com.amigoool.model.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import amigoool.hamilton.com.amigoool.Util.data.DataBase;

/**
 * Created by Hamilton on 12/04/2018.
 */

public class JogadoresDAO {

    private SQLiteDatabase conexao;
    private DataBase banco;
    private Context context;

    public  JogadoresDAO(Context context){
        banco = new DataBase(context);
        this.context = context;
    }

    public void open(){
        conexao = banco.getWritableDatabase();
    }

    public void close(){
        conexao.close();
    }
}
