package fr.tlobgeois.teamsharing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.tlobgeois.teamsharing.jobs.entities.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {
}
