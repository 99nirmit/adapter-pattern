package com.pattern.adapter;

import com.pattern.adapter.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.Yaml;

@SpringBootApplication
public class AdapterApplication {

	public static void main(String[] args) {

		//Old Logger Project
		OldLogger oldLogger = new OldLogger();

		NewLogger newLogger = new LoggerAdapter(oldLogger);

		newLogger.log("This is a new msg using adapter Patter");

		// Third Party Project

		ThirdPartyFileOperations thirdPartyFileOperations = new ThirdPartyFileOperations();

		FileOperationsAdapter fileOperationsAdapter = new FileOperationsAdapter(thirdPartyFileOperations);

		fileOperationsAdapter.saveFile("example.txt", "This is the content of file.");

		//	New Database Connection Project

		OldDatabase oldDatabase = new OldDatabase();

		DatabaseAdapter databaseAdapter = new DatabaseAdapter(oldDatabase);

		databaseAdapter.connect("jdbc:oldDatabaseConnectionString");

//		Payment Method

		NewPaymentGateway newPaymentGateway = new NewPaymentGateway();

		PaymentProcesserAdapter paymentProcesserAdapter = new PaymentProcesserAdapter(newPaymentGateway);

		paymentProcesserAdapter.makePayment("Payment Details for the new payment");
	}




}
