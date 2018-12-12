package us.team7pro.EventTicketsApp.Controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.team7pro.EventTicketsApp.Models.*;
import us.team7pro.EventTicketsApp.Repositories.*;

@RestController
@RequestMapping("/api")
public class EventController {
	
	@Autowired	
	private EventRepository eventRepository;
	
	@PostMapping("/event/{id}")
	public Event createEvent(Event event){
		return eventRepository.save(event);
	}
	
	@GetMapping("/events")
	public List<Event> getEvents(){
		return eventRepository.findAll();
	}
	
	@PostMapping("/event")
	public Event updateEvent(Event event){
		return eventRepository.save(event);
	}
	
	@DeleteMapping("/event/{id}")
	public boolean deleteEvent(@PathVariable int eventID){
		eventRepository.deleteById(eventID);
		return true;
	}
	
	
	
	
	


}