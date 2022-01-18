package sberJPA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import sberJPA.controller.ControllerFactory;
import sberJPA.util.reader.ReaderFactory;
import sberJPA.util.reader.exeption.IncompleteOperationException;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static boolean running = true;

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:META-INF/application-context-spring.xml");
        ControllerFactory controllerFactory = context.getBean("controllerFactory", ControllerFactory.class);

        System.out.println("RUN!");
        while (running) {
            try {
                ReaderFactory.STRING_READER.read("Для получения списка команд введите 'help'...");
            } catch (IncompleteOperationException e) {
                try {
                    ReaderFactory.READER.read("\n");
                } catch (IncompleteOperationException ex) {
                    System.out.println("Операция не может быть завершена, попробуйте снова");
                }
            }
        }

        System.out.println("Thank you for using!");
        for (int count = 3; count != 0; count--) {
            System.out.println(count);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
