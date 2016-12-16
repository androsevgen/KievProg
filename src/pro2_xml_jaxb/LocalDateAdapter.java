package pro2_xml_jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {
    @Override
    public LocalDate unmarshal(String v) throws Exception {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.parse(v, dateTimeFormatter);
        return date;
    }

    @Override
    public String marshal(LocalDate v) throws Exception {
        return v.toString();
    }
}