package com.crimsonlogic.inventorymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;
import com.crimsonlogic.inventorymanagementsystem.repository.IAdminRepository;




@RestController
@RequestMapping("/admin")
public class AdminController{
@Autowired
private IAdminRepository adminRepo;

@PostMapping
public Admin insertAdmin(@RequestBody Admin admin) {
	return null;
}
}
