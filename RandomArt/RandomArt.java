import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class RandomArt implements MouseListener {

	private JFrame frame;
	private MyDrawPanel panel;


	public static void main(String[] args) {
		new RandomArt().go();
	}

	public void go() {
		frame = new JFrame();
		panel = new MyDrawPanel();
		panel.addMouseListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setVisible(true);
	}


	class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			Color red = new Color(150,0,0);
			Color black = new Color(0,0,0);
			Color white = new Color(200,200,200);
			ArrayList<Color> colors = new ArrayList<Color>();
			colors.add(red);
			colors.add(black);
			colors.add(white);
			int randCol;

			for (int x = 0; x < this.getWidth(); x +=2) {
				for (int y = 0; y < this.getHeight(); y +=2) {
					randCol = new Random().nextInt(3);
					g.setColor(colors.get(randCol));
					g.fillRect(x,y,2,2);
				}
			}
		}
	}

	public void mouseClicked(MouseEvent e) {
       panel.repaint();
    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {
    	
    }

    public void mousePressed(MouseEvent e) {
    	
    }

    public void mouseReleased(MouseEvent e) {
    	
    }
}