package br.ufg.inf.mf.pratica;
import java.time.*;
import java.util.Calendar;
import java.util.Locale;

public class Nome {
	public static void main(String args[]){
		Locale localAtual = Locale.getDefault();
		Calendar calendarioAtual = Calendar.getInstance(localAtual);
		System.out.println(calendarioAtual
		.getDisplayName(Calendar.DAY_OF_WEEK,
		 		Calendar.LONG_STANDALONE, 
				localAtual));
	}

}
