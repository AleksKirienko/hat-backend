package ru.betry.hat.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import ru.betry.hat.entity.Words;

@Repository
public interface WordsRepository extends CassandraRepository<Words, Long> {
}
