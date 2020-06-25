package characters.players;

public enum Modifiers {
        KHAJIT(1.0, 1.3, 1.0, 1.2, 1.0, 1.4, 0.9, 1.0),
        BRETON(1.0, 0.8, 1.5, 0.7, 1.8, 0.7, 0.8, 1.2);

        private final double baseHP;
        private final double baseStamina;
        private final double baseMagic;
        private final double baseMeleeDmg;
        private final double baseMagicDmg;
        private final double baseRangeDmg;
        private final double physicalRes;
        private final double magicRes;

        Modifiers(double baseHP, double baseStamina, double baseMagic, double baseMeleeDmg, double baseMagicDmg, double baseRangeDmg,
                 double physicalRes, double magicRes) {
            this.baseHP = baseHP;
            this.baseStamina = baseStamina;
            this.baseMagic = baseMagic;
            this.baseMeleeDmg = baseMeleeDmg;
            this.baseMagicDmg = baseMagicDmg;
            this.baseRangeDmg = baseRangeDmg;
            this.physicalRes = physicalRes;
            this.magicRes = magicRes;
        }
        
        public double getBaseHP() {
            return this.baseHP;
        }

        public double getBaseStamina() {
            return baseStamina;
        }

        public double getBaseMagic() {
            return baseMagic;
        }

        public double getBaseMeleeDmg() {
            return baseMeleeDmg;
        }

        public double getBaseMagicDmg() {
        return baseMagicDmg;
        }

        public double getBaseRangeDmg() {
            return baseRangeDmg;
        }

        public double getPhysicalRes() {
            return physicalRes;
        }

        public double getMagicRes() {
            return magicRes;
        }
}
