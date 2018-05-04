package DesignPatterns.Templates_Design_Patterns;

import java.util.Arrays;

public class ForManagementEmailGenerator extends EmailGenerator {

    @Override
    public void setToList() {
    to = Arrays.asList("managers@interia.pl", "adam.ceo@onet.eu");
    }

    @Override
    public void setTopic() {

        topic = "Email for managers";

    }
}
