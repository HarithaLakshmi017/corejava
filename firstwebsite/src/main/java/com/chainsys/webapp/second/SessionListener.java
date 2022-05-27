 package com.chainsys.webapp.second;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
public class SessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent arg0) {
        System.out.println("session created");
        HttpSession session=arg0.getSession();
        System.out.println("session id"+session.getId());
        }

    @Override
    public void sessionDestroyed(HttpSessionEvent arg0) {
        System.out.println("session Destroyed");
    }

}