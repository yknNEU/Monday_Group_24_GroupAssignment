package model.MarketModel;

public class MarketChannelAssignment {
    
    private Market market;
    private Channel channel;
    
    public MarketChannelAssignment(Market market, Channel channel) {
        this.market = market;
        this.channel = channel;
    }
    
    public Market getMarket() {
        return market;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}
