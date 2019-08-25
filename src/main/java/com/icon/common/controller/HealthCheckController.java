package com.icon.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	/**
	 * Health check
	 * 
	 * @return response
	 */
	@GetMapping
	@PostMapping
	@RequestMapping("/health")
	public String healthCheck() {
		return "OK";
	}
}
