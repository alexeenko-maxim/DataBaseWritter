package words;

import dataBase.Configs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.*;

public class ControllerGUI extends Configs implements ActionListener {

    public static Statement stmt;
    public static ResultSet rs;
    public static String en;
    public static String ru;

    public void actionPerformed(ActionEvent e) {

        writteToDB(GUI.jTextFieldEn.getText(), GUI.jTextFieldTrans.getText(), GUI.jTextFieldRu.getText(), String.valueOf(GUI.jCombo.getSelectedItem()));
    }

    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        Class.forName(URL_SQL);

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        return dbConnection;

    }


    public void writteToDB(String en, String trans, String ru, String part_of_speech) {
        String insert = "INSERT INTO " + Configs.USER_TABLE + "(" + Configs.EN + "," + Configs.TRANS + "," + Configs.RU + "," + Configs.PART_OF_SPEECH + ")" + "VALUES(?,?,?,?)";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1, en);
            prst.setString(2, trans);
            prst.setString(3, ru);
            prst.setString(4, part_of_speech);
            System.out.println(insert);

            prst.executeUpdate();
            System.out.println("Запись добавлена");
            clearAllInputField();
            System.out.println("Поля очищенны");

        } catch (SQLException throwables) {
            System.out.println(insert);
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println(insert);
            e.printStackTrace();

        }

    }

    public void changeRuAndPartOfSpeech(String en, String ru) {
        String insert = "UPDATE tablet SET ru = " + ru + "," + "part_of_speech = \"Noun\" WHERE en = \"" + en + " AND part_of_speech = \"Verb+Noun\" LIMIT 1";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1, en);
            prst.setString(2, ru);
            System.out.println(insert);

            prst.executeUpdate();
            System.out.println("Запись добавлена");
            clearAllInputField();
            System.out.println("Поля очищенны");

        } catch (SQLException throwables) {
            System.out.println(insert);
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println(insert);
            e.printStackTrace();

        }

    }

    public void clearAllInputField(){
        GUI.jTextFieldEn.setText("");
        GUI.jTextFieldTrans.setText("");
        GUI.jTextFieldRu.setText("");
        GUI.jCombo.setSelectedIndex(0);
    }



    public static void readEnFromDB() throws SQLException, IOException {

        try {

            Connection con = DriverManager.getConnection(DB_URL, DBLogin, DBPass);//соединениесБД
            System.out.println("Соединение с СУБД выполнено.");
            System.out.println();
            stmt = con.createStatement();
            rs = stmt.executeQuery(querySelectEnWhereVerbandNoun);

            while (rs.next()) {

                en = rs.getString(1);
                System.out.println(en);
            }

        } catch (SQLException throwables) {
            System.out.println(en);
            throwables.printStackTrace();
        }

    }
    public static void readRuFromDB() throws SQLException, IOException {

        try {

            Connection con = DriverManager.getConnection(DB_URL, DBLogin, DBPass);//соединениесБД
            System.out.println("Соединение с СУБД выполнено.");
            System.out.println();
            stmt = con.createStatement();
            rs = stmt.executeQuery(querySelectRuWhereVerbandNoun);

            while (rs.next()) {

                ru = rs.getString(1);
                System.out.println(ru);
            }

        } catch (SQLException throwables) {
            System.out.println(ru);
            throwables.printStackTrace();
        }

    }
}


