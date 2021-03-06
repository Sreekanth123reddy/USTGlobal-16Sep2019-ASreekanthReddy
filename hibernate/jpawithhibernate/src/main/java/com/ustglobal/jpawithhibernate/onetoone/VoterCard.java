package com.ustglobal.jpawithhibernate.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;
@Table(name="votercard")
@Entity
@Data

public class VoterCard {
	@Id
	@Column
	private int vid;
	@Column
	private String name;
	@Exclude
	@OneToOne(mappedBy ="voterCard")
	private Person person;
}
