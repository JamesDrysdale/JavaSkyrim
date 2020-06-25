package characters.enemies;

import characters.behaviours.IMelee;
import characters.players.Player;

public abstract class Enemy implements IMelee {
    private String name;
    private double HP;
    private double meleeDmg;
    private double rangeDmg;
    private double magicDmg;

    public Enemy(String name, double HP,double meleeDmg, double rangeDmg, double magicDmg){
        this.name = name;
        this.HP = HP;
        this.meleeDmg = meleeDmg;
        this.rangeDmg = rangeDmg;
        this.magicDmg = magicDmg;
    }

    public String getName() {
        return name;
    }

    public double getHP() {
        return HP;
    }

    public double getMeleeDmg() {
        return meleeDmg;
    }

    public double getRangeDmg() {
        return rangeDmg;
    }

    public double getMagicDmg() {
        return magicDmg;
    }

    public void takeDamage(double damage){
        this.HP -= damage;
    }

    public void melee(Player opponent){
        opponent.takeDamage(this.meleeDmg);
    }

}
