package project.damage;


import javax.persistence.*;

@Entity
@Table(name = "weapon_damage")
public class Damage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wd_id")
    private Long damageId;
    @Column(name = "wd_amount")
    private double amountDamage;
    @Column(name = "wd_type")
    private DamageType damageType;
    private double damagePercent;


    public Damage() {
    }

    public Damage(double amountDamage, DamageType damageType) {
        this.amountDamage = amountDamage;
        this.damageType = damageType;
    }

    public Damage(Damage damage) {
        this.amountDamage = damage.getAmountDamage();
        this.damageType = damage.getDamageType();
        this.damagePercent = damage.getDamagePercent();
    }

    public Damage(double amountDamage, DamageType damageType, double damagePercent) {
        this.amountDamage = amountDamage;
        this.damageType = damageType;
        this.damagePercent = damagePercent;
    }

    public double getAmountDamage() {
        return amountDamage;
    }

    public void setAmountDamage(double amountDamage) {
        this.amountDamage = amountDamage;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public double getDamagePercent() {
        return damagePercent;
    }

    public void setDamagePercent(double damagePercent) {
        this.damagePercent = damagePercent;
    }

}
