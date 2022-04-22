package com.zensar.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Employee_T")
public class Employee {
	
	@Id
	
	int employeeId;
	@Column
	String name;
	@Column
	double basicSalary;
	
	@OneToOne(mappedBy="employee", cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	Address address;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="skill_name", referencedColumnName="skillName")
	List<Skill> skillList;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bank_Id", referencedColumnName="bankId")
	BankAccount account;

	

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", basicSalary=" + basicSalary + ", address="
				+ address + ", skillList=" + skillList + ", account=" + account + "]";
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Skill> getSkillList() {
		return skillList;
	}

	public void setSkillList(List<Skill> skillList) {
		this.skillList = skillList;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}
	
	
	
	

}
