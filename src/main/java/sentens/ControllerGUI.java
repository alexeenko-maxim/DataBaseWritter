package sentens;

import dataBase.Configs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControllerGUI extends Configs implements ActionListener {

    Connection dbConnection;

    public void actionPerformed(ActionEvent e) {

        writteToDB(GUI.jTextFieldEn.getText(), GUI.jTextFieldTrans.getText(), GUI.jTextFieldRu.getText(), String.valueOf(GUI.jCombo.getSelectedItem()));
    }

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {

        Class.forName(DB_Driver);

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
}


