package org.gpk.springbootexamples.repository;

import org.gpk.springbootexamples.model.Record;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecordRepository extends CrudRepository<Record, Long> {
    List<Record> findByNameLike(String name);
    List<Record> getRecordsByName(String name);
    Record findByRecordId(long id);
}
