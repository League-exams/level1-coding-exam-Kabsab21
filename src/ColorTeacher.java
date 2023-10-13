import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton yellow = new JButton();
JButton red = new JButton();
JButton blue = new JButton();
JButton green = new JButton();

public static void main(String[] args) {
	ColorTeacher teach = new ColorTeacher();
	teach.prep();
}

void prep() {
	panel.add(yellow);
	panel.add(blue);
	panel.add(red);
	panel.add(green);
	frame.add(panel);
	yellow.setBackground(Color.YELLOW);
	yellow.setOpaque(true);
	red.setBackground(Color.RED);
	red.setOpaque(true);
	blue.setBackground(Color.BLUE);
	blue.setOpaque(true);
	green.setBackground(Color.GREEN);
	green.setOpaque(true);
	frame.setTitle("Color Teacher");
	frame.setVisible(true);
	frame.pack();
}

}
