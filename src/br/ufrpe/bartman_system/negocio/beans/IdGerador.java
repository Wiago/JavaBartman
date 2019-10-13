package br.ufrpe.bartman_system.negocio.beans;

import java.util.Random;

public class IdGerador {
	private static Random r = new Random();
	public  static  String gerarId(String op) {
		String id = new String();
        
        switch (op) {
            case "1": // 
                id += op;
                id += random();
                break;
            case "2": // 
                id += op;
                id += random();
                break;
            case "3": // 
                id += op;
                id += random();
                break;
            default:
                break;
        }
		return id;
        
	}
	public static String random() {
        String s = new  String();
        for(int i = 0; i < 4; i++) {
            s += r.nextInt(9);
        }
        return s;
	}
}
