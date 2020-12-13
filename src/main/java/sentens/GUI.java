package sentens;

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
        jLabelEn.setLocation(20, 20);
        panel.add(jLabelEn);

        jTextFieldEn = new JTextField();
        jTextFieldEn.setSize(220, 25);
        jTextFieldEn.setLocation(140, 20);
        panel.add(jTextFieldEn);

        JLabel jLabelRu = new JLabel("Ru");
        jLabelRu.setSize(160, 25);
        jLabelRu.setLocation(20, 60);
        panel.add(jLabelRu);

        jTextFieldRu = new JTextField();
        jTextFieldRu.setSize(220, 25);
        jTextFieldRu.setLocation(140, 60);
        panel.add(jTextFieldRu);



        JLabel jTextLabelTypeSentens = new JLabel("TypeSentens");
        jTextLabelTypeSentens.setSize(200, 25);
        jTextLabelTypeSentens.setLocation(20, 100);
        panel.add(jTextLabelTypeSentens);


        jCombo = new JComboBox(Configs.listTypeSentens);
        jCombo.setSize(220, 25);
        jCombo.setLocation(140, 100);
        panel.add(jCombo);

        JLabel jTextLabelTimeSentens = new JLabel("TimeSentens");
        jTextLabelTimeSentens.setSize(200, 25);
        jTextLabelTimeSentens.setLocation(20, 140);
        panel.add(jTextLabelTimeSentens);


        jCombo = new JComboBox(Configs.listTimeSentens);
        jCombo.setSize(220, 25);
        jCombo.setLocation(140, 140);
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
