package com.rohan.SpringBootRESTCRUD.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name ="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int studentId;

    @Column(name = "name")
    private String studentName;

    @Column(name = "email")
    private String studentEmail;

    @Column(name = "phone")
    private int studentPhone;

    @Column(name = "address")
    private String studentAddress;

}
