package in.nareshit.raghu.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

public class MessageRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(MessageRunner.class);
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Hello India");
	}

}
