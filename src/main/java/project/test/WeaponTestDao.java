package project.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponTestDao extends JpaRepository<WeaponTest, Long> {
}
