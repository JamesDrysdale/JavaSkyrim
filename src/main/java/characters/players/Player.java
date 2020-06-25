package characters.players;

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
        this.HP = 100 * modifier.getBaseHP();
        this.Stamina = 100 * modifier.getBaseStamina();
        this.Magic = 100 * modifier.getBaseMagic();
        this.MeleeDmg = 1 * modifier.getBaseMeleeDmg();
        this.MagicDmg = 1 * modifier.getBaseMagicDmg();
        this.RangeDmg = 1 * modifier.getBaseRangeDmg();
        this.PRes = 1 * modifier.getPhysicalRes();
        this.MRes = 1 * modifier.getMagicRes();
    }

    public String getName() {
        return name;
    }

    public double getHealthPoints() {
        return HP;
    }

    public double getStamina() {
        return Stamina;
    }

    public double getMagic() {
        return Magic;
    }

    public double getMeleeDmg() {
        return MeleeDmg;
    }

    public double getMagicDmg() {
        return MagicDmg;
    }

    public double getRangeDmg() {
        return RangeDmg;
    }

    public double getPRes() {
        return PRes;
    }

    public double getMRes() {
        return MRes;
    }
}
