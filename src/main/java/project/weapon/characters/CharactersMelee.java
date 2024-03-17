package project.weapon.characters;


import project.damage.Damage;
import project.damage.DamageList;
import project.weapon.utility.NoiseLevel;

public class CharactersMelee extends Characters{

    /**
     * RadialAttack
     */
    private double radialAttackRadius;
    private double heavyRadialAttackRadius;
    private DamageList radialAttackDamage;

    /**
     * slide attack
     */

    private DamageList slideAttackDamage; // у слайд атаки зачастую свой тип урона

    /**
     * Множители атак
     */
    private double attackMulti;
    private double heavyAttackMulti;
    private double slideAttackMulti;
    private double heavyRadialAttackMulti;
    private double radialAttackMulti;
    private double slamAttackMulti;
    private double slamHeavyAttackMulti;

    /**
     * Дополнительные хр-ки
     */
    private double windUp; // Время подготовки тяжелой атаки
    private int blockAngle;
    private int comboDuration;

    /**
     * Уменьшение урона при попадании одной аттаки по последующим целям
     */
    private double followThrough;


    public CharactersMelee() {

    }

    public CharactersMelee(String name, double attackSpeed, double disposition, DamageList damageList,
                           double criticalChance, double criticalMultiplier, double statusChance,
                           NoiseLevel noiseLevel, double radialAttackRadius,
                           double heavyRadialAttackRadius, DamageList radialAttackDamage,
                           DamageList slideAttackDamage, double attackMulti, double heavyAttackMulti,
                           double slideAttackMulti, double heavyRadialAttackMulti,
                           double radialAttackMulti, double slamAttackMulti, double slamHeavyAttackMulti,
                           double windUp, int blockAngle, int comboDuration, double followThrough) {
        super(name, attackSpeed, disposition, damageList, criticalChance, criticalMultiplier, statusChance, noiseLevel);
        this.radialAttackRadius = radialAttackRadius;
        this.heavyRadialAttackRadius = heavyRadialAttackRadius;
        this.radialAttackDamage = radialAttackDamage;
        this.slideAttackDamage = slideAttackDamage;
        this.attackMulti = attackMulti;
        this.heavyAttackMulti = heavyAttackMulti;
        this.slideAttackMulti = slideAttackMulti;
        this.heavyRadialAttackMulti = heavyRadialAttackMulti;
        this.radialAttackMulti = radialAttackMulti;
        this.slamAttackMulti = slamAttackMulti;
        this.slamHeavyAttackMulti = slamHeavyAttackMulti;
        this.windUp = windUp;
        this.blockAngle = blockAngle;
        this.comboDuration = comboDuration;
        this.followThrough = followThrough;
    }

    public double getHeavyAttackMulti() {
        return heavyAttackMulti;
    }

    public void setHeavyAttackMulti(double heavyAttackMulti) {
        this.heavyAttackMulti = heavyAttackMulti;
    }



    public double getSlamAttackMulti() {
        return slamAttackMulti;
    }

    public double getSlamHeavyAttackMulti() {
        return slamHeavyAttackMulti;
    }



    /**
     *
     *
     * Все атаки ближнего боя имеют множитель урона, который берется из типа атаки, например тяжелой атаки или
     * удара по земле, зависит от типа оружия, но есть и уникальные. Так же стандартные атаки могут иметь множитель урона,
     * если являются частью комбо (это будет реализовано в стойках - моды для ближки, пока нет в разработке)
     */
    public DamageList getDamageListWithMulti(double mult){
        DamageList damages = new DamageList();
        for (Damage d: super.getDamageList()) {
            Damage damage = new Damage(d.getAmountDamage() * mult, d.getDamageType());
            damages.add(damage);
        }
        return damages;
    }



    public double getAttackMulti() {
        return attackMulti;
    }

    public double getRadialAttackMulti() {
        return radialAttackMulti;
    }

    public double getRadialAttackRadius() {
        return radialAttackRadius;
    }

    public double getWindUp() {
        return windUp;
    }

    public double getHeavyRadialAttackRadius() {
        return heavyRadialAttackRadius;
    }

    public double getHeavyRadialAttackMulti() {
        return heavyRadialAttackMulti;
    }

    public DamageList getRadialAttackDamage() {
        return radialAttackDamage;
    }

    public double getSlideAttackMulti() {
        return slideAttackMulti;
    }

    public DamageList getSlideAttackDamage() {
        return slideAttackDamage;
    }

    public int getBlockAngle() {
        return blockAngle;
    }

    public int getComboDuration() {
        return comboDuration;
    }

    public double getFollowThrough() {
        return followThrough;
    }

    public void setRadialAttackRadius(double radialAttackRadius) {
        this.radialAttackRadius = radialAttackRadius;
    }

    public void setHeavyRadialAttackRadius(double heavyRadialAttackRadius) {
        this.heavyRadialAttackRadius = heavyRadialAttackRadius;
    }

    public void setRadialAttackDamage(DamageList radialAttackDamage) {
        this.radialAttackDamage = radialAttackDamage;
    }

    public void setSlideAttackDamage(DamageList slideAttackDamage) {
        this.slideAttackDamage = slideAttackDamage;
    }

    public void setAttackMulti(double attackMulti) {
        this.attackMulti = attackMulti;
    }

    public void setSlideAttackMulti(double slideAttackMulti) {
        this.slideAttackMulti = slideAttackMulti;
    }

    public void setHeavyRadialAttackMulti(double heavyRadialAttackMulti) {
        this.heavyRadialAttackMulti = heavyRadialAttackMulti;
    }

    public void setRadialAttackMulti(double radialAttackMulti) {
        this.radialAttackMulti = radialAttackMulti;
    }

    public void setSlamAttackMulti(double slamAttackMulti) {
        this.slamAttackMulti = slamAttackMulti;
    }

    public void setSlamHeavyAttackMulti(double slamHeavyAttackMulti) {
        this.slamHeavyAttackMulti = slamHeavyAttackMulti;
    }

    public void setWindUp(double windUp) {
        this.windUp = windUp;
    }

    public void setBlockAngle(int blockAngle) {
        this.blockAngle = blockAngle;
    }

    public void setComboDuration(int comboDuration) {
        this.comboDuration = comboDuration;
    }

    public void setFollowThrough(double followThrough) {
        this.followThrough = followThrough;
    }
}
