package words;

import dataBase.Configs;

import javax.swing.*;
import java.awt.event.ActionListener;



public class GUI {

    static JTextField jTextFieldEn;
    static JTextField jTextFieldTrans;
    static JTextField jTextFieldRu;
    static JComboBox jCombo;

    public static void initGUI() {

        JFrame jFrame = new JFrame("DBWritter");
        jFrame.setAlwaysOnTop(true);
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel jLabelEn = new JLabel("En");
        jLabelEn.setSize(160, 25);
        jLabelEn.setLocation(40, 20);
        panel.add(jLabelEn);


        jTextFieldEn = new JTextField();
        jTextFieldEn.setSize(200, 25);
        jTextFieldEn.setLocation(160, 20);
        panel.add(jTextFieldEn);


        JLabel jLabelTrans = new JLabel("Trans");
        jLabelTrans.setSize(160, 25);
        jLabelTrans.setLocation(40, 60);
        panel.add(jLabelTrans);

        jTextFieldTrans = new JTextField();
        jTextFieldTrans.setSize(200, 25);
        jTextFieldTrans.setLocation(160, 60);

        panel.add(jTextFieldTrans);

        JLabel jLabelRu = new JLabel("Ru");
        jLabelRu.setSize(160, 25);
        jLabelRu.setLocation(40, 100);
        panel.add(jLabelRu);

        jTextFieldRu = new JTextField();
        jTextFieldRu.setSize(200, 25);
        jTextFieldRu.setLocation(160, 100);
        panel.add(jTextFieldRu);


        JLabel jTextLabelPartOfSpeech = new JLabel("PartOfSpeech");
        jTextLabelPartOfSpeech.setSize(200, 25);
        jTextLabelPartOfSpeech.setLocation(40, 140);
        panel.add(jTextLabelPartOfSpeech);


        jCombo = new JComboBox(Configs.listPartOfSpeech);
        jCombo.setSize(200, 25);
        jCombo.setLocation(160, 140);
        panel.add(jCombo);

        JButton jBtn = new JButton("Отправить");
        jBtn.setSize(160, 40);
        jBtn.setLocation(200, 190);
        panel.add(jBtn);
        ActionListener actionListener = new ControllerGUI();
        jBtn.addActionListener(actionListener);


        jFrame.setContentPane(panel);
        jFrame.setSize(400, 300);
        jFrame.setVisible(true);
    }
}
