package me.whiteship.demoinflearnrestapi.events;

import ch.qos.logback.classic.net.server.HardenedLoggingEventInputStream;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Event {

    private Integer id;
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
    private boolean offline;
    private boolean free;
    private EventStatus eventStatus;
}
