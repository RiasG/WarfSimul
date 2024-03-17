package project.test;


import javax.persistence.*;

@Entity
@Table(name = "test_weapon")
public class WeaponTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "weapon_id")
    private Long weaponId;
    @Column(name = "name")
    private String weaponName;
    @Column(name = "damage")
    private double weaponDamage;

    public WeaponTest() {
    }

    public WeaponTest(Long weaponId, String weaponName, double weaponDamage) {
        this.weaponId = weaponId;
        this.weaponName = weaponName;
        this.weaponDamage = weaponDamage;
    }

    public Long getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(Long weaponId) {
        this.weaponId = weaponId;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public double getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(double weaponDamage) {
        this.weaponDamage = weaponDamage;
    }
}
