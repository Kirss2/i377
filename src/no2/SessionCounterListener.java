package no2;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionCounterListener
 *
 */
public class SessionCounterListener implements HttpSessionListener {

	private static int totalActiveSessions=0;

    public void sessionCreated(HttpSessionEvent event) {
        totalActiveSessions++;
    }


    public void sessionDestroyed(HttpSessionEvent arg0) {
        totalActiveSessions--;
    }
    
    public static int getTotalActiveSessions(){
    	return totalActiveSessions;
    }
	
}
