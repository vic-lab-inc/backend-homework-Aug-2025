package org.example;

import org.apache.commons.lang3.StringUtils;

public class StringUtilDemo {
    public static boolean isEmptyOrNull(String str) {
        return StringUtils.isEmpty(str);
        // 或者用 StringUtils.isBlank(str)，会把空格也算为空
    }
}
