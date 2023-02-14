import javax.swing.*;
import java.awt.Color;

//Test
public class MiniFrame extends JFrame {

    MiniFrame(){
//        JFrame f = new JFrame();

        this.setTitle("Is Hackathon fun?");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(690,690);
        this.setVisible(true);

        ImageIcon img = new ImageIcon("top text.jpg");
        this.setIconImage(img.getImage());
        this.getContentPane().setBackground(new Color(255,150,180));
    }

}
