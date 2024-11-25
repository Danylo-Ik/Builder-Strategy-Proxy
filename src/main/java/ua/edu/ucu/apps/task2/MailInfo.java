package ua.edu.ucu.apps.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailInfo {
    
    private Client client;
    private MailCode mailCode;

    public String generate() {
        return mailCode.generate(client);
    }
}
