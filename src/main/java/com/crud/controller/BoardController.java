package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.entity.Board;
import com.crud.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;

	@GetMapping("/board/write")  // localhost:8080/board/write
	public String boardWriteForm() {
		
		return "boardwrite";
		
	}
	
	@PostMapping("/board/writepro")
	public String boardWritePro(Board board) {
		boardService.write(board);
		return "";
	}
	
	@GetMapping("/board/list")
	public String boardList() {
		return "boardlist";
	}
	
	
}
