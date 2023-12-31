package edu.bbte.idde.bfim2114.hexagonal.adapter.in.web.dto;

import lombok.Data;

@Data
public class HardwarePartPresentationDTO {

    private Long id;
    private String name;
    private String manufacturer;
    private String category;
    private Double price;
    private String description;
    private Long userId;
}
