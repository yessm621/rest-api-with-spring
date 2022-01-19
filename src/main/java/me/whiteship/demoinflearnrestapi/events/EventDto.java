package me.whiteship.demoinflearnrestapi.events;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EventDto {

    private String name;
    private String description;
    private LocalDateTime beginEnrollmentDatetime;
    private LocalDateTime closeEnrollmentDatetime;
    private LocalDateTime beginEventDatetime;
    private LocalDateTime endEventDatetime;
    private String location;
    private int basePrice;
    private int maxPrice;
    private int limitIfEnrollment;

}
