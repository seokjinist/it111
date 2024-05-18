import javax.swing. *;
import java.awt.*;

public class ShowWindow2 extends JFrame {


    JPanel panel;
    JLabel messageLabel;
    JLabel messageLabel2;
    JTextField myTextField;
    JTextField myTextField2;


    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 450;


    public ShowWindow2(){
        setTitle("A Simple Window");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

            // Close the window and close the program
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();

        add(panel);

        //This will change the location of the window
        setLocation(500, 150);

        setVisible(true);
    }

    public void buildPanel(){
        Font customFont = new Font("Arial", Font.PLAIN, 18); //Changes the font and size of the text
        messageLabel = new JLabel("My First Big Label!!!");
        messageLabel.setFont(customFont);

        Font customFont2 = new Font("Arial", Font.BOLD, 24); //Changes the font and size of the text
        messageLabel2 = new JLabel("My Second Big Label!!!");
        messageLabel2.setFont(customFont2);

        messageLabel.setOpaque(true);
        messageLabel.setBackground(Color.red); //changes the color to red


        myTextField = new JTextField(20); // Increased columns to make the text field wider
        myTextField.setPreferredSize(new Dimension(10, 50)); // Set preferred width and height
        myTextField2 = new JTextField(20); // Increased columns to make the text field wider
        myTextField2.setPreferredSize(new Dimension(10, 50)); // Set preferred width and height


        panel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // moved the layout to the left
        panel.setBackground(Color.red);

        panel.add(messageLabel);
        panel.add(myTextField);
        panel.add(messageLabel2);
        panel.add(myTextField2);


    }

    public static void main(String[]args){
        new ShowWindow2();

    }
}