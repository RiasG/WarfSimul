package progect.weapon;

import progect.damage.DamageList;
import progect.weapon.attacks.PrimaryAttack;
import progect.weapon.characters.Characters;
import progect.weapon.attacks.Attack;
import progect.exceprions.NullCharactersException;
import progect.weapon.utility.NoiseLevel;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class Weapon implements AttackCreator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "weapon_id")
    private Long weaponId;
    @Column(name = "weapon_name")
    private String name;
    @Column(name = "weapon_attack_speed")
    private double attackSpeed;
    private DamageList damageList;
    @Column(name = "weapon_critical_chance")
    private double criticalChance;
    @Column(name = "weapon_critical_multiplier")
    private double criticalMultiplier;
    @Column(name = "weapon_status_chance")
    private double statusChance;
    private NoiseLevel noiseLevel;

    public Weapon(String name, double attackSpeed, DamageList damageList,
                      double criticalChance, double criticalMultiplier,
                      double statusChance, NoiseLevel noiseLevel) {
        this.name = name;
        this.attackSpeed = attackSpeed;
        this.damageList = damageList;
        this.criticalChance = criticalChance;
        this.criticalMultiplier = criticalMultiplier;
        this.statusChance = statusChance;
        this.noiseLevel = noiseLevel;
    }




    private Characters characters;

    public Weapon() {
    }

    public Weapon(Characters characters) {
        this.characters = characters;
    }

    @Override
    public abstract Attack attack() throws NullCharactersException;

    public Characters getCharacters() {
        return characters;
    }

    public void setCharacters(Characters characters) {
        this.characters = characters;
    }


    public Long getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(Long weaponId) {
        this.weaponId = weaponId;
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
        return "Weapon{" +
                "name='" + '\'' +
                ", characters=" + characters +
                '}';
    }

}
