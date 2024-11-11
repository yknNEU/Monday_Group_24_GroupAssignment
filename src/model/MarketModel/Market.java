package model.MarketModel;

import java.util.ArrayList;

import model.ProductManagement.SolutionOffer;

public class Market {

    private ArrayList<SolutionOffer> solutionOffers;
    private ArrayList<MarketChannelAssignment> channels;
    private ArrayList<String> characteristics;
    private ArrayList<Market> submarkets;
    private int size;

    public Market(String characteristic) {
        // this.solutionOffers = new ArrayList<SolutionOffer>();
        // this.channels = new ArrayList<MarketChannelAssignment>();
        this.characteristics = new ArrayList<String>();
        this.characteristics.add(characteristic);
        // this.submarkets = new ArrayList<Market>();
        // this.size = 0;
    }

    public ArrayList<SolutionOffer> getSolutionOffers() {
        return solutionOffers;
    }

    public ArrayList<MarketChannelAssignment> getChannels() {
        return channels;
    }

    public ArrayList<String> getCharacteristics() {
        return characteristics;
    }

    public ArrayList<Market> getSubmarkets() {
        return submarkets;
    }

    public int getSize() {
        return size;
    }

    public void setSolutionOffers(ArrayList<SolutionOffer> solutionOffers) {
        this.solutionOffers = solutionOffers;
    }

    public void setChannels(ArrayList<MarketChannelAssignment> channels) {
        this.channels = channels;
    }

    public void setCharacteristics(ArrayList<String> characteristics) {
        this.characteristics = characteristics;
    }

    public void setSubmarkets(ArrayList<Market> submarkets) {
        this.submarkets = submarkets;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
