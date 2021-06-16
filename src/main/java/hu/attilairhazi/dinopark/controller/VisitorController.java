package hu.attilairhazi.dinopark.controller;

import hu.attilairhazi.dinopark.dto.VisitorCreateCommand;
import hu.attilairhazi.dinopark.dto.VisitorInfo;
import hu.attilairhazi.dinopark.service.VisitorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitor")
public class VisitorController {

    private VisitorService visitorService;

    public VisitorController(VisitorService visitorService) {
        this.visitorService = visitorService;
    }

    @PostMapping("/addvisitor")
    public ResponseEntity<VisitorInfo> addVisitor(@RequestBody VisitorCreateCommand visitorCreateCommand) {
        return new ResponseEntity<>(visitorService.addVisitor(visitorCreateCommand), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<VisitorInfo>> listVisitors() {
        return new ResponseEntity<>(visitorService.listVisitors(), HttpStatus.OK);
    }
}
