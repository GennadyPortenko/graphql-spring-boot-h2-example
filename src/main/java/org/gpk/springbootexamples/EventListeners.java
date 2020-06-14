package org.gpk.springbootexamples;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.gpk.springbootexamples.model.Record;
import org.gpk.springbootexamples.repository.RecordRepository;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor()
public class EventListeners {
    final private RecordRepository recordRepository;

    @EventListener({ContextRefreshedEvent.class})
    public void onStart() {
        recordRepository.save(new Record("Foo"));
        recordRepository.save(new Record("Bar"));
        recordRepository.save(new Record("FooBar"));
    }
}
