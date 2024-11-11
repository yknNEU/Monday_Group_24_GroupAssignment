package model.ProductManagement;

import java.util.ArrayList;

public class SolutionOfferCatalog {

    private ArrayList<SolutionOffer> solutionOffers;

    public SolutionOfferCatalog() {
        this.solutionOffers = new ArrayList<SolutionOffer>();
    }
    
    public ArrayList<SolutionOffer> getSolutionOffers() {
        return solutionOffers;
    }

    public void setSolutionOffers(ArrayList<SolutionOffer> solutionOffers) {
        this.solutionOffers = solutionOffers;
    }
}
