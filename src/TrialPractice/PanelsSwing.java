package TrialPractice;
import javax.swing.*;
import java.awt.*;
//NOTE Panels by Default use Flow Layout while Frames use Border Layout
public class PanelsSwing {
    public static void main(String[] args) {

        ImageIcon myicon = new ImageIcon("MyPurple2.jpg");

        JLabel label = new JLabel();
        label.setText("This is BLUE");
        label.setForeground(Color.ORANGE);
        label.setIcon(myicon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);

        JPanel blackpanel = new JPanel();
        blackpanel.setBackground(Color.black);
        blackpanel.setBounds(0 , 0 , 250 , 250);
        blackpanel.setLayout(new BorderLayout());

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(250 , 0 , 250 , 250);
        bluepanel.setLayout(new BorderLayout());//set layout first then add label
        bluepanel.add(label);


        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.GREEN);
        greenpanel.setBounds(0 , 250 , 250 , 250);
        greenpanel.setLayout(new BorderLayout());

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(250 , 250 , 250 , 250);
        redpanel.setLayout(new BorderLayout());

        JFrame myframe = new JFrame();
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setResizable(false);
        myframe.setLayout(null);
        myframe.setSize(750 , 750);
        myframe.setVisible(true);
        myframe.add(blackpanel);
        myframe.add(bluepanel);
        myframe.add(greenpanel);
        myframe.add(redpanel);
        //myframe.setIconImage(myicon.getImage());

    }
}
