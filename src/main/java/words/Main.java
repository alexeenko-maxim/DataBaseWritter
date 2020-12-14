package words;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

import static supportFunction.SupportFun.deteteVerbFromString;


public class Main extends ControllerGUI{

    private static final Logger loger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException, SQLException, InterruptedException {

//        deteteVerbFromString(readRuFromDB());//Метод должен получить на вход оригинальный перевод RU и отдать отредактированный перевод

        for (int i = 0; i<6000; i++){
            changeRuAndPartOfSpeech(readEnFromDB(), deteteVerbFromString(readRuFromDB()));//Метод должен принять на вход значение en из метода readEnFromDB() и значение ru из метода deteteVerbFromString()
            stmt.close();
            rs.close();
            dbConnection.close();


            System.out.println("Пауза 3 секунд...");
            System.out.println();
            Thread.sleep(3000);
        }



    }
}
