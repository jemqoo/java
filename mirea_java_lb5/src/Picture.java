import java.awt.*;
import javax.swing.*;
public class Picture extends JPanel {
    Image img = new ImageIcon("C:/Users/user/Pictures/26d9a41c7534f4ee5cd3eb744ff78f61.jpg").getImage();
    public static void main(String[] args){
        JFrame fr = new JFrame();
        fr.setLayout(null);
        fr.setSize(1000, 650);
        Picture p = new Picture();
        p.setBounds(0,0,1000,650);
        fr.add(p);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public void paintComponent(Graphics g)
    {
        g.drawImage(img,0,0,null);
    }
}
