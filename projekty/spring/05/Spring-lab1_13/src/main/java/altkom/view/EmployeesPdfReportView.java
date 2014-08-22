package altkom.view;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import altkom.model.Entry;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Cell;
import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfCell;
import com.lowagie.text.pdf.PdfWriter;

@Component("employeesReport")
public class EmployeesPdfReportView extends AbstractPdfView {

    public static String ENTRIES_KEY = "entries";

    @Autowired
    private MessageSource messageSource;

    @Override
    protected void buildPdfDocument(Map model, Document document, PdfWriter writer,
            HttpServletRequest req, HttpServletResponse resp)
            throws Exception {

        List<Entry> entries = (List<Entry>) model.get(ENTRIES_KEY);

        Table table = buildBasicTable();

        for (Entry entry : entries) {
            table.addCell(entry.personAsPrettyString());
            table.addCell(entry.carAsPrettyStringString());
            table.addCell(entry.carAsPrettyStringString());
        }

        document.add(table);
    }

    private Table buildBasicTable() throws BadElementException {
        Table result = new Table(3);
        result.addCell(getMessage("report.name"));
        result.addCell(getMessage("report.marka"));
        result.addCell(getMessage("report.kolor"));

        return result;
    }

    private String getMessage(String code) {
        return messageSource.getMessage(code, new Object[]{}, new Locale("pl"));
    }

}
