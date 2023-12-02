package fr.piarre.banflowapi.service;

import fr.piarre.banflowapi.model.Kanban;
import fr.piarre.banflowapi.repository.KanbanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KanbanService {

    @Autowired
    private KanbanRepository kanbanRepository;

    public String CreateKanban(Kanban kanban) {
        kanbanRepository.save(kanban);
        return "Kanban created";
    }

    public String DeleteKanban(Long id) {
        kanbanRepository.deleteById(id);
        return "Kanban deleted";
    }

    public List<Kanban> GetAllKanban() {
        return kanbanRepository.findAll();
    }
}
