package org.zerock.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {
    
    private BoardService service;
    
    @GetMapping("/list")
    public void list(Model model, HttpServletRequest request) {
        log.info("list");
        
        HttpSession session = request.getSession();
        log.info("wonyong : " + session);
        model.addAttribute("list", service.getList());
    }
    
    @GetMapping("/register")
    public void getRegister(BoardVO board, RedirectAttributes rttr) {
        
    }
    
    @PostMapping("/register")
    public String register(BoardVO board, RedirectAttributes rttr) {
        
        log.info("register : "+board);
        service.register(board);
        rttr.addFlashAttribute("result", board.getBno());
        
        return "redirect:/board/list";
    }
    
    @GetMapping({"/get", "/modify"})
    public void get(@RequestParam("bno") Long bno, Model model)
    {
        log.info("/get");
        model.addAttribute("board",service.get(bno));
    }
    
    @PostMapping("/modify")
    public String modify(BoardVO board, RedirectAttributes rttr) {
        log.info("modify:" + board);
        
        if(service.modify(board)) {
            rttr.addFlashAttribute("result", "success");
        }
        return "redirect:/board/list";
    }
    
    @PostMapping("/remove")
    public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
        
        log.info("remove..."+bno);
        if(service.remove(bno)) {
            rttr.addFlashAttribute("result", "success");
        }
        return "redirect:/board/list";
    }
}
