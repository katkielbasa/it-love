package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class Entry {
	
	private Long id;
	
	private EntryCategory category;// = EntryCategory.DEFAULT;
	
	private Person person;// = new Person();
	
	private Address address;// = new Address();
        
	@Autowired//czy w kontenerze jest obiekt klasy phon i  tworzy go sobie w kontenerze,
                //potem przypisujedo entry
                //NA POLA KLASY !! tworzy beany pol !!!!
	private Phone phone;// = new Phone(); zamiast obiekt�w - puste referencje ,
                            //bo obiekty stworza sie w kontenerze w springu
	
	@Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}
	
	public Long getId() {
	
		return id;
	}
	
	public void setId( Long id ) {
	
		this.id = id;
	}

	public EntryCategory getCategory() {
	
		return category;
	}

	public Person getPerson() {
	
		return person;
	}

	public Address getAddress() {
	
		return address;
	}

	public void setCategory( EntryCategory category ) {
	
		this.category = category;
	}
	
	public void setPerson( Person person ) {
	
		this.person = person;
	}
	
	public void setAddress( Address address ) {
	
		this.address = address;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
}
