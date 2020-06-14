package org.gpk.springbootexamples.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.gpk.springbootexamples.model.Record;
import org.gpk.springbootexamples.repository.RecordRepository;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RecordMutation implements GraphQLMutationResolver {
    final private RecordRepository recordRepository;

    public Record createRecord(final String name) {
        Record newRecord = new Record(name);

        recordRepository.save(newRecord);
        return newRecord;
    }
}
