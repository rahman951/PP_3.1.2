package com.example.sptingbootdemo.app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;


import java.util.Objects;

@Entity
@Table(name = "userss")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@NotEmpty(message = "Имя не заполнено")
	@Size(min = 2, max = 10, message = "Имя должно содержать от 2 до 10 символов")
	@Column(name = "name")
	private String firstName;
	
	@NotEmpty(message = "Фамилия не заполнена")
	@Size(min = 3, max = 15, message = "Слишком короткая или длинная фамилия")
	@Column(name = "last_name")
	private String lastName;
	
	@Min(value = 18, message = "Ошибка в возрасте, возраст должен быть > 18")
	@Column(name = "age")
	private int age;
	
	public User() {
	}
	
	public User(long id, String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return id == user.id && age == user.age && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName, age);
	}
	
	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", age=" + age +
				'}';
	}
}

