package com.app.pojos;

import java.time.LocalTime;
import javax.persistence.*;

@Entity
@Table(name = "railways")
public class Railway extends BaseEntity
{
	@Column(name = "rail_name", length = 30, nullable = false, unique = true)
	private String railName;

	@Enumerated(EnumType.STRING)
	@Column(length = 30, nullable = false)
	private Catagory cat;

	@Column(name = "start_time", nullable = false)
	private LocalTime startTime;

	@Column(name = "end_time", nullable = false)
	private LocalTime endTime;

	@Column(length = 30, nullable = false)
	private String source;

	@Column(length = 30, nullable = false)
	private String destination;

	@Column(nullable = false)
	private double distance;

	@Column(nullable = false)
	private int frequency;

	public String getRailName() {
		return railName;
	}

	public void setRailName(String railName) {
		this.railName = railName;
	}

	public Catagory getCat() {
		return cat;
	}

	public void setCat(Catagory cat) {
		this.cat = cat;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "Railway [railName=" + railName + ", cat=" + cat + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", source=" + source + ", destination=" + destination + ", distance=" + distance + ", frequency="
				+ frequency + ", getId()=" + getId() + "]";
	}
	
}
