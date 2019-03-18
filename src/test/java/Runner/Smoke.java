package Runner;

import java.io.IOException;

import org.testng.annotations.Test;

public class Smoke extends Base{
	@Test
	public void sam() throws IOException, InterruptedException {
		openBrowser();
		tearDown();
	}

}
