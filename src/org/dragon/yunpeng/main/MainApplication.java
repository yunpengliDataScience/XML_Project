package org.dragon.yunpeng.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.dragon.yunpeng.generated.xjc.CD;
import org.dragon.yunpeng.generated.xjc.Catalog;


public class MainApplication {

	public static void main(String[] args) {
		System.out.println("hello world!");

		unmarshallTest();

		marshallTest();

		manipulateXML();
	}

	private static void manipulateXML() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			// Unmarshalling (Convert XML instance into Java objects)
			Catalog catalog = (Catalog) jaxbUnmarshaller
					.unmarshal(new File("C:\\Projects\\XML_Project\\source_xml\\cd_catalog.xml"));

			System.out.println(catalog);

		} catch (JAXBException e) {

			e.printStackTrace();
		}

	}

	public static void unmarshallTest() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			// -------------------------------------------------------------------
			// Load XML to Java objects
			// Unmarshalling (Convert XML instance into Java objects)
			// -------------------------------------------------------------------
			Catalog catalog = (Catalog) jaxbUnmarshaller
					.unmarshal(new File("C:\\Projects\\XML_Project\\source_xml\\cd_catalog.xml"));

			// Create a CD object
			CD cd = new CD();
			cd.setARTIST("Yunpeng Li");
			cd.setCOMPANY("BAE");
			cd.setCOUNTRY("USA");
			cd.setPRICE(15);
			cd.setTITLE("Enigma");
			cd.setYEAR(Short.valueOf("2021"));

			// Add the new CD object into the Catalog object
			catalog.addACD(cd);

			// -------------------------------------------------------------
			// Write the modified Java objects back to XML.
			// -------------------------------------------------------------
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			File file = new File("C:\\Projects\\XML_Project\\generated_xml\\cd_catalog_new2.xml");

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			// Marshalling (Convert Java objects into XML)
			jaxbMarshaller.marshal(catalog, file);
			jaxbMarshaller.marshal(catalog, System.out);

		} catch (JAXBException e) {

			e.printStackTrace();
		}
	}

	public static void marshallTest() {

		// Create a Catalog object
		Catalog catalog = new Catalog();

		// Create a CD object
		CD cd = new CD();
		cd.setARTIST("Yunpeng Li");
		cd.setCOMPANY("BAE");
		cd.setCOUNTRY("USA");
		cd.setPRICE(15);
		cd.setTITLE("Enigma");
		cd.setYEAR(Short.valueOf("2021"));

		// Add the new CD object into the Catalog object
		catalog.addACD(cd);

		JAXBContext jaxbContext;
		try {

			jaxbContext = JAXBContext.newInstance(Catalog.class);

			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			File file = new File("C:\\Projects\\XML_Project\\generated_xml\\cd_catalog_new.xml");

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			// Marshalling (Convert Java objects into XML)
			jaxbMarshaller.marshal(catalog, file);
			jaxbMarshaller.marshal(catalog, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
