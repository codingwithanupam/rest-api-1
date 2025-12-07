package com.bookticket.custommessages;

import java.time.LocalDateTime;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@XmlRootElement
public class CustomeMessageResponse {
  private String msg_id;
 
  private String msg_description;
  private LocalDateTime msg_time;
}
