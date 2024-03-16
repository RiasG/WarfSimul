package progect.weapon.characters;

import progect.damage.DamageList;
import progect.weapon.utility.NoiseLevel;

public class CharactersPrimary extends Characters{
    private double multiShot;
    private double reloadSpeed;
    private int magazineAmmo;
    private int fullAmmo;


    public CharactersPrimary() {
    }

    public CharactersPrimary(String name, double attackSpeed, double disposition, DamageList damageListList,
                             double criticalChance, double criticalMultiplier,
                             double statusChance, NoiseLevel noiseLevel, double multiShot,
                             double reloadSpeed, int magazineAmmo, int fullAmmo) {
        super(name, attackSpeed, disposition, damageListList, criticalChance, criticalMultiplier, statusChance, noiseLevel);

        this.multiShot = multiShot;
        this.reloadSpeed = reloadSpeed;
        this.magazineAmmo = magazineAmmo;
        this.fullAmmo = fullAmmo;
    }

    public double getMultiShot() {
        return multiShot;
    }

    public void setMultiShot(double multiShot) {
        this.multiShot = multiShot;
    }

    public double getReloadSpeed() {
        return reloadSpeed;
    }

    public void setReloadSpeed(double reloadSpeed) {
        this.reloadSpeed = reloadSpeed;
    }

    public int getMagazineAmmo() {
        return magazineAmmo;
    }

    public void setMagazineAmmo(int magazineAmmo) {
        this.magazineAmmo = magazineAmmo;
    }

    public int getFullAmmo() {
        return fullAmmo;
    }

    public void setFullAmmo(int fullAmmo) {
        this.fullAmmo = fullAmmo;
    }

    @Override
    public String toString() {
        return "CharactersPrimary{" +
                "multiShot=" + multiShot +
                ", reloadSpeed=" + reloadSpeed +
                ", magazineAmmo=" + magazineAmmo +
                ", fullAmmo=" + fullAmmo +
                '}';
    }
}
