package org.gpk.springbootexamples.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.gpk.springbootexamples.model.Record;
import org.gpk.springbootexamples.repository.RecordRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class RecordQuery implements GraphQLQueryResolver {
    final private RecordRepository recordRepository;

    public Iterable<Record> getRecords() {
        return recordRepository.findAll();
    }

    public List<Record> getRecordsByName(final String name) {
        return recordRepository.getRecordsByName(name);
    }

    public List<Record> getRecordsByNameLike(final String name) {
        return recordRepository.findByNameLike(name);
    }

    public Record recordById(final long id) {
        return recordRepository.findByRecordId(id);
    }
}
