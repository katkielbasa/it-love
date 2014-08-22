package altkom.model.util.validation;

import altkom.model.Komputer;
import altkom.model.util.StringUtils;
import org.springframework.validation.Errors;

public class KomputerValidator {

    public void validate(Komputer komputer, Errors errors) {
        if (StringUtils.isEmpty(komputer.getNazwa())) {
            errors.rejectValue("komputer.nazwa", "required");
        }

        if (StringUtils.isEmpty(komputer.getOpis())) {
            errors.rejectValue("komputer.opis", "required");
        }
    }

}
