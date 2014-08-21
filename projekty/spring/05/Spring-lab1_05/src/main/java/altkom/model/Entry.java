package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Entry {

    public Car2 getCar2() {
        return car2;
    }

    public void setCar2(Car2 car2) {
        this.car2 = car2;
    }
	
	private Long id;
	
	private EntryCategory category = EntryCategory.DEFAULT;
	
	private Person person = new Person();
	
	private Address address = new Address();
	
	private Phone phone = new Phone();
        
        private Car car = new Car();
        
        private Car2 car2 = new Car2();
 
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
	
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