package com.springprojects.entity;

/* 
Eren created on 19.07.2020 
*/

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USER_ADDRESSES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@ToString
public class Address implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_user_address", allocationSize = 1)
    @GeneratedValue(generator = "seq_user_address", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "address", length = 500)
    private String address;

    @Enumerated
    private AddressType addressType;

    @Column(name = "active")
    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "user_addresses_id")
    private User user;

    public enum AddressType {
        HOME,
        WORK,
        OTHER
    }
}
