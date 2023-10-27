package com.yummy.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 通用枚举类
 */
@Getter
@AllArgsConstructor
public enum ExampleEnum {
    ENUM_EXAMPLE1("ENUM_EXAMPLE1", 1),
    ENUM_EXAMPLE2("ENUM_EXAMPLE2", 2),
    ENUM_EXAMPLE3("ENUM_EXAMPLE3", 3),
    ENUM_EXAMPLE4("ENUM_EXAMPLE4", 4),
    ENUM_EXAMPLE5("ENUM_EXAMPLE5", 5),
    ENUM_EXAMPLE6("ENUM_EXAMPLE6", 6);

    private final String Desc;
    private final Integer statusCode;

    public static String getStatusDescByCode(Integer statusCode) {
        for (ExampleEnum exampleEnum : ExampleEnum.values()) {
            if (exampleEnum.getStatusCode().equals(statusCode)) {
                return exampleEnum.Desc;
            }
        }
        return null; // 或者抛出异常来表示找不到对应的枚举值
    }
}
