package me.whiteship.demoinflearnrestapi.events;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

public interface EventRepository extends JpaRepository<Event, Integer> {
}
