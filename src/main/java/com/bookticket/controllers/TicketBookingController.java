package com.bookticket.controllers;

import java.util.HashMap ;   
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookticket.bindings.Passenger;
import com.bookticket.bindings.Ticket;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/api/v1/ticket-booking")
@Tag(name= "ticket-apis", description =  "book ticket, get ticket from these apis")

public class TicketBookingController {
	
//	private Map<Integer, Ticket> ticket_collection = new HashMap<>();
//     @Operation(
//    		 summary = "book ticket endopint",
//    		 description = "this endpoint is responsible to create the tickets and save ticket details to db"
//    				 
//    		 
//    		 )
//	@Operation(
//			operationId = "Book_ticket_endpoint",
//			summary = "endpoint for the booking ticket", 
//			description = "this tis the decription..",
//			method = "POST",
////			deprecated = true
//			requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
//					         required = true,
//					         description = "passnger details to book ticket",
//					         content = @Content(schema = @Schema(implementation = Passenger.class))
//					         
//					)
//			
//			
//			
//			)
//	@PostMapping(value = "/book", consumes = { "application/json",
//			"application/xml" }, produces = { "application/json",
//					"application/xml"})
//	public ResponseEntity<Ticket> bookTicketHandler(@RequestBody Passenger passenger) {
//		System.out.println("inside bookTicketHandler()");
////		Ticket bookTicket = ticketService.bookTicket(passenger);
//		Ticket bookedTicket = ticketService.bookTicket(passenger);
//	
//		}
//		return null;
//
//	}
//     
////     @Operation(
////    		 summary = "fetch ticket based on id",
////    		 description = "this endpoint is responsible to fetch the tickets and you need ticket id to fetch it",
////    		 parameters = {@Parameter(name = "id", description = "ticketid", required = true)}
////    		 
////    		 )
//	@GetMapping(value = "/ticket/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
//			MediaType.APPLICATION_XML_VALUE })
//	public ResponseEntity<Ticket> getTicketById(@PathVariable("id") Integer ticketId) {
//		System.out.println("getTicketById");
//		if (ticket_collection.containsKey(ticketId))
//			return new ResponseEntity<Ticket>(ticket_collection.get(ticketId), HttpStatus.OK);
//		return null;
//	}
}
