package program;

import org.springframework.test.context.ContextConfiguration;
import program.frontend.frontEndMain;

@ContextConfiguration(locations = "/context.xml")
public class ProgramApplication {
	public static void main(String[] args) {
	    frontEndMain window = new frontEndMain();
		window.start();
	}
}