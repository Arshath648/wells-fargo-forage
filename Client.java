package com.wellsfargo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor advisor;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @OneToOne(mappedBy = "client",
    cascade = CascadeType.ALL)
    private Portfolio portfolio;
}
