package com.cg.entities;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "placement")
public class Placement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int place_id;
    private String place_name;
    private LocalDate date;
    private String qualification;
    private int place_year;
    
    @ManyToOne(cascade=CascadeType.ALL)//making connection with college
	@JoinColumn(name="college_id")
	private College college;
    
    //getter and setters methods
    public int getPlace_id() {
		return place_id;
	}

	public void setPlace_id(int place_id) {
		this.place_id = place_id;
	}

	public int getPlace_year() {
		return place_year;
	}

	public void setPlace_year(int place_year) {
		this.place_year = place_year;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

}