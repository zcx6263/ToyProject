package org.zerock.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import lombok.extern.log4j.Log4j;

/**
 * AccessDeniedHandler 인터페이스의 메서드는 handle() 뿐이고 HttpServletRequest, HttpServletResponse를
 * 파라미터로 사용하기 때문에 직접적으로 서블릿 API를 이용하는 처리가 가능하다.
 */
@Log4j
public class CustomAccessDeniedHandler implements AccessDeniedHandler{
    
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException arg2) 
            throws IOException, ServletException {
        log.error("Access Denied Handler");
        
        log.error("Redirect....");
        
        response.sendRedirect("/accessError");
        
    }
    
    
}
