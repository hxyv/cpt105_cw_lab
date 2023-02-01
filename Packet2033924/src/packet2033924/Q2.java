/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet2033924;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author xingyu hu
 */
public class Q2 {
    public static void main(String[] args) throws Exception{
        JFrame frame = new JFrame("Multiple Data Package Convert");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 700);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        
        // Picture
        ImageIcon photo = new ImageIcon("src/photo/photo.jpg");
        JLabel xingyu = new JLabel(photo);
        xingyu.setBounds(200,10,100,100);
        panel.add(xingyu);
        
        // JLabel
        // Personal information
        JLabel pi = new JLabel("<html><body>Name: Xingyu Hu"
                + "<br>Gender: Male"
                + "<br>StuID: 2033924</body></html>");
        pi.setBounds(20, 30, 170, 70);
        pi.setForeground(Color.RED);
        panel.add(pi);
        
        JLabel rawData1JLabel = new JLabel("Raw data 1:");
        rawData1JLabel.setBounds(20, 150, 160, 30);
        panel.add(rawData1JLabel);
        
        JLabel rawData2JLabel = new JLabel("Raw data 2:");
        rawData2JLabel.setBounds(20, 260, 160, 30);
        panel.add(rawData2JLabel);
        
        JLabel rawData3JLabel = new JLabel("Raw data 3:");
        rawData3JLabel.setBounds(20, 370, 160, 30);
        panel.add(rawData3JLabel);
        
        JLabel multiDataPack = new JLabel("Multi data package:");
        multiDataPack.setBounds(20, 480, 160, 30);
        panel.add(multiDataPack);
        
        // JTextField
        JTextField rawData1Text = new JTextField();
        rawData1Text.setBounds(200, 120, 180, 80);
        panel.add(rawData1Text);
        
        JTextField rawData2Text = new JTextField();
        rawData2Text.setBounds(200, 230, 180, 80);
        panel.add(rawData2Text);
        
        JTextField rawData3Text = new JTextField();
        rawData3Text.setBounds(200, 340, 180, 80);
        panel.add(rawData3Text);
        
        JTextField multiDataPackText = new JTextField();
        multiDataPackText.setBounds(200, 450, 180, 80);
        panel.add(multiDataPackText);
        
        // JButton
        JButton dataToMultiPackBut = new JButton("Data to multi package");
        dataToMultiPackBut.setBounds(20, 550, 170, 80);
        panel.add(dataToMultiPackBut);
        
        JButton multiPackToDataBut = new JButton("Multi package to data");
        multiPackToDataBut.setBounds(200, 550, 170, 80);
        panel.add(multiPackToDataBut);
        
        frame.setVisible(true);
        
        // Actions
        MultiDataPacket mdp = new MultiDataPacket();
        
        // Convert raw data to multi data package
        dataToMultiPackBut.addActionListener(new ActionListener() {public void actionPerformed (ActionEvent e) {
           String[] rawData = new String[3]; 
               rawData[0] = rawData1Text.getText();
               rawData[1] = rawData2Text.getText();
               rawData[2] = rawData3Text.getText();
               String multiDataStr = mdp.convertToHexDataPacket(rawData);
               multiDataPackText.setText(multiDataStr);
            }});
        
        // Convert multi data package to raw data
        multiPackToDataBut.addActionListener(new ActionListener() {public void actionPerformed (ActionEvent e) {
            String multiDataStr = multiDataPackText.getText();
            String[] rawData = new String[3];
            try {
                rawData = mdp.getMultiDataFromHexDataPacket(multiDataStr);
            }catch (DataPacketException dataPacketException){
                JOptionPane.showMessageDialog(panel, dataPacketException);
            }
            rawData1Text.setText(rawData[0]);
            rawData1Text.setText(rawData[1]);
            rawData1Text.setText(rawData[2]);
        }});
    }
}
