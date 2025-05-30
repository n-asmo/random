public class Sprite {
    private int x;
    private int y;

    public Sprite(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
  
    public int getY() {
        return y;
    }

    public void updateX(int x) {
        this.x = x;
    } 

    public void updateY(int y) {
        this.y = y;
    }
}