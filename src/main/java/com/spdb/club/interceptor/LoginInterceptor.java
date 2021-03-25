package com.spdb.club.interceptor;

import com.spdb.club.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ClassName LoginInterceptor 类
 * @Description TODO
 * @Author 许茂
 * @Date 2021/3/20 15:33
 * @Version 1.0
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        try {
            HttpSession session = request.getSession(false);
            User staff = (User) session.getAttribute("staff");
            if(staff==null){
                response.sendRedirect("/club/login");
                return false;
            }
            else if (request.getRequestURI().indexOf("/login")>=0){
                session.removeAttribute("staff");
                session.invalidate();
            }
        }catch (Exception e){
            response.sendRedirect("/club/login");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {

    }
}
