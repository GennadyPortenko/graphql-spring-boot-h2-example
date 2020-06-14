package org.gpk.springbootexamples.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "records")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Record implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long recordId;

    @NonNull
    @Column(length = 64, nullable = false)
    private String name;
}
