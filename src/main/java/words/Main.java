package words;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

public class Main {

    private static final Logger loger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException, SQLException {

//        GUI.initGUI();
        ControllerGUI.readEnFromDB();
        ControllerGUI.readRuFromDB();

    }
}
