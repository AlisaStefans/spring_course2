package aop;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component()
public class UniLibrary {

    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Мы берем жукрнал из UniLibrary");
    }
}
