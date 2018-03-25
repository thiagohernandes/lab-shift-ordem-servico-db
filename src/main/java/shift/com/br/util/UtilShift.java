package shift.com.br.util;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Classe com funções genéricas utilitárias
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

public class UtilShift {

	/**
	 * Conversão de obj string para Timestamp
	 * @author Thiago Hernandes de Souza
	 * @since 25-03-2018
	 * @param obj string
	 * @return Timestamp 
	 * */
	public Timestamp stringObjToTimestamp(String obj) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Date parsedDate = dateFormat.parse(obj);
	    return new java.sql.Timestamp(parsedDate.getTime());	    
	}
	
	/**
	 * Load de arquivo SQL noa path resources
	 * @author Thiago Hernandes de Souza
	 * @since 25-03-2018
	 * @param nome do arquivo
	 * @return conteúdo da consulta
	 * */
	public String loadConsultaSQL(String fileName) {
		StringBuilder result = new StringBuilder("");

		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());

		try (Scanner scanner = new Scanner(file)) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				result.append(line).append("\n");
			}
			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result.toString();
	}
	
}
