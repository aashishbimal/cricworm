/**
 * 
 */
package com.cricworm.cricworm.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Aashish Bimal
 *
 */

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Authors {
	@Id
	@GeneratedValue
	Long id;
	
	String authorName;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private Book book;
 
	@Override
	public String toString() {
		return "id >> "+id+" authorName>> "+authorName+" bookid>> "+book;
	}
}
