package progect.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import progect.weapon.PrimaryWeapon;
import progect.weapon.Weapon;

@Repository
public interface PrimaryWeaponDao extends JpaRepository<Weapon, Long> {
}
