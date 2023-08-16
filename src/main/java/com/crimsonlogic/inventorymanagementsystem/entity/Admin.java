package com.crimsonlogic.inventorymanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;





@Entity

public class Admin {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer adminId;
private String adminName;
private String adminEmail;
private String userName;
private String userPassword;


}
