package com.horusLog.domain

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Role(id: Long?, name: String): Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public val id: Long? = id;
    public val name: String = name;

}