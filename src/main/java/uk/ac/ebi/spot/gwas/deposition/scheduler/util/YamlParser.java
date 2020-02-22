package uk.ac.ebi.spot.gwas.deposition.scheduler.util;

import com.google.gson.Gson;
import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class YamlParser {

    private static final Logger log = LoggerFactory.getLogger(YamlParser.class);

    private YamlParser() {
    }

    public static List<Object> parseYamlFile(String baseStr, String fileName, Type type)
            throws IOException {
        Resource resource = new ClassPathResource(fileName);
        log.info("Trying to parse applications from file : {}", resource.getFilename());
        List<Object> objects;
        try (InputStream inputStream = resource.getInputStream()) {
            Yaml yaml = new Yaml();
            Map<String, Object> contents = yaml.load(inputStream);
            JSONArray jsonObject = new JSONArray((List<Object>) contents.get(baseStr));
            Gson gson = new Gson();
            objects = gson.fromJson(jsonObject.toString(), type);
        }
        log.info("Parsed file : {}, returning {} objects", fileName, objects.size());
        return objects;
    }
}
