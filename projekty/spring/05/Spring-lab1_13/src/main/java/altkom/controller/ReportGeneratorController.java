package altkom.controller;

import altkom.model.repository.PhoneBookRepository;
import altkom.view.EmployeesPdfReportView;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller()
@RequestMapping("/generateReport.do")
public class ReportGeneratorController {

    @Autowired
    private PhoneBookRepository phoneBookRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView generateReport() {

        List list1 = phoneBookRepository.findAllPersons();
        List list2 = phoneBookRepository.findAllCars();
//        List list3 = null;

        List<String> list3 = new ArrayList<String>(list1);
        list3.addAll(list2);

//        for (int i = 0; i < list1.size(); i++) {
//            list3.add(list1.get(i));
//        }
//        for (int i = 0; i < list2.size(); i++) {
//            list3.add(list2.get(i));
//        }
        Map model = new HashMap();
        model.put(EmployeesPdfReportView.ENTRIES_KEY,
                list3);
       // model.put(EmployeesPdfReportView.ENTRIES_KEY,
        //         phoneBookRepository.findAllPersons());

        return new ModelAndView("employeesReport", model);
    }

    public PhoneBookRepository getPhoneBookRepository() {

        return phoneBookRepository;
    }

    public void setPhoneBookRepository(PhoneBookRepository phoneBookRepository) {

        this.phoneBookRepository = phoneBookRepository;
    }

}
