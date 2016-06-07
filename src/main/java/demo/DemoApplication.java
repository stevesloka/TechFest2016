package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication  {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5000);
        SpringApplication.run(DemoApplication.class, args);
    }

//    @Override
//    public void run(String... strings) throws Exception {
//
//
//        // save a couple of customers
////        repository.save(new Organizer("Jack", "Bauer"));
////        repository.save(new Organizer("Chloe", "O'Brian"));
////        repository.save(new Organizer("Kim", "Bauer"));
////        repository.save(new Organizer("David", "Palmer"));
////        repository.save(new Organizer("Michelle", "Dessler"));
//
//        // fetch all customers
//        System.out.println("Customers found with findAll():");
//        System.out.println("-------------------------------");
//        for (Organizer organizer : repository.findAll()) {
//            System.out.println(organizer);
//        }
//        System.out.println();
//
//        // fetch an individual organizer by ID
//        Organizer organizer = repository.findOne(1L);
//        System.out.println("Organizer found with findOne(1L):");
//        System.out.println("--------------------------------");
//        System.out.println(organizer);
//        System.out.println();
//
//        // fetch customers by last name
//        System.out.println("Organizer found with findByLastName('Bauer'):");
//        System.out.println("--------------------------------------------");
//        for (Organizer bauer : repository.findByLastName("Bauer")) {
//            System.out.println(bauer);
//        }
//    }


}
