package DesignPatterns.Templates_Design_Patterns;

import java.util.Arrays;

public class ForEmployeeEmailGenerator extends EmailGenerator {


    @Override
    public void setToList() {

        to = Arrays.asList("employee.kowalski@onet.eu");

    }

    @Override
    public void setTopic() {

        topic = "Email for an employee";

    }
}
