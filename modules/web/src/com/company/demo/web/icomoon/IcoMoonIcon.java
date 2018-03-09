package com.company.demo.web.icomoon;

import com.haulmont.cuba.gui.icons.Icons;

public enum IcoMoonIcon implements Icons.Icon {
    PENCIL("ico-moon:PENCIL"),
    BLOG("ico-moon:BLOG");

    protected String source;

    IcoMoonIcon(String source) {
        this.source = source;
    }

    @Override
    public String source() {
        return source;
    }
}