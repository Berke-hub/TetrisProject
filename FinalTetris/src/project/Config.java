package project;

import java.awt.*;

final class Config {

	final static Color[] color = {Color.CYAN, Color.ORANGE, Color.MAGENTA, Color.YELLOW,
			Color.PINK, Color.GREEN, Color.LIGHT_GRAY};
 
	final static Font mainFont = new Font("Courier", Font.BOLD, 50);
	final static Font scoreFont = mainFont.deriveFont(Font.BOLD, 25);
	final static Font guidanceFont = mainFont.deriveFont(Font.PLAIN, 25);
	
	final static Dimension d = new Dimension (1000, 1000);
	
    final static Rectangle main = new Rectangle(50, 50, 650, 900);
    final static Rectangle preview = new Rectangle(750, 350, 200, 200);
    final static Rectangle title = new Rectangle(250, 200, 250, 100);
    final static Rectangle clickGuidance = new Rectangle(50, 700, 450, 60);
    //final static Rectangle scoreBoard = new Rectangle(750,650,200,400);
    
    final static int blockSize = 50;
    final static int countRows = 18;
    final static int countCols = 14;
    
    final static int topMargin = 75;
    final static int leftMargin = 25;
   
    final static int titleX = 285;
    final static int titleY = 265;
    
    final static int clickX = 120;
    final static int clickY = 740;
    
    final static int previewX = 825;
    final static int previewY = 375;
 
    final static int scoreX = 725;
    final static int scoreY = 650;
    
    final static Stroke largeStroke = new BasicStroke(5);
    final static Stroke smallStroke = new BasicStroke(2);
 
    final static Color titleBackground = Color.WHITE;
    final static Color text = new Color(0x9AB8FE);
    final static Color background = new Color(0xC3DFFE);
    final static Color gridBorder = new Color(0x9AB8FE);
    final static Color gridColor = new Color(0xB3CAFE);
    final static Color tetrominoeBorder = Color.WHITE;
	
	
	
}
