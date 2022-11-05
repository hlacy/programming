public class City {
    private String name; // name of a city
    private String region; // name of a region
    private String district; // name of a federal district
    private long population; // numbers of residents
    private String foundation; // date of a foundation

    public City(String name, String region, String district, long population, String foundation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "City{name='" + name +
                "', region='" + region +
                "', district='" + district +
                "', population=" + population +
                ", foundation='" + foundation +
                "'}\n";
    }

}
