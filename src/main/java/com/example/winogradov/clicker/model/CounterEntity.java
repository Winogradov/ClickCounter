package com.example.winogradov.clicker.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "counts2")
public class CounterEntity {

    public CounterEntity() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer counter;
    private LocalDateTime lastUpdated;

    public CounterEntity(Long id, Integer counter, LocalDateTime lastUpdated) {
        this.id = id;
        this.counter = counter;
        this.lastUpdated = lastUpdated;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;

    }
}
