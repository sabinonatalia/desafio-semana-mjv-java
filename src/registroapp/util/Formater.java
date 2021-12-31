package registroapp.util;

import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formater extends LeitorRemessa {
	
	public static String cpf(String cpf) {
		String part1 = cpf.substring(0,3);
		String part2 = cpf.substring(3,6);
		String part3 = cpf.substring(6,9);
		String part4 = cpf.substring(9,11);
		String cpfFormatado = part1.concat(".").concat(part2).concat(".").concat(part3).concat("-").concat(part4);
		return cpfFormatado;
	}
	
	public static String rg(String rg) {
		String part1 = rg.substring(0,2);
		String part2 = rg.substring(2,5);
		String part3 = rg.substring(5,8);
		String part4 = rg.substring(8,9);
		String rgFormatado = part1.concat(".").concat(part2).concat(".").concat(part3).concat("-").concat(part4);
		return rgFormatado;
	}
	
	
	
	public static String data(LocalDate localDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return localDate.format(formatter);
	}

}
