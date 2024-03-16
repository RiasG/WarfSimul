package progect.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import progect.weapon.characters.Characters;

public interface CharactersDao extends JpaRepository<Characters, Long> {
}
