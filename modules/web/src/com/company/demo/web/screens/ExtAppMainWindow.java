package com.company.demo.web.screens;

import com.company.demo.web.icomoon.IcoMoonIcon;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.icons.Icons;
import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;

import javax.inject.Inject;
import java.util.Map;

public class ExtAppMainWindow extends AppMainWindow {
    @Inject
    private LookupField demoField;
    @Inject
    private Icons icons;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        demoField.setOptionIconProvider(item ->
                icons.get(IcoMoonIcon.BLOG)
        );
    }
}