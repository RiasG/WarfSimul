package progect.weapon.characters;

import progect.damage.DamageList;
import progect.weapon.utility.NoiseLevel;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Table(name = "ws_weapons_primary")
@Entity
public class Characters {

    private String name;
    private double attackSpeed;
    private double disposition;
    private DamageList damageList;
    private double criticalChance;
    private double criticalMultiplier;
    private double statusChance;
    private NoiseLevel noiseLevel;

    public Characters(String name, double attackSpeed, double disposition, DamageList damageList,
                      double criticalChance, double criticalMultiplier,
                      double statusChance, NoiseLevel noiseLevel) {
        this.name = name;
        this.attackSpeed = attackSpeed;
        this.disposition = disposition;
        this.damageList = damageList;
        this.criticalChance = criticalChance;
        this.criticalMultiplier = criticalMultiplier;
        this.statusChance = statusChance;
        this.noiseLevel = noiseLevel;
    }

    public Characters() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public double getDisposition() {
        return disposition;
    }

    public void setDisposition(double disposition) {
        this.disposition = disposition;
    }

    public DamageList getDamageList() {
        return damageList;
    }

    public void setDamageList(DamageList damageList) {
        this.damageList = damageList;
    }

    public double getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(double criticalChance) {
        this.criticalChance = criticalChance;
    }

    public double getCriticalMultiplier() {
        return criticalMultiplier;
    }

    public void setCriticalMultiplier(double criticalMultiplier) {
        this.criticalMultiplier = criticalMultiplier;
    }

    public double getStatusChance() {
        return statusChance;
    }

    public void setStatusChance(double statusChance) {
        this.statusChance = statusChance;
    }

    public NoiseLevel getNoiseLevel() {
        return noiseLevel;
    }

    public void setNoiseLevel(NoiseLevel noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    @Override
    public String toString() {
        return "Characters{" +
                "attackSpeed=" + attackSpeed +
                ", disposition=" + disposition +
                ", damageList=" + damageList +
                ", criticalChance=" + criticalChance +
                ", criticalMultiplier=" + criticalMultiplier +
                ", statusChance=" + statusChance +
                ", noiseLevel=" + noiseLevel +
                '}';
    }
}
