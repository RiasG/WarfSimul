package project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import project.weapon.characters.Characters;

public interface CharactersDao extends JpaRepository<Characters, Long> {
}
