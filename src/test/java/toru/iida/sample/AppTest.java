package toru.iida.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Unit test for simple App.
 */
public class AppTest {

	JsonNode jsonNode;
	ObjectMapper mapper;

	@Before
	public void setUp() {
		this.mapper = new ObjectMapper();
	}

	@Test
	public void test1N() throws IOException {
		File file = new File("./src/test/resource/test.json");
		InputStreamReader inputStream = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8);
		jsonNode = mapper.readTree(inputStream);

		String member = jsonNode.get("object_list").toString();

		System.out.println(member);
	}

	@Test
	public void test2N() throws IOException {
		File file = new File("./src/test/resource/test.json");
		jsonNode = mapper.readTree(file);

		String member = jsonNode.get("object_list").toString();

		System.out.println(member);
	}
}
