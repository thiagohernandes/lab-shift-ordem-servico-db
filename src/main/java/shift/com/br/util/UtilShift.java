package shift.com.br.util;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
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
	 * Conversão de obj string para Date
	 * @author Thiago Hernandes de Souza
	 * @since 25-03-2018
	 * @param obj string
	 * @return Date 
	 * */
	public Date stringObjToDate(String obj) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    Date parsedDate = dateFormat.parse(obj);
	    return parsedDate;	    
	}
	
	/**
	 * Conversão de timestamp para string format yyyy-MM-dd HH:mm:ss
	 * @author Thiago Hernandes de Souza
	 * @since 25-03-2018
	 * @param timestamp
	 * @return Date 
	 * */
	public String timeStampToString(Timestamp dataHora) throws ParseException {
		java.util.Date date = new java.util.Date(new Long(dataHora.getTime()));
		String dateStr = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
	    return dateStr;	    
	}
	
	/**
	 * Conversão de string para timestamp format yyyy-MM-dd HH:mm:ss
	 * @author Thiago Hernandes de Souza
	 * @since 25-03-2018
	 * @param string
	 * @return timestamp
	 * */
	public Timestamp timeStampToString(String dataHora) throws ParseException {
	    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = dateFormat.parse(dataHora);
		long time = date.getTime();
		return new Timestamp(time);
	}
	
	/**
	 * Conversão de date para string format yyyy-MM-dd
	 * @author Thiago Hernandes de Souza
	 * @since 27-03-2018
	 * @param date
	 * @return string format yyyy-MM-dd
	 * */
	public String dateToString(Date data) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(data);
	}
	
	/**
	 * Ajuste de data - temporal
	 * @author Thiago Hernandes de Souza
	 * @since 31-03-2018
	 * @param long
	 * @return java.sql.Timestamp
	 * */
	public java.sql.Timestamp trataDataTemporal(long data) {
		long hours24 = 24L * 60L * 60L * 1000L;
		return new java.sql.Timestamp(data + hours24);
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
