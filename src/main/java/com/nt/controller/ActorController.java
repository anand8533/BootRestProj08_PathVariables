package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Actor")
public class ActorController {

	@PostMapping("/report/{id}/{name}/{fee}")
	public ResponseEntity<String> getActor(@PathVariable String id, @PathVariable String name,
			@PathVariable String fee) {
		String message = "received path variables are : id->" + id + "; name->" + name + "; fee->" + fee;
		System.out.println(message);
		return new ResponseEntity<String>(message, HttpStatus.OK);

	}

	@PostMapping(value = {
			"/reportOpt/{id}/{name}/{fee}",
			"/reportOpt/{id}",
			"/reportOpt/{id}/{name}" })
	public ResponseEntity<String> getActorOptionalParams(@PathVariable String id,
			@PathVariable(required = false) String name, @PathVariable(required = false) String fee) {
		String message = "received path variables are : id->" + id + "; name->" + name + "; fee->" + fee;
		System.out.println(message);
		return new ResponseEntity<String>(message, HttpStatus.OK);

	}

}
