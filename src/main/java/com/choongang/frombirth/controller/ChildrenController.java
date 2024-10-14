package com.choongang.frombirth.controller;

import com.choongang.frombirth.dto.ChildrenDTO;
import com.choongang.frombirth.service.ChildrenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/children")
public class ChildrenController {
    private final ChildrenService childrenService;

    @Autowired
    public ChildrenController(ChildrenService childrenService) {
        this.childrenService = childrenService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<ChildrenDTO>> getAllChildren(@PathVariable String userId) {
        return ResponseEntity.ok(childrenService.getAllChildren(userId));
    }

    @GetMapping("/{childId}")
    public ResponseEntity<ChildrenDTO> getChildById(@PathVariable Integer childId) {
        return ResponseEntity.ok(childrenService.getChildById(childId));
    }

    @PostMapping("/children")
    public ResponseEntity<Void> addChild(@Valid @RequestBody ChildrenDTO childrenDTO) {
        childrenService.addChild(childrenDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity<Void> updateChild(@RequestBody ChildrenDTO childrenDTO) {
        childrenService.updateChild(childrenDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{childId}")
    public ResponseEntity<Void> deleteChild(@PathVariable Integer childId) {
        childrenService.deleteChild(childId);
        return ResponseEntity.noContent().build();
    }
}
