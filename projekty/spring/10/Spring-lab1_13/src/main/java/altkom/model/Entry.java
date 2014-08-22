package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;


public class Entry {
	
	private Long id;
	
	private EntryCategory category = EntryCategory.DEFAULT;
	
	private Person person = new Person();
	
	private Address address = new Address();
	
	private Phone phone = new Phone();
        private Car car = new Car();
        
        private Komputer komputer = new Komputer();
	
	public String categoryAsPrettyString() {
		return category.toString();
	}
	
	public String personAsPrettyString() {
		return person.prettyFormat();
	}
	
	public String addressAsPrettyStringString() {
		return address.prettyFormat();
	}
	
	public String phoneAsPrettyString() {
		return phone.prettyFormat();
	}
	
	public String phoneTypeAsPrettyString() {
		return phone.getType().toString();
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

	
	public Phone getPhone() {
	
		return phone;
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

	
	public void setPhone( Phone phone ) {
	
		this.phone = phone;
	}

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Komputer getKomputer() {
        return komputer;
    }

    public void setKomputer(Komputer komputer) {
        this.komputer = komputer;
    }
	
}
