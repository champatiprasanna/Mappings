package com.Pojo;
import javax.persistence.*;


@Entity
@Table(name = "Department")
public class DepartmentM {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "departmentId")
	private int id;
	@Column(name= "DepartmentName")
	private String department;
	//@OneToOne(targetEntity=EmployeeM.class,cascade = CascadeType.ALL)
	//private EmployeeM employee;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	/*public EmployeeM getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeM employee) {
		this.employee = employee;
	}*/
	

}
