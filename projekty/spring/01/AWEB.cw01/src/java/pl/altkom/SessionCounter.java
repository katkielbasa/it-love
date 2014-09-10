package pl.altkom;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionCounter implements HttpSessionListener {

    private static int activeSessions = 0;

    public void sessionCreated(HttpSessionEvent se) {
        activeSessions++;
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        activeSessions--;
    }

    public static int getActiveSessions() {
        return activeSessions;
    }

}
