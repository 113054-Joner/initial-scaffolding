package lab3.JonerClaudio.scafolding.repositories;


import lab3.JonerClaudio.scafolding.entities.DummyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository extends JpaRepository<DummyEntity,Long> {
}
