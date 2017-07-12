package properties;

import com.elton.base.enums.LanguagesEnum;

import java.util.Properties;

/**
 * Created by elton on 12/07/2017.
 */
public class PropertiesUtil {

    private final static String PROPERTIES_ARCHIVE = "messages.properties";

    private PropertiesUtil(){}

    public static String getMessage(String code){
        return getMessage(code, null);
    }

    public static String getMessage(String code, LanguagesEnum language){
        PropertiesLoader propsLoader = new PropertiesLoader();
        Properties props = propsLoader.getProp(PROPERTIES_ARCHIVE, language);
        return props.getProperty(code);
    }
}
