package ua.edu.ucu.apps.task2;

public class BirthdayMailCode implements MailCode{
    
    @Override
    public String generate(Client client) {
        return String.format("Hello %s! Happy %d birtday!", 
            client.getName(), client.getAge());
    }
}
