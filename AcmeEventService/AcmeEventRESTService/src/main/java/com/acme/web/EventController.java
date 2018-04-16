package com.acme.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.acme.types.Event;

@Controller
@RequestMapping("/acme")
public class EventController {

	@RequestMapping(value = "/event/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Event getEvent(@PathVariable("id") Long id) {
		return null; // RestPreconditions.checkFound( service.findOne( id ));
	}
	
	@RequestMapping(value = "/events", method = RequestMethod.GET)
	@ResponseBody
	public List<Event> getEvents() {
		return null; // service.findAll();
	}

	@RequestMapping(value = "/event/create", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Long createEvent(@RequestBody Event resource) {
		//Preconditions.checkNotNull(resource);
		return null; //service.create(resource);
	}

	@RequestMapping(value = "/event/update", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void updateEvent(@PathVariable("id") Long id, @RequestBody Event resource) {
		//Preconditions.checkNotNull(resource);
		
	}

	@RequestMapping(value = "/event/delete/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteEvent(@PathVariable("id") Long id) {
		
	}

}
