package com.panticdamjan.Project.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name ="counters")
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SimpleModel {

    @Id
    private Long id;

    @Column(name = "counter", nullable = false)
    private int counter;
}
