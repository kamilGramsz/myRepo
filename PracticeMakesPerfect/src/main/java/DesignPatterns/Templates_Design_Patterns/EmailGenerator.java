package DesignPatterns.Templates_Design_Patterns;

import java.util.Collections;
import java.util.List;

public abstract class EmailGenerator {

    List<String> to;
    List<String> cc;
    String topic;

    public abstract void setToList();

    public abstract void setTopic();

    public final void sendEmail(){ // Template pattern
        setToList();
        setCcList();
        setTopic();
        printEmail();


    }

    private void printEmail() {

        System.out.println("Email topic : " + topic);
        System.out.print("Email to : ");
        to.forEach(System.out::print);
        System.out.println("");
        System.out.println("Email cc : ");
        cc.forEach(System.out::print);
        System.out.println("");
        System.out.println(" Email content : This is the email content");
    }

    public void setCcList() {
        cc = Collections.emptyList();

    }
}
