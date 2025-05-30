import javax.swing.JFrame;

public class AlienInvade exnteds JPanel implements KeyListener {
  private int playerX = 100;
  private int playerY = 100; 
  private final int speed = 5;
  
  public static void main(String[] args) {
    int time = 0;
    int score = 0;

  public AlienInvade(){
    JFrame frame = new JFrame("AlienInvade");  
    frame.setSize(100, 100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(this)
    frame.setVisible(true);
    frame.addKeyListener(this);
  }
    
  public void paintComponent(Graphics g){
    super.paintComponenet(g);
    g.setColor(Color.BLUE);
    g.fillRect(playerX, playerY, 50, 50);
  }

  public void keyPressed(KeyEvent e){
    int keyInput = e.getKeyCode();
    if(keyInput == KeyEvent.VK_LEFT){
      playerX -= speed;
    }else if(keyInput == KeyEvent.VK_RIGHT){
      playerX += speed;
    }else if(keyInput == KeyEvent.VK_UP){
      playerY -=speed;
    }else if(keyInput == KeyEvent.VK_DOWN){
      playerY += speed;
    }
    repaint();
  }

  public void keyReleased(KeyEvent e){}

  public void keyTyped(KeyEvent e){}

  public static void main(String[] args){
    new AllenInvade();
  }
}

    Player player = new Player()
    while (true) {
      if (time != 10) {
        time++;
      } else {
        time = 0;
      }
      
      try {
       Thread.sleep(10);
      } catch (InterruptedException e) {
       e.printStackTrace();
      }
    }
  }
}