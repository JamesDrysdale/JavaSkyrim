package characters.enemies;

import characters.behaviours.IMelee;
import characters.players.Player;

public class Skeever extends Enemy {
    private String name;
    private double HP;
    private double meleeDmg;
    private double rangeDmg;
    private double magicDmg;

    public Skeever(String name, double HP, double meleeDmg, double rangeDmg, double magicDmg ){
        super(name, HP, meleeDmg, rangeDmg, magicDmg);
    }

    public void melee(Player opponent){
        opponent.takeDamage(this.meleeDmg);
    }


    public void melee(IMelee opponent) {

    }
}
