package com.bookticket.bindings;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class MyUserDto {
  private String user_name;
  private String user_gender;
  private String user_email;
  private String user_password;
  private String user_phone;
  @JsonFormat(pattern = "dd-MM-yyyy")
  private LocalDate user_dob;
/*
 
 */
  
}
