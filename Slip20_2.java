import java.awt.*;
import javax.swing.*;

public class Slip20_2 extends JFrame implements Runnable {
    private JLabel l1;
    private boolean isVisible = false;

    public Slip20_2() {
        setLayout(new FlowLayout());
        
        ImageIcon ic = new ImageIcon("flower.jpeg");
        Image image = ic.getImage(); // Get the Image object from the ImageIcon
        Image resizedImage = image.getScaledInstance(1000, 1000, Image.SCALE_SMOOTH); // Resize the image
        ImageIcon resizedIcon = new ImageIcon(resizedImage); // Create a new ImageIcon with the resized image

        // Set the label with the resized image icon
        l1 = new JLabel(resizedIcon);
        add(l1);

        setTitle("Blink Image");
        setSize(1000, 1000); // Set the frame size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Start the blinking thread
        Thread t1 = new Thread(this);
        t1.start();
    }

    public void run() {
        try {
            while (true) {
                if (isVisible) {
                    l1.setVisible(false); // Hide the image
                } else {
                    l1.setVisible(true); // Show the image
                }
                isVisible = !isVisible; // Toggle visibility
                Thread.sleep(500); // Wait for 500 milliseconds
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Slip20_2(); // Create an instance of the JFrame
    }
}

