package us.team7pro.EventTicketsApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import us.team7pro.EventTicketsApp.Models.Event;
import us.team7pro.EventTicketsApp.Repositories.EventRepository;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;



@Component
public class DatabaseSeeder implements CommandLineRunner {
    private EventRepository eventRepository;

    @Autowired
    public DatabaseSeeder(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    @Override
    public void run(String... strings) throws Exception{
        List<Event> event =  new ArrayList<>();
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        Date d1 = df.parse("12-10-2018"); 
        Date d2 = df.parse("10-18-2018");
        Date d3 = df.parse("11-1-2018");

        event.add(new Event("Kygo  Music" ,"Concert", "New York", d1 , "Kygo is a Electronic Dance Music DJ", 19.99f, "img/bg-1.jpg"));
        event.add(new Event("Ultra Music Festival" ,"Festival", "Miami", d3 , "Top 10 Dj's playing", 27.49f, "img/bg-3.jpg"));
        event.add(new Event("Marshmello" ,"Concert", "Chicago", d2 , "Marshmello plays Techno", 13.99f, "img/bg-4.jpg"));
        event.add(new Event("VH1 Supersonic" ,"Festival", "California", d2 , "Sponsered by Sreekar Dhaduvai", 15.99f, "img/bg-5.jpg"));

        eventRepository.saveAll(event);

    }

    
}
