package table;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Event {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Time timeFrom;
	private Time duration;
	@ManyToOne
	@JoinColumn(name = "type_id")
	private Type type;
	@ManyToOne
	@JoinColumn(name = "schedule_id")
	private Schedule schedule;
	private Boolean isConfirmed;
	
	public Event() {
		
	}

	public Event(Time timeFrom, Time duration, Type type, Schedule schedule,
			Boolean isConfirmed) {
		this.timeFrom = timeFrom;
		this.duration = duration;
		this.type = type;
		this.schedule = schedule;
		this.isConfirmed = isConfirmed;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Time getTimeFrom() {
		return timeFrom;
	}

	public void setTimeFrom(Time timeFrom) {
		this.timeFrom = timeFrom;
	}

	public Time getDuration() {
		return duration;
	}

	public void setDuration(Time duration) {
		this.duration = duration;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public Boolean getIsConfirmed() {
		return isConfirmed;
	}

	public void setIsConfirmed(Boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}
	
	
	
	
	

}
