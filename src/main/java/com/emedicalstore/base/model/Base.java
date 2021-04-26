package com.emedicalstore.base.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;



@MappedSuperclass
public class Base {


    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    
     
    @Column(name="created_on")
    private Date createdon;
     
    @Column(name="created_by")
    private String createdby;
    
    
    @Column(name="updated_on")
    private Date updatedon;
     
    @Column(name="updated_by")
    private String updatedby;
    
    
    @Column(name="status")
    private String status;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getCreatedon() {
		return createdon;
	}


	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}


	public String getCreatedby() {
		return createdby;
	}


	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}


	public Date getUpdatedon() {
		return updatedon;
	}


	public void setUpdatedon(Date updatedon) {
		this.updatedon = updatedon;
	}


	public String getUpdatedby() {
		return updatedby;
	}


	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Base(Long id, Date createdon, String createdby, Date updatedon, String updatedby, String status) {
		super();
		this.id = id;
		this.createdon = createdon;
		this.createdby = createdby;
		this.updatedon = updatedon;
		this.updatedby = updatedby;
		this.status = status;
	}


	public Base() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
    
}
