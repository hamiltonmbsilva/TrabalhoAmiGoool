package amigoool.hamilton.com.amigoool.Util.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.renderscript.Sampler;

/**
 * Created by Hamilton on 06/04/2018.
 */

public class DataBase extends SQLiteOpenHelper{

    public static final String dataBaseName = "jogos.db";
    public static final int dataBaseVersion =1;

    //campos da tabela player
    public static final String TABELA_PLAYER = "PLAYER";
    public static final String FIELD_PLAYER_ID = "id";
    public static final String FIELD_PLAYER_NOME = "nome";
    public static final String FIELD_PLAYER_TIME = "id_time";

    //campos da tabela time
    public static final String TABELA_TIME = "TIME";
    public static final String FIELD_TIME_ID = "id";
    public static final String FIELD_TIME_NOME = "NOME";

    //campos da tabela jogador
    public static final String TABELA_JOGADOR = "JOGADOR";
    public static final String FIELD_JOGADOR_ID = "id";
    public static final String FIELD_JOGADOR_NOME = "nome";
    public static final String FIELD_JOGADOR_TIME = "id_time";

    //campos da tabela jogos
    public static final String TABELA_JOGOS = "JOGOS";
    public static final String FIELD_JOGOS_ID = "id";
    public static final String FIELD_JOGOS_PLAYER_1 = "id_player_1";
    public static final String FIELD_JOGOS_PLAYER_2 = "id_player_2";
    public static final String FIELD_JOGOS_PLACAR_PLAYER_1 = "placar_player_1";
    public static final String FIELD_JOGOS_PLACAR_PLAYER_2 = "placar_player_2";

    //campos da tabela gol
    public static final String TABELA_GOL = "GOLS";
    public static final String FIELD_GOL_ID = "id";
    public static final String FIELD_GOL_TIME = "id_time";
    public static final String FIELD_GOL_JOGADOR = "id_jogador";

    public DataBase(Context context){
        super(context, dataBaseName, null, dataBaseVersion);
    }

    //criando a tabela player
    String sqlPlayer = "CREATE TABLE " + TABELA_PLAYER + "( " +
            FIELD_PLAYER_ID + " integer primary key autoincrement, " +
            FIELD_PLAYER_NOME + " text not null, " +
            FIELD_PLAYER_TIME + " integer not null " +
            ");";

    //criando a tabela time
    String sqlTime = "CREATE TABLE " + TABELA_TIME + "( " +
            FIELD_TIME_ID + " integer primary key, " +
            FIELD_TIME_NOME + " text not null " +
            ");";

    //criando a tabela player
    String sqlJogador = "CREATE TABLE " + TABELA_JOGADOR + "( " +
            FIELD_JOGADOR_ID + " integer primary key , " +
            FIELD_JOGADOR_NOME + " text not null, " +
            FIELD_JOGADOR_TIME + " integer not null " +
            ");";

    //criando a tabela jogos
    String sqlJogos = "CREATE TABLE " + TABELA_JOGOS + "( " +
            FIELD_JOGOS_ID + " integer primary key autoincrement, " +
            FIELD_JOGOS_PLAYER_1 + " integer not null, " +
            FIELD_JOGOS_PLAYER_2 + " integer not null, " +
            FIELD_JOGOS_PLACAR_PLAYER_1 + " integer not null, " +
            FIELD_JOGOS_PLACAR_PLAYER_2 + " integer not null " +
            ");";
    //criando a tabela gol
    String sqlGoal = "CREATE TABLE " + TABELA_GOL + "( " +
            FIELD_GOL_ID + " integer primary key autoincrement, " +
            FIELD_GOL_TIME + " integer not null, " +
            FIELD_GOL_JOGADOR + " integer not null " +
            ");";

    //***********************************************************************************************************************************

    //inserindo valores na tabela time
    String insertTime = "INSERT INTO " + TABELA_TIME
            +"("+FIELD_TIME_ID+","+FIELD_TIME_NOME+") " +
            "VALUES (1, 'VASCO'), (2, 'BOTAFOGO'), (3, 'FLAMENGO'), (4, 'FLUMINENSE')";

    //inserindo valores na tabela jogadores
    String insertJogadores = "INSERT INTO " + TABELA_JOGADOR
            +"("+FIELD_JOGADOR_ID+","+FIELD_JOGADOR_NOME+","+FIELD_JOGADOR_TIME+") " +
            "VALUES " +
            "(1,'MARTIN SILVA',1),(2,'GABRIEL',1)," +
            "(3,'JOÃO PEDRO',1),(4,'PAULÃO',1)," +
            "(5,'BRENO',1), (6,'ERAZO',1)," +
            "(7,'PAULINHO',1), (8,'ANDRE RIOS',1)," +
            "(9,'EVANDER',1), (10,'YAGO PIKACHU',1)," +
            "(11,'RIASCOS',1)," +
            "" +
            "(12,'JEFFERSON',2),(13,'JOEL CARLI',2)," +
            "(14,'LUIS RICARDO',2),(15,'MARCIO ALMEIDA',2)," +
            "(16,'MATHUES FERNANDES',2),(17,'RODRIGO LINDOSO',2)," +
            "(18,'LUIZ FERNANDO',2),(19,'RENATINHO',2)," +
            "(20,'JOÃO PAULO',2),(21,'MARCOS VINÍCIUS',2)," +
            "(22,'RODRIGO PIMÃO',2)," +
            "" +
            "(23,'JÚLIO CESAR',3),(24,'JUAN',3)," +
            "(25,'REVER',3),(26,'TRAUCO',3)," +
            "(27,'RODINEI',3),(28,'PARÁ',3)," +
            "(29,'DIEGO',3),(30,'WILLIAN ARÃO',3)," +
            "(31,'EVERTON RIBEIRO',3),(32,'PAOLO GUERRERO',3)," +
            "(33,'VINÍVIUS JÚNIOR',3)," +
            "" +
            "(34,'JÚLIO CESAR JABOBI',4),(35,'GUM',4)," +
            "(36,'GILBERTO MORAIS',4),(37,'RENATO DE ARAÚJO',4)," +
            "(38,'GUSTAVO SCARPA',4),(39,'JUNIOR SORNOZA',4)," +
            "(40,'PABLO DYEGO',4),(41,'AIRTON RIBEIRO',4)," +
            "(42,'MATHEUS ALESSANDRO',4),(43,'PEDRO',4)," +
            "(44,'MARCOS JÚNIOR',4)";

    //*********************************************************************************************************************************

    //Não tinha os insertes das tabelas Player, Jogos, Gol criei esses pq achei que seria necessario
    String insertPlayer = "INSERT INTO " + TABELA_PLAYER
            +"("+FIELD_PLAYER_NOME+","+FIELD_PLAYER_TIME+") " +
            "values('Hamilton', 3)";

    String insertJogos = "INSERT INTO " + TABELA_JOGOS
            +"("+FIELD_JOGOS_PLACAR_PLAYER_1+","+FIELD_JOGOS_PLACAR_PLAYER_2+"," +
            ""+FIELD_JOGOS_PLAYER_1+","+FIELD_JOGOS_PLAYER_2+")";

    String insertGoal = "INSERT INTO " + TABELA_GOL
            +"("+FIELD_GOL_JOGADOR+","+FIELD_GOL_TIME+")";



    @Override
    public void onCreate(SQLiteDatabase db) {
        //executa as sqls para criar as tabelas e os campos
        db.execSQL(sqlPlayer);
        db.execSQL(sqlTime);
        db.execSQL(sqlJogador);
        db.execSQL(sqlJogos);
        db.execSQL(sqlGoal);

        db.execSQL(insertPlayer);
        db.execSQL(insertTime);
        db.execSQL(insertJogadores);
       // db.execSQL(insertJogos);
       // db.execSQL(insertGoal);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //se a versao do banco for !=, ele apaga as tabelas
        db.execSQL("DROP TABLE "+TABELA_PLAYER);
        db.execSQL("DROP TABLE "+TABELA_TIME);
        db.execSQL("DROP TABLE "+TABELA_JOGADOR);
        db.execSQL("DROP TABLE "+TABELA_JOGOS);
        db.execSQL("DROP TABLE "+TABELA_GOL);

        //cria novamente as tabelas
        onCreate(db);
    }
}
