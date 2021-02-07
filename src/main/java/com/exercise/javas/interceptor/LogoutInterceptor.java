package com.exercise.javas.interceptor;

import com.exercise.javas.dto.UserDTO;
import com.exercise.javas.utils.JavasConstants;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class LogoutInterceptor extends HandlerInterceptorAdapter {
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    HttpSession session = request.getSession();
    UserDTO dto = (UserDTO) session.getAttribute(JavasConstants.LOGIN_DTO);
    if (dto == null) {
      response.sendRedirect("/javas/noticeResult?type=alreadyLogout");
      return false;
    } else {
      return true;
    }
  }

  @Override
  public void postHandle(HttpServletRequest request,
      HttpServletResponse response,
      Object handler,
      ModelAndView modelAndView) throws Exception{
    super.postHandle(request, response, handler, modelAndView);
  }

  @Override
  public void afterCompletion(HttpServletRequest request,
      HttpServletResponse response,
      Object handler,
      Exception ex) throws Exception{
    super.afterCompletion(request, response, handler, ex);
  }
}
