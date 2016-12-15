package pro2_xml_jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Runner {
    public static void main(String[] args) throws JAXBException {
        Trains trains = new Trains();


        File file = new File("G:\\prooooo\\KievProg\\src\\pro2_xml_jaxb\\train.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Trains.class);
        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        trains = (Trains) unmarshaller.unmarshal(file);
        System.out.println(trains);

        Train train = new Train();
        System.out.println(train.getDeparture());
    }

  /*  public class TimeFormatter extends XmlAdapter<String,LocalTime> {
        @Override
        public LocalTime unmarshal(String v) throws Exception {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime time = LocalTime.parse(v, dtf);
            return time;
        }

        @Override
        public String marshal(LocalTime v) throws Exception {
            return v.toString();
        }
    }

        public class DateFormatter extends XmlAdapter<String, LocalDate> {
            @Override
            public LocalDate unmarshal(String v) throws Exception {

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate date = LocalDate.parse(v, dtf);
                return date;
            }

            @Override
            public String marshal(LocalDate v) throws Exception {
                return v.toString();
            }
        }*/

    }
