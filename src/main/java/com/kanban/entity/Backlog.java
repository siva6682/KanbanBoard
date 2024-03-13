package com.kanban.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
		@Table(name = "Backlog")
		public class Backlog implements Serializable {

		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Long id;
		    private String login_page_is_not_working;
		    private String create_issuse;
			public Long getId() {
				return id;
			}
			public void setId(Long id) {
				this.id = id;
			}
			public String getLogin_page_is_not_working() {
				return login_page_is_not_working;
			}
			public void setLogin_page_is_not_working(String login_page_is_not_working) {
				this.login_page_is_not_working = login_page_is_not_working;
			}
			public String getCreate_issuse() {
				return create_issuse;
			}
			public void setCreate_issuse(String create_issuse) {
				this.create_issuse = create_issuse;
			}
		    
}
