package com.example.eva.entity

import jakarta.persistence.*

@Entity
@Table(name = "users")
class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var nameUser: String? = null
    var address: String? = null
    var dni: Int? = null

}