package com.teste.primeiro_exemplo.model;

import jakarta.persistence.GenerationType;

public @interface GeneratedValue {

    GenerationType strategy();

}
