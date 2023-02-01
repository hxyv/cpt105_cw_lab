/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet2033924;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author xingyu hu
 */
public class Q1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Data Package Convert");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 170);
        
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        
        // JLabel
        JLabel rawDataJLabel = new JLabel("Raw data: ");
        rawDataJLabel.setBounds(10,20,100,30);
        panel.add(rawDataJLabel);
        
        JLabel dataPackageJLabel = new JLabel("Data package: ");
        dataPackageJLabel.setBounds(10,60,100,30);
        panel.add(dataPackageJLabel);
        
        // JTextField
        JTextField rawDataText = new JTextField(20);
        rawDataText.setBounds(120,20,165,30);
        panel.add(rawDataText);
        
        JTextField dataPackageText = new JTextField(20);
        dataPackageText.setBounds(120,60,165,30);
        panel.add(dataPackageText);
        
        // JButton
        JButton dataToPackageButton = new JButton("Data to package");
        dataToPackageButton.setBounds(10,100,150,30);
        panel.add(dataToPackageButton);
        
        JButton packageToDataText = new JButton("Package to data");
        packageToDataText.setBounds(180, 100, 150, 30);
        panel.add(packageToDataText);
        
        frame.setVisible(true);
        
        // Actions
        DataPacket dp= new DataPacket();
        // Encapsulate raw data to data package
        dataToPackageButton.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {
            String input = rawDataText.getText();
            String dataPackage = dp.convertToDataPacket(input);
            dataPackageText.setText(dataPackage);
        }});
        
        // Retrieve the data string from the data package
        packageToDataText.addActionListener(new ActionListener() {public void actionPerformed (ActionEvent e) {
            String input = dataPackageText.getText();
            String rawData = null;
            try {
                rawData = dp.getDataFromDataPacket(input);
            } catch (DataPacketException dataPacketException) {
                dataPacketException.printStackTrace();
            }
            rawDataText.setText(rawData);
        }});
    }
}
