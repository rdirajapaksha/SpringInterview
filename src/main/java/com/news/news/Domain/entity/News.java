package com.news.news.Domain.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class News {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int newsid;
	private String newsheadline;
	private String newsdesc;

	@ManyToOne(targetEntity = Category.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "categoryid", referencedColumnName = "catid")
	private Category category;

}
