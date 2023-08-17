package org.example.entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "volunteer")

public class Volunteer {
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Id
    Long id;
    String  name;
    String surname;
    Integer age;
    Double salary;


}
