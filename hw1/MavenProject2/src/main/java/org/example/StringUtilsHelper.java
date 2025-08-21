package org.example;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsHelper {


    public boolean isBlank(String input) {
        return StringUtils.isBlank(input);
    }


    public String capitalize(String input) {
        return StringUtils.capitalize(input);
    }
}
