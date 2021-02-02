package tutorial_142_and_143_packages_part_1_and_2;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame{

	   public MyWindow(String title) {
	        super(title);
	        setSize(500, 140);
	        addWindowListener(new WindowAdapter() {
	            @Override
	            public void windowClosed(WindowEvent e) {
	                System.exit(0);
	            }
	        });
	    }

	    @Override
	    public void paint(Graphics g) {
	        super.paint(g);
	        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
	        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
	        g.setFont(sansSerifLarge);
	        g.drawString("The Complete Java Developer Course", 60, 60);
	        g.setFont(sansSerifSmall);
	        g.drawString("by Tim Buchalka", 60, 100);
	    }
}
