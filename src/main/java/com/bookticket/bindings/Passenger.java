package com.bookticket.bindings;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class Passenger {
    private String name;
    private String email;
    private Integer age;
    private Long phone;
    private String gender;
    private String from_station;
    private String to_station;
    private String start_date;
    
}
