package character;

public abstract class Player {
    private String name;
    private double baseHP;
    private double baseStamina;
    private double baseMagic;
    private double baseMeleeDmg;
    private double baseMagicDmg;
    private double baseRangeDmg;
    private double physicalRes;
    private double magicRes;

    public Player(String name){
        this.name = name;
        this.baseHP = 1;
        this.baseStamina = 1;
        this.baseMagic = 1;
        this.baseMeleeDmg = 1;
        this.baseMagicDmg = 1;
        this.baseRangeDmg = 1;
        this.physicalRes = 1;
        this.magicRes = 1;
    }

}
