package org.dragon.yunpeng.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.dragon.yunpeng.generated.xjc2.CD;
import org.dragon.yunpeng.generated.xjc2.CATALOG;


public class MainApplication2 {

	public static void main(String[] args) {
		System.out.println("hello world!");

		unmarshallTest();

		marshallTest();

		manipulateXML();
	}

	private static void manipulateXML() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(CATALOG.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			// Unmarshalling (Convert XML instance into Java objects)
			CATALOG catalog = (CATALOG) jaxbUnmarshaller
					.unmarshal(new File("C:\\Projects\\XML_Project\\source_xml\\cd_catalog.xml"));

			System.out.println(catalog);

		} catch (JAXBException e) {

			e.printStackTrace();
		}

	}

	public static void unmarshallTest() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(CATALOG.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			// -------------------------------------------------------------------
			// Load XML to Java objects
			// Unmarshalling (Convert XML instance into Java objects)
			// -------------------------------------------------------------------
			CATALOG catalog = (CATALOG) jaxbUnmarshaller
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

			File file = new File("C:\\Projects\\XML_Project\\generated_xml\\cd_catalog_new_ss2.xml");

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
		CATALOG catalog = new CATALOG();

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

			jaxbContext = JAXBContext.newInstance(CATALOG.class);

			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			File file = new File("C:\\Projects\\XML_Project\\generated_xml\\cd_catalog_new_ss.xml");

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
