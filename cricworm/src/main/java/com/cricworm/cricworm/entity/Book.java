/**
 * 
 */
package com.cricworm.cricworm.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Aashish Bimal
 *
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Book {
	@Id
	@GeneratedValue
	Long id;
	
	String name;
	
	@OneToMany(mappedBy="book",cascade=CascadeType.ALL,orphanRemoval=true)
	//@JoinColumn(name="book_id")
	List<Authors> authors = new ArrayList<>();
	
	@Override
	public String toString() {
		return "id>> "+id+" BookName>> "+name;
	}
}
