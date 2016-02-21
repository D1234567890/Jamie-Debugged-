import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Goodbye {
	Font font;
	JFrame frame;
	JPanel panel;
	JLabel label;

	@SuppressWarnings("static-access")
	void frameDisplayer() {
		Jamie james = new Jamie();
		font = new Font("Arial", Font.BOLD, 15);
		frame = new JFrame("Goodbye!");
		frame.setVisible(true);
		frame.setSize(1300, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		frame.add(panel);
		label = new JLabel();
		label.setFont(font);
		label.setText("Goodbye! Hope you enjoyed using me and be sure to tell other people about it! This is your custom-made message inprinted with your favorite color!");
		panel.add(label);
		if (james.favoriteColorr.contains("red")) {
			label.setForeground(Color.red);
		} else if (james.favoriteColorr.contains("blue")) {
			label.setForeground(Color.blue);
		} else if (james.favoriteColorr.contains("yellow")) {
			label.setForeground(Color.yellow);
		} else if (james.favoriteColorr.contains("green")) {
			label.setForeground(Color.green);
		} else if (james.favoriteColorr.contains("orange")) {
			label.setForeground(Color.orange);
		} else if (james.favoriteColorr.contains("black")) {
			label.setForeground(Color.black);
		} else if (james.favoriteColorr.contains("purple")) {
			label.setForeground(Color.magenta);
		} else if (james.favoriteColorr.contains("white")) {
			label.setForeground(Color.white);
		} else if (james.favoriteColorr.contains("pink")) {
			label.setForeground(Color.pink);
		} else if (james.favoriteColorr.contains("brown")) {
			james.joptionpane = "I am sorry! I cannot make a brown message for this because I do not have the ability!";
			james.speak(james.joptionpane);
			JOptionPane.showMessageDialog(null, james.joptionpane);
		} else if (james.favoriteColorr.contains("gray")) {
			label.setForeground(Color.gray);
		} else {
			james.joptionpane = "I am sorry! I do not know of such a color of " + james.favoriteColorr + " to make your special custom-made message that color!";
			james.speak(james.joptionpane);
			JOptionPane.showMessageDialog(null, james.joptionpane);
		}
		james.speak("Okay! Bye!");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("WARNING! Cannot make system sleep!");
		}
		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
	}
}