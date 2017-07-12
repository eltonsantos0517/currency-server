package com.elton.base.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by elton on 12/07/2017.
 */
public enum LanguagesEnum {

    PORTUGUESE("pt-br", "pt-BR"), ENGLISH("en-us", "en-US");

    private String label;
    private String id;

    private static Map<String, LanguagesEnum> idMap = new HashMap<>();

    static {
        for (final LanguagesEnum direction : EnumSet.allOf(LanguagesEnum.class)) {
            idMap.put(direction.getId(), direction);
        }
    }

    LanguagesEnum(String label, String id) {
        this.label = label;
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
    }

    public static LanguagesEnum valueById(final String value) {
        final LanguagesEnum language = idMap.get(value);
        return language != null ? language : ENGLISH;
    }
}
