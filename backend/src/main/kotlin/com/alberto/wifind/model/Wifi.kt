package com.alberto.wifind.model

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "TWifi")
data class Wifi (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0,

        @NotBlank
        val ssid: String = "",

        @NotBlank
        val nivel: Int = 0
)