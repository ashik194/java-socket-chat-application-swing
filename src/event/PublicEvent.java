/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package event;

/**
 *
 * @author ORANGEBD
 */
public class PublicEvent {

    private static PublicEvent instance;
    private EventImageView eventImageView;
    private EventChat eventChat;
    private EventLogin eventLogin;
    private EventMain eventMain;
    private EventMenuLeft eventMenuLeft;

    public static PublicEvent getInstance() {
        if (instance == null) {
            instance = new PublicEvent();
        }
        return instance;
    }

    private PublicEvent() {

    }
    
    public void addEventImageView(EventImageView event) {
        this.eventImageView = event;
    }

    public void addEventChat(EventChat event) {
        this.eventChat = event;
    }

    public EventImageView getEventImageView() {
        return eventImageView;
    }

    public EventChat getEventChat() {
        return eventChat;
    }

    public void addEventLogin(EventLogin event) {
        this.eventLogin = event;
    }
    
    public EventLogin getEventLogin() {
        return eventLogin;
    }

    public void addEventMain(EventMain event) {
        this.eventMain = event;
    }

    public EventMain getEventMain() {
        return eventMain;
    }

    public void addEventMenuLeft(EventMenuLeft event) {
        this.eventMenuLeft = event;
    }
    
    public EventMenuLeft getEventMenuLeft() {
        return eventMenuLeft;
    }
    
//
//
//    public EventImageView getEventImageView() {
//        return eventImageView;
//    }
//

//
//
}
