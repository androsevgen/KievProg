package pro2_xml_jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Date;

/**
 * Created by admin on 16.12.2016.
 */
public class RunnerAdd {
    public static void main(String[] args) throws JAXBException, IOException {

        Trains trains = new Trains();
        Train train = new Train();

        trains.add(new Train(12, "Kiev", "Tyda", new Date(), LocalTime.now()));
        trains.add(new Train(13, "Kiev", "Nazad", new Date(), LocalTime.now()));
        trains.add(new Train(14, "Kiev", "Tyzla", new Date(), LocalTime.now()));


//        trains.add(new Train());

        File file = new File("C:\\Users\\admin\\IdeaProjects\\KievProg\\src\\pro2_xml_jaxb\\train1.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Trains.class);
        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // пишем в файл
        marshaller.marshal(trains, file);
        marshaller.marshal(trains, System.out);
    }
}
