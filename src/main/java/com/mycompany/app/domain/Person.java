package com.mycompany.app.domain;

import java.time.Instant;

public class Person {

  private String name;
  private String surname;
  private Instant birthDate;

  public Person() {
  }

  public Person(final String name, final String surname, final Instant birthDate) {
    this.name = name;
    this.surname = surname;
    this.birthDate = birthDate;
  }

  public String getName() {
    return name;
  }

  public Person setName(final String name) {
    this.name = name;
    return this;
  }

  public String getSurname() {
    return surname;
  }

  public Person setSurname(final String surname) {
    this.surname = surname;
    return this;
  }

  public Instant getBirthDate() {
    return birthDate;
  }

  public Person setBirthDate(final Instant birthDate) {
    this.birthDate = birthDate;
    return this;
  }
}
