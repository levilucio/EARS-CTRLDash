package org.iets3.core.plugin.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.GeneratedActionGroup;

public class runManuallyModel_ActionGroup extends GeneratedActionGroup {
  public static final String ID = "org.iets3.core.plugin.plugin.runManuallyModel_ActionGroup";
  public runManuallyModel_ActionGroup() {
    super("runManuallyModel", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    runManuallyModel_ActionGroup.this.addSeparator();
    runManuallyModel_ActionGroup.this.addAction("org.iets3.core.plugin.plugin.runAllManuallyOnModel_Action");
    runManuallyModel_ActionGroup.this.addSeparator();
  }
}