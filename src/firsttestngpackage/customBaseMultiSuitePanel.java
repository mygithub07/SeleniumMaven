package firsttestngpackage;

import org.testng.ISuite;
import org.testng.reporters.XMLStringBuffer;
import org.testng.reporters.jq.*;

abstract public class customBaseMultiSuitePanel extends BasePanel implements INavigatorPanel {
	abstract String getHeader(ISuite suite);
	  abstract String getContent(ISuite suite, XMLStringBuffer xsb);

	  public customBaseMultiSuitePanel(Model model) {
	    super(model);
	  }

	  @Override
	  public void generate(XMLStringBuffer xsb) {
	    for (ISuite s : getSuites()) {
	      xsb.push(D, C, "panel", "panel-name", getPanelName(s));
	      xsb.push(D, C, "main-panel-header rounded-window-top");
	      xsb.addOptional(S, getHeader(s), C, "header-content");
	      xsb.pop(D);

	      xsb.push(D, C, "main-panel-content rounded-window-bottom");
	      xsb.addString(getContent(s, xsb));
	      xsb.pop(D);

	      xsb.pop(D);
	    }
	  }

	  @Override
	  public String getClassName() {
	    return null;
	  }

	  @Override
	  public String getPanelName(ISuite suite) {
	    return getPrefix() + suiteToTag(suite);
	  }
}
