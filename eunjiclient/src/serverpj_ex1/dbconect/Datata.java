package serverpj_ex1.dbconect;

import java.util.UUID;

public class Datata {
	
	//return salt 문자열
	public static String getSalt() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
