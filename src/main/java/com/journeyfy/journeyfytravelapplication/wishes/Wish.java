package com.journeyfy.journeyfytravelapplication.wishes;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.journeyfy.journeyfytravelapplication.activityentity.Entity;
import com.journeyfy.journeyfytravelapplication.users.User;
import lombok.*;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@javax.persistence.Entity
@Table(name = "wish")
@EqualsAndHashCode
public class Wish {
    @Id
    @SequenceGenerator(name = "wish_sequence", sequenceName = "wish_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wish_sequence")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;
    private String name;
    @ManyToOne()
    @JoinColumn(name = "activity_entity_id")
    private Entity entity;





}
