package character;

public abstract class Player {
    private String name;
    private double HP;
    private double Stamina;
    private double Magic;
    private double MeleeDmg;
    private double MagicDmg;
    private double RangeDmg;
    private double PRes;
    private double MRes;

    public Player(String name, Modifiers modifier){
        this.name = name;
        this.HP = 100 * modifier.baseHP;
        this.Stamina = 100 * modifier.baseStamina;
        this.Magic = 100 * modifier.baseMagic;
        this.MeleeDmg = 1 * modifier.baseMeleeDmg;
        this.MagicDmg = 1 * modifier.baseMagicDmg;
        this.RangeDmg = 1 * modifier.baseRangeDmg;
        this.PRes = 1 * modifier.physicalRes;
        this.MRes = 1 * modifier.magicRes;
    }


}
