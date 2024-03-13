package com.kanban.entity;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

	@Entity
	@Table(name = "employees")
	public class Employee implements Serializable {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    
	    private String name;
	    private String email;

	   // @NotFound(action = NotFoundAction.IGNORE)
	    //@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST, optional = false)
	    //@JoinColumn(name = "create_id", nullable = true)
	   
	   // @NotFound(action = NotFoundAction.IGNORE)
	   // @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST, optional = true)
	   // @JoinColumn(name = "create_id", nullable = true)
	    
	  
	    //@JoinColumn(name = "create_id", nullable = true)
	    //@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	   // private createProject createproject;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

				public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", createproject=" 
					+ "]";
		}

		
	   

}
