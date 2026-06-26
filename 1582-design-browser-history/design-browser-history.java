class BrowserHistory {
    private class Node
    {
        String url;
        Node prev;
        Node next;

        Node(String url)
        {
            this.url = url;
        }

    }
    private Node browser;
    private Node home;
    public BrowserHistory(String homepage) {
        home = new Node(homepage);
        browser = new Node(homepage);
    }
    
    public void visit(String url) {
        Node nextPage = new Node(url);
        browser.next = nextPage;   
        nextPage.prev = browser;   
        browser = nextPage;        
        browser.next = null;
        
    }
    
    public String back(int steps) {
        while(steps>0 && browser.prev!=null)
        {
            browser=browser.prev;
            steps--;
        }
        if(steps!=0)
        {
            return home.url;
        }
        return browser.url;
    }
    
    public String forward(int steps) {
        while(steps>0 && browser.next!=null)
        {
            browser=browser.next;
            steps--;
        }
        return browser.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */