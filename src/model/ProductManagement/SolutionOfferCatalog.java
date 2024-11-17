package model.ProductManagement;

import java.util.ArrayList;

import model.Personnel.Person;

public class SolutionOfferCatalog {

    private ArrayList<SolutionOffer> solutionOffers;

    public SolutionOfferCatalog() {
        this.solutionOffers = new ArrayList<SolutionOffer>();
    }
    
    public ArrayList<SolutionOffer> getSolutionOffers() {
        return solutionOffers;
    }

    public SolutionOffer newSolutionOffer(Person salesPerson) {
        SolutionOffer so = new SolutionOffer(null);
        so.setSalesPerson(salesPerson);
        solutionOffers.add(so);
        return so;
    }

    public SolutionOffer findSolutionOffer(String personId) {
        for (SolutionOffer so : solutionOffers) {
            if (so.getSalesPerson().getPersonId().equals(personId)) {
                return so;
            }
        }
        return null;
    }

    public void setSolutionOffers(ArrayList<SolutionOffer> solutionOffers) {
        this.solutionOffers = solutionOffers;
    }
}
