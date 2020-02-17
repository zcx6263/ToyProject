package org.zerock.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.BoardVO;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;
import org.zerock.domain.TodoDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

    @RequestMapping("a")
    public String doA(){
        log.info("doA called..........");
        log.info("--------------------");
        
        return "doA";
    }
    
    @RequestMapping("ex01")
    public String ex01(SampleDTO dto) {
        log.info("dto : " + dto);
        
        return "doA";
    }
    
    @RequestMapping("drmCheck")
    public String drmCheck(HttpServletRequest request, HttpServletResponse response) {
        
        log.info("drmCheck : " );
        
        request.setAttribute("bb", "123");
        
        return "/sample/drmCheck";
    }
    @RequestMapping("drmAuthResultPage")
    public String drmAuthResultPage(HttpServletRequest request, HttpServletResponse response) {
        
        log.info("drmAuthResultPage : " + request.getParameter("num") + " " + request.getParameter("code"));
        
        return "/sample/drmAuthResultPage";
    }
    
    @RequestMapping("ex")
    public String ex(BoardVO dto) {
        return "/sample/tree";
    }
    @RequestMapping(value = "result", method = RequestMethod.POST)
    public String result(@RequestBody List<BoardVO> dto) {
        //log.info("test : " + list.size());
        //log.info("test : " + dto.getTitle());
        //log.info("test : " + dto.getContent());
        log.info("test : " + dto);
        return "/sample/test";
    }
}



