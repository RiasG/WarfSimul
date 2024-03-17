package project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.weapon.Weapon;

@Repository
public interface PrimaryWeaponDao extends JpaRepository<Weapon, Long> {
}
