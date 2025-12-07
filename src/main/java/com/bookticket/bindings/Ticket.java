package com.bookticket.bindings;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class Ticket {
private Integer ticket_id;
private String passnager_name;
private Integer  passanger_age;
private Long train_no;
private String train_name;
private String coach;
private Integer sheet_number;
private String sheet_position;
private String from_station;
private String to_station;
private String journey_start_date;
private String journey_end_date;
private String journey_duration;
private String booking_status;

}
