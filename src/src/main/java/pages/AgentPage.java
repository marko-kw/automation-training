package pages;

public class AgentPage {

    private String agentSiteUrl;

    private String logInButtonLocator;

    public void setAgentSiteUrl(String agentSiteUrl) {
        this.agentSiteUrl = agentSiteUrl;
    }

    public String getAgentSiteUrl() {
        return this.agentSiteUrl;
    }

    public void setLogInButtonLocator(String logInButtonLocator) {
        this.logInButtonLocator = logInButtonLocator;
    }

    public String getLogInButtonLocator() {
        return this.logInButtonLocator;
    }
}
