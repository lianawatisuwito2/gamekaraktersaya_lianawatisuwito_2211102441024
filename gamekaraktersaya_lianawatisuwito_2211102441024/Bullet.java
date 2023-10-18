import greenfoot.*; 

public class Bullet extends SmoothMover
{
    private static final int damage = 16;
    private int life = 30;
    
    public Bullet()
    {
    }
    
    public Bullet(Vector speed, int rotation)
    {
        super(speed);
        setRotation(rotation);
        addToVelocity(new Vector(rotation, 15));
        Greenfoot.playSound("EnergyGun.wav");
    }
    
    public void act()
    {
        if (life <= 0) {
            getWorld().removeObject(this);
        } else {
            life--;
            move();
            checkAlienHit();
        }
    }
    
    private void checkAlienHit()
    {
        alien alien = (alien) getOneIntersectingObject(alien.class);
        if (alien != null) 
        {
            getWorld().removeObject(this);
            alien.hit(damage);
            Space space = (Space) getWorld();
            space.bulletHitAlien(); // Memanggil metode di kelas Space untuk menambah skor
        }
    }
}
