package com.horusLog.domain

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class User(id: Long?, name: String, email: String): Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public var id: Long? = id;
    public var name: String = name;
    public var email: String = email;

}