package pro2_xml_jaxb;

/*Есть список поездов, представленный с виде XML. Вывести на экран информацию о тех поездах, которые
        отправляются сегодня с 15:00 до 19:00.*/


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Runner {
    public static void main(String[] args) throws JAXBException {
        Trains trains = new Trains();
        Train train = new Train();


        //File file = new File("G:\\prooooo\\KievProg\\src\\pro2_xml_jaxb\\train.xml");
        File file = new File("C:\\Users\\admin\\IdeaProjects\\KievProg\\src\\pro2_xml_jaxb\\train.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Trains.class);
        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        trains = (Trains) unmarshaller.unmarshal(file);
        System.out.println(trains);

    }
}
