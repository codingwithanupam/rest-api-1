package com.bookticket.bindings;

import java.time.Period;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class MyUserResponseDto {
   private String user_id;
   private String user_name;
   private String user_password;
   private Period age;
}
