package com.pattern.adapter;

import com.pattern.adapter.model.LoggerAdapter;
import com.pattern.adapter.model.NewLogger;
import com.pattern.adapter.model.OldLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterApplication {

	public static void main(String[] args) {

		OldLogger oldLogger = new OldLogger();

		NewLogger newLogger = new LoggerAdapter(oldLogger);

		newLogger.log("This is a new msg using adapter Patter");
	}


}
