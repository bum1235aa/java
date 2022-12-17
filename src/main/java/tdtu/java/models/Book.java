package tdtu.java.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bookid")
	private int id;
	
	@Column(name="bookname")
	private String name;
	
	@Column(name="bookcover")
	private String img;
	
	@Column(name="releasedyear")
	private int releadsedYear;
	
	@Column(name="originallanguage")
	private String lang;
	
	@Column(name="authorid")
	private int authorId;
	
	@Column(name="description")
	private String desc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getReleadsedYear() {
		return releadsedYear;
	}
	public void setReleadsedYear(int releadsedYear) {
		this.releadsedYear = releadsedYear;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthor_id(int authorId) {
		this.authorId = authorId;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

}
