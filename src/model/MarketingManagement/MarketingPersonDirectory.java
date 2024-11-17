package model.MarketingManagement;

import java.util.ArrayList;

import model.Business.Business;
import model.Personnel.Person;

public class MarketingPersonDirectory {

    private Business business;
    private ArrayList<MarketingPersonProfile> marketingPersonList;

    public MarketingPersonDirectory(Business business) {
        this.business = business;
        this.marketingPersonList = new ArrayList<MarketingPersonProfile>();
    }

    public Business getBusiness() {
        return business;
    }

    public ArrayList<MarketingPersonProfile> getMarketingPersonList() {
        return marketingPersonList;
    }

    public MarketingPersonProfile newMarketingPersonProfile(Person person) {
        MarketingPersonProfile sp = new MarketingPersonProfile(person);
        person.setProfile(sp);
        marketingPersonList.add(sp);
        return sp;
    }

    public MarketingPersonProfile findMarketingPerson(String id) {
        for (MarketingPersonProfile sp : marketingPersonList) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }

        return null;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public void setMarketingPersonList(ArrayList<MarketingPersonProfile> marketingPersonList) {
        this.marketingPersonList = marketingPersonList;
    }
}
