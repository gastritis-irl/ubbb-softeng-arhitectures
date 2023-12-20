package edu.bbte.idde.bfim2114.threelayer.domain.model.entity;

import jakarta.persistence.*;
import lombok.*;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "hardware_parts")
@AllArgsConstructor
@NoArgsConstructor
public class HardwarePart extends BaseEntity {

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "manufacturer", length = 50)
    private String manufacturer;

    @Column(name = "category", length = 50)
    private String category;

    @Column(name = "price")
    private Double price;

    @Column(name = "description", length = 1000)
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
