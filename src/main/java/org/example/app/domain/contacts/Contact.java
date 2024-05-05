package org.example.app.domain.contacts;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "contacts")

public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phoneNumber")
    private String phoneNumber;


    @Override
    public String toString() {
        return String.format("{\"id\" : %d, " +
                        "\"name\" : %s, " +
                        "\"phoneNumber\" : %s}",
                id, name, phoneNumber);
    }
}
