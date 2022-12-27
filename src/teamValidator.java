import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class teamValidator
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader("src/com/howtodoinjava/demo/jsonsimple/teamRCB.json");
        Object obj = jsonParser.parse(reader);
        JSONArray playerList = (JSONArray) obj;
        System.out.println("List of All Player" + playerList);
        playerList.forEach(player -> parsePlayerObject((JSONObject) player));
        int count = 0;
        int i;
        for (i = 0; i < playerList.size(); i++)
            if (playerList.get(i).toString().contains("Wicket-keeper")) {
                count++;
            }
        System.out.println("test for atleast one wicket keeper in team");
        Assert.assertTrue(count>0);

        for (i = 0; i < playerList.size(); i++)
            if (playerList.get(i).toString().contains("India")) {
                count++;
            }
        System.out.println("test for only 4 foreign player in team");
        Assert.assertTrue(count<6);
    }

    private static void parsePlayerObject(JSONObject obj) {
        //Get player object within list
        JSONObject playerObject = (JSONObject) obj.get("player");

        //Get player name
        String name = (String) obj.get("name");
        System.out.println("name ->" + name);

        //Get player origin country
        String country = (String) obj.get("country");
        System.out.println("origin county ->" + country);

//        Get player role

        String role = (String) obj.get("role");
        System.out.println("role in team ->" + role);

        //        Get player price
        String price = (String) obj.get("price-in-crores");
        System.out.println("price in crores ->" + price);
    }
}