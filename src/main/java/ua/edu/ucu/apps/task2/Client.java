package ua.edu.ucu.apps.task2;

import java.util.concurrent.atomic.AtomicInteger;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Client {
    private static AtomicInteger counter = new AtomicInteger();
    
    private final int id = counter.incrementAndGet();

    private String name;
    private int age;
    private Sex sex;
    private String email;
}
