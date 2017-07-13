package com.elton.currencyserver.properties;

import com.elton.currencyserver.enums.LanguagesEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by elton on 12/07/2017.
 */
public class PropertiesLoader {

    private final static String BASE_PATH_OF_PROPERTIES = "";

    private Logger LOG = LoggerFactory.getLogger(PropertiesLoader.class);

    public Properties getProp(final String propertiesName, final LanguagesEnum language) {
        final Properties props = new Properties();
        try {
            props.load(getClass().getClassLoader().getResourceAsStream(getPath(language, propertiesName)));
            return props;
        } catch (IOException e) {
            LOG.warn("",e);
            return new Properties();
        }
    }

    private String getPath(final LanguagesEnum language, final String propertiesName) {
        return BASE_PATH_OF_PROPERTIES + getLanguage(language).getLabel() + "/" + propertiesName;
    }

    private LanguagesEnum getLanguage(final LanguagesEnum language){
        return language != null ? language : LanguagesEnum.ENGLISH;
    }
}
