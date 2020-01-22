package comm.hibernate.bidirection;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Album")
public class Album {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "album_id")
	private int album_id;
	
	@Column(name = "album_name")
	private String albumName;
	
	@Column(name = "creation_date")
	private LocalDate creationDate;
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "image_id")
	private MyImage image;

	public int getId() {
		return album_id;
	}

	public void setId(int id) {
		this.album_id = id;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	

	public MyImage getImage() {
		return image;
	}

	public void setImage(MyImage image) {
		this.image = image;
	}

	public Album() {
		
	}

	public Album( String albumName, LocalDate creationDate) {
		super();
		
		this.albumName = albumName;
		this.creationDate = creationDate;
		
	}

	@Override
	public String toString() {
		return "Album [album_id=" + album_id + ", albumName=" + albumName + ", creationDate=" + creationDate
				+ ", image=" + image + "]";
	}

	
	
	


}
