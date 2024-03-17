package progect.weapon;

import progect.damage.DamageList;
import progect.weapon.attacks.PrimaryAttack;
import progect.weapon.characters.Characters;
import progect.weapon.attacks.Attack;
import progect.exceprions.NullCharactersException;
import progect.weapon.utility.NoiseLevel;

import javax.persistence.*;

//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@MappedSuperclass
public abstract class Weapon implements AttackCreator {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "weapon_id")
//    private Long weaponId;
    @Column(name = "weapon_name")
    private String name;
    @Column(name = "weapon_attack_speed")
    private double attackSpeed;

    @JoinColumn(name = "damage_list_id")
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
                      double statusChance ) {
        this.name = name;
        this.attackSpeed = attackSpeed;
        this.damageList = damageList;
        this.criticalChance = criticalChance;
        this.criticalMultiplier = criticalMultiplier;
        this.statusChance = statusChance;
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
