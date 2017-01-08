package io.woolford.database.entity;

public class YearRecord {

    int year;
    boolean complete;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        return "YearRecord{" +
                "year=" + year +
                ", complete=" + complete +
                '}';
    }

}
