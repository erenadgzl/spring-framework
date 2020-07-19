package com.springprojects.entity;

/* 
Eren created on 19.07.2020 
*/

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "USERS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@ToString
public class User implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_user", allocationSize = 1)
    @GeneratedValue(generator = "seq_user", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @OneToMany
    @JoinColumn(name = "user_addresses_id")
    private List<Address> addressList;
}
