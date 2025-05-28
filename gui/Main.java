import java.awt.Color;
import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    String version = "1.0.0";

    JFrame mframe = new JFrame();
    mframe.setTitle("Zephr " + version);
    mframe.setSize(420, 420);
    mframe.getContentPane().setBackground(Color.black);



    
    mframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mframe.setResizable(true);
    mframe.setVisible(true);
  }
}
