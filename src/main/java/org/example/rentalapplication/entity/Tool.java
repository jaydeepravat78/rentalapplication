package org.example.rentalapplication.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Tool {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true)
    private String toolCode;

    private String brand;

    @ManyToOne
    @JoinColumn(name = "type_id", referencedColumnName = "id")
    private ToolType toolType;
}
