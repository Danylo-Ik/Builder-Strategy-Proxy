package ua.edu.ucu.apps;

import java.util.List;

import ua.edu.ucu.apps.task2.Client;
import ua.edu.ucu.apps.task2.Client.ClientBuilder;
import ua.edu.ucu.apps.task2.MailCode;
import ua.edu.ucu.apps.task2.MailInfo;
import ua.edu.ucu.apps.task2.BirthdayMailCode;

public class Main {
    public static void main(String[] args) {
        ClientBuilder client = Client.builder();
        client
            .age(100)
            .name("Joe")
            .email("test@test")
            .build();

        MailCode mailCode = new BirthdayMailCode();
        MailInfo mailInfo = new MailInfo(client.build(), mailCode);
        System.out.println(mailInfo.generate());
        

    }
}