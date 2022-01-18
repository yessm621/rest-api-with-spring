package me.whiteship.demoinflearnrestapi.events;

import ch.qos.logback.classic.net.server.HardenedLoggingEventInputStream;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Event {

    @Id
    @GeneratedValue
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

    @Enumerated(EnumType.STRING)
    private EventStatus eventStatus;
}
