package org.example.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "organization")
public class Organization {
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Id
    Long id;
    String name;
    String mail;
    String fax;
    @OneToMany(cascade = CascadeType.PERSIST)
    List<Volunteer> volunteerList;
}
