package com.mr185234.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Paths;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.swagger.models.Swagger;
import io.swagger.parser.SwaggerParser;
import io.swagger.v3.core.util.Json;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.parser.OpenAPIV3Parser;
import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.ClassLoaderUtil;

public class DefaultDemoService implements  DemoService {

    private static String contract(String jsonFilePath) {

        String contract = null;

        try {
            final JSONParser jsonParser = new JSONParser();
            final InputStream in = DemoApplication.class.getResourceAsStream(jsonFilePath);
            final InputStreamReader fileReader = new InputStreamReader(in);
            final Object obj = jsonParser.parse(fileReader);

            final JSONObject jsonObject =  (JSONObject) obj;
            if(jsonObject.containsKey("openapi")) {
                final OpenAPIV3Parser parser = new OpenAPIV3Parser();
                contract = Json.pretty(parser.readContents(jsonObject.toJSONString(), null, null)
                        .getOpenAPI());
            }
            if (jsonObject.containsKey("swagger")) {
                final SwaggerParser parser = new SwaggerParser();
                contract = Json.pretty(parser.parse(jsonObject.toJSONString()));
            }

            contract = jsonObject.toJSONString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return contract;
    }

    @Override public String getContract(String contract) {
        if(contract.equals("swagger.json") || contract.equals("openapi.json")) {
            return contract("/contracts/" + contract);
        }
        return contract("/contracts/unknown.json");
    }
}
