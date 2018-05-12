package amigoool.hamilton.com.amigoool.model.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import amigoool.hamilton.com.amigoool.Util.data.DataBase;
import amigoool.hamilton.com.amigoool.model.Player;
import amigoool.hamilton.com.amigoool.model.Time;

/**
 * Created by Hamilton on 12/04/2018.
 */

public class PlayerDAO {

    private SQLiteDatabase conexao;
    private DataBase banco;
    private Context context;

    public  PlayerDAO(Context context){
        banco = new DataBase(context);
        this.context = context;
    }

    public void open(){
        conexao = banco.getWritableDatabase();
    }

    public void close(){
        conexao.close();
    }

    public Player get(int idx){
        String[] campos = {DataBase.FIELD_PLAYER_ID, DataBase.FIELD_PLAYER_NOME};
        String where = DataBase.FIELD_PLAYER_ID+" = '"+idx+"' ";

        Cursor cursor = conexao.query(DataBase.TABELA_PLAYER,campos,where,
                null,null,null,null);
        Player pl = null;

        if (cursor.moveToNext()){
            pl = new Player();
            pl.setId(cursor.getInt(0));
            pl.setNome(cursor.getString(1));

        }

        return pl;
    }

    public ArrayList<Player> findAll(){
        String [] campos = {DataBase.FIELD_PLAYER_ID,
                            DataBase.FIELD_PLAYER_NOME,
                            DataBase.FIELD_PLAYER_TIME};

        Cursor cursor = conexao.query(DataBase.TABELA_PLAYER, campos, null,
                null, null, null, DataBase.FIELD_PLAYER_ID);

        ArrayList<Player> lista = new ArrayList<>();

        while(cursor.moveToNext()){
            Player player = new Player();
            player.setId(cursor.getInt(0));
            player.setNome(cursor.getString(1));

            TimeDAO tDao = new TimeDAO(context);
            tDao.open();
            Time t = tDao.get(cursor.getInt(2));
            tDao.close();

            player.setTimes(t);
            lista.add(player);
        }

        return lista;
    }


    public void gravar(Player p){
        String insertPlayer = "insert into "+DataBase.TABELA_PLAYER
                +"("+DataBase.FIELD_PLAYER_NOME+","+DataBase.FIELD_PLAYER_TIME+") " +
                "values ('"+p.getNome()+"','"+p.getTimes().getId()+"')";
        conexao.execSQL(insertPlayer);
    }

     public void gravar1(Player p){

         ContentValues cv = new ContentValues();
         cv.put(DataBase.FIELD_PLAYER_NOME, p.getNome());
         cv.put(DataBase.FIELD_PLAYER_TIME, p.getTimes().getId());

         conexao.insert(DataBase.TABELA_PLAYER,null,cv);
    }


}
