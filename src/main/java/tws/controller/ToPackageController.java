package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.ToPackage;
import tws.repository.ToPackageMapper;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/topackages")

public class ToPackageController {

	@Autowired
    private ToPackageMapper toPackageMapper;

    @GetMapping("")
    public ResponseEntity<List<ToPackage>> getAll() {
        return ResponseEntity.ok(toPackageMapper.selectAll());
    }

    @PostMapping("")
    public ResponseEntity<ToPackage> insert(@RequestBody ToPackage toPackage) {
    	toPackageMapper.insert(toPackage);
        return ResponseEntity.created(URI.create("/topackages/" + toPackage.getId())).body(toPackage);
    }
}

