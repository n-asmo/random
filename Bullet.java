public class Bullet extends Sprite {
  private String bulletType;
  private int hitBox = 3;
  public bullet (int x, int y, String bulletType) {
    super (x, y);
    this.bulletType = bulletType;
  }
  public String getBullet() {
    return bulletType;
  }
  public void setBullet(String newType) {
    bulletType = newType;
  }
  public boolean hit (int alienX, int alienY, int alienHitBox) {
    if ((alienY == super.getY() + hitBox) && (super.getX() >= alienX && super.getX() + alienHitBox <= alienX)) {
      return true;
    }
    return false;
}