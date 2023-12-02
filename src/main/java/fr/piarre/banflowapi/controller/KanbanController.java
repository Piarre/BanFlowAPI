package fr.piarre.banflowapi.controller;

import fr.piarre.banflowapi.model.Kanban;
import fr.piarre.banflowapi.service.KanbanService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kanban")
public class KanbanController {

    @Autowired
    private KanbanService kanbanService;

    @PostMapping("/new")
    public ResponseEntity<?> CreateKanban(@RequestBody Kanban kanban) {
        kanbanService.CreateKanban(kanban);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<?> GetAllKanban() {
        return ResponseEntity.ok(kanbanService.GetAllKanban());
    }

}
