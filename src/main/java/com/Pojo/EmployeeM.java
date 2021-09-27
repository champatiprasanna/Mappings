package com.Pojo;
import javax.persistence.*;

@Entity
@Table(name = "EmployeeM")
public class EmployeeM {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EmployeeId")
	private int id;
	@Column(name = "EmployeeName")
	private String name;
	@ManyToOne(targetEntity=DepartmentM.class,cascade = CascadeType.ALL)
	private DepartmentM department;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DepartmentM getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentM department) {
		this.department = department;
	}
	
	
	

}
