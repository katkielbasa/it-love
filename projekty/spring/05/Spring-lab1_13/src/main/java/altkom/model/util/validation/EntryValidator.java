package altkom.model.util.validation;

import org.springframework.validation.Errors;

import altkom.model.Entry;

public class EntryValidator {
    
    private PersonValidator personValidator;
    
    private AddressValidator addressValidator;
    
    private PhoneValidator phoneValidator;
    
    private CarValidator carValidator;
    
    private KomputerValidator komputerValidator;
    
    public EntryValidator() {
        personValidator = new PersonValidator();
        addressValidator = new AddressValidator();
        phoneValidator = new PhoneValidator();
        carValidator = new CarValidator();
        komputerValidator = new KomputerValidator();
    }
    
    public void validate(Entry entry, Errors errors) {
        personValidator.validate(entry.getPerson(), errors);
        addressValidator.validate(entry.getAddress(), errors);
        phoneValidator.validate(entry.getPhone(), errors);
        carValidator.validate(entry.getCar(), errors);
        komputerValidator.validate(entry.getKomputer(), errors);
    }
    
}
