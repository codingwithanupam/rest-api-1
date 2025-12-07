package com.bookticket.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="user_dtls")
@Data
public class MyUser {
@Id
private String user_id;
private String user_name;
private String user_gender;
private String user_password;
private String user_phone;
private LocalDate user_dob;
@CreationTimestamp
@Column(name = "created_at", updatable = false, insertable = true)
private LocalDateTime created_at;
@UpdateTimestamp
@Column(name = "updated_at", insertable = false, updatable = true)
private LocalDateTime updated_at;
}
