package gui.panel;

import utils.ColorUtil;
import utils.GUIUtil;

import javax.swing.*;

public class BackupPanel extends JPanel {
    static{
        GUIUtil.useLNF();
    }
    public static BackupPanel instance = new BackupPanel();
    JButton bBackup =new JButton("±¸·Ý");

    public BackupPanel() {
        GUIUtil.setColor(ColorUtil.blueColor, bBackup);
        this.add(bBackup);
    }

    public static void main(String[] args) {
        GUIUtil.showPanel(BackupPanel.instance);
    }

}
