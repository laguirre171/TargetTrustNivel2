package br.com.tt;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TesteJUnit.class);
		for(Failure failure : result.getFailures()){
			System.out.println(failure.toString());
			System.out.println(failure.getDescription());
			System.out.println(failure.getTrace());
		}
		System.out.println(result.wasSuccessful());
		
		int qtdRunCount = result.getRunCount();
		int qtdRunFailed = result.getFailureCount();
		System.out.println("Testes Executados: " + qtdRunCount);
		System.out.println("Testes Failed    : " + qtdRunFailed);
	
	}
}
