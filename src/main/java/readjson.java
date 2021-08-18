import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

@SuppressWarnings("unused")
public class readjson {

	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, IOException, ParseException {
		
		// creating json parser
JSONParser jsonParse = new JSONParser();

 
 // parsing all the values to pass on
 

	JSONObject jsonObj =(JSONObject) jsonParse.parse(new FileReader("json\\read.data"));

 
// reading data from the json file 

String Uname = (String) jsonObj.get("Username");
String Pwd = (String) jsonObj.get("Password");

System.out.println(Uname);
System.out.println(Pwd);

 

 
 
 
		

	}

}
