package freecrm_page_library.shared;

import base.BasePage;
import freecrm_page_library.shared.ui.SystemBar;

public class SharedStepsUI extends BasePage {

    public SystemBar systemBar;

    public SharedStepsUI() {
        this.systemBar = new SystemBar();
    }
}
