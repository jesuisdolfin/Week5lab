package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="items")
public class ListItem {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="STORE")
	private String store;
	@Column(name="ITEM")
	private String item;

	// Getters & Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
	// Constructors
	public ListItem() {
		super();
	}
	public ListItem(String store, String item) {
		super();
		this.store = store;
		this.item = item;
	}
	
	// Helper Methods
	public String returnItemDetails( ) {
		return this.store + ": " + this.item;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
