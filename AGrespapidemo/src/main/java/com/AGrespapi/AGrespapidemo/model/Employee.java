package com.AGrespapi.AGrespapidemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name= "employee")
public class Employee {
		
		@Id
		@Column(name="emp_id")
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int Id;
		
		@Column(name="first_name")
		private String first_name;
		
		@Column(name="last_name")
		private String last_name;
		
		@Column(name="dob")
		private int dob;
		
		@Column(name="position")
		private String position;
		
		@Column(name="experience")
		private int experience;
		
		@Column(name="highest_edu_level")
		private int highest_edu_level;
		
		@Column(name="salary")
		private int salary;
		
		@Column(name="supervisory_role")
		private String supervisory_role;
		
		
		  @ManyToOne(fetch = FetchType.LAZY)
		  @JoinColumn(name = "department") 
		  private Department department;
		 
		
		public Employee() {
		
		}


		public Employee(String first_name, String last_name, int dob, String position, int experience,
				int highest_edu_level, int salary, String supervisory_role, Department department) {
			super();
			this.first_name = first_name;
			this.last_name = last_name;
			this.dob = dob;
			this.position = position;
			this.experience = experience;
			this.highest_edu_level = highest_edu_level;
			this.salary = salary;
			this.supervisory_role = supervisory_role;
			this.department = department;
		}


		public int getId() {
			return Id;
		}


		public void setId(int id) {
			Id = id;
		}


		public String getFirst_name() {
			return first_name;
		}


		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}


		public String getLast_name() {
			return last_name;
		}


		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}


		public int getDob() {
			return dob;
		}


		public void setDob(int dob) {
			this.dob = dob;
		}


		public String getPosition() {
			return position;
		}


		public void setPosition(String position) {
			this.position = position;
		}


		public int getExperience() {
			return experience;
		}


		public void setExperience(int experience) {
			this.experience = experience;
		}


		public int getHighest_edu_level() {
			return highest_edu_level;
		}


		public void setHighest_edu_level(int highest_edu_level) {
			this.highest_edu_level = highest_edu_level;
		}


		public int getSalary() {
			return salary;
		}


		public void setSalary(int salary) {
			this.salary = salary;
		}


		public String getSupervisory_role() {
			return supervisory_role;
		}


		public void setSupervisory_role(String supervisory_role) {
			this.supervisory_role = supervisory_role;
		}


		public Department getDepartment() {
			return department;
		}


		public void setDepartment(Department department) {
			this.department = department;
		}

		
				
	}

