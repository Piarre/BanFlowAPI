package fr.piarre.banflowapi.repository;

import fr.piarre.banflowapi.model.Kanban;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface KanbanRepository extends JpaRepository<Kanban, Long> {

    Optional<Kanban> findByName(String name);
}
