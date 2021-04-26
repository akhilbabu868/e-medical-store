package com.emedicalstore.base.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table
public class Category extends Base {
	
	
	    @Column(name="category_name")
	    private String categoryname;
	     
	    @Column(name="category_code")
	    private String categorycode;
	    
	    
	    @Column(name="description")
	    private String description;


		public String getCategoryname() {
			return categoryname;
		}


		public void setCategoryname(String categoryname) {
			this.categoryname = categoryname;
		}


		public String getCategorycode() {
			return categorycode;
		}


		public void setCategorycode(String categorycode) {
			this.categorycode = categorycode;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public Category(Long id, Date createdon, String createdby, Date updatedon, String updatedby, String status,
				String categoryname, String categorycode, String description) {
			super(id, createdon, createdby, updatedon, updatedby, status);
			this.categoryname = categoryname;
			this.categorycode = categorycode;
			this.description = description;
		}


		public Category() {
			super();
			// TODO Auto-generated constructor stub
		}


	
	    
    
	    
}
