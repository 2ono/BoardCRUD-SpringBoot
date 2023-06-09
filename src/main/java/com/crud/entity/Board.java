package com.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Board {

	@Id
	private int id;
	
	private String title;
	
	private String content;
	
	private String filename;
	
	private String filepath;
	
}
