package Festival;

import java.util.Comparator;

public class Fest implements Comparable<Fest> {
    public static class SortByPlace implements Comparator<Fest> {
        @Override
        public int compare(Fest fest1, Fest fest2) {
            int result = fest1.place.compareTo(fest2.place);
            if (result != 0) {
                return result;
            } else {
                result = fest1.title.compareTo(fest2.title);
                if (result != 0) {
                    return result;
                } else {
                    return fest1.yearMonth.compareTo(fest2.yearMonth);
                }
            }
        }
    }

    public static class SortByYearMonth implements Comparator<Fest> {
        @Override
        public int compare(Fest fest1, Fest fest2) {
            int result = fest1.yearMonth.compareTo(fest2.yearMonth);
            if (result != 0) {
                return result;
            } else {
                result = fest1.place.compareTo(fest2.place);
                if (result != 0) {
                    return result;
                } else {
                    return fest1.title.compareTo(fest2.title);
                }
            }
        }
    }

    private String title;
    private String place;
    private YearMonth yearMonth;

    public Fest(String title, String place, YearMonth yearMonth) {
        this.title = title;
        this.place = place;
        this.yearMonth = yearMonth;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public YearMonth getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(YearMonth yearMonth) {
        this.yearMonth = yearMonth;
    }

    @Override
    public String toString() {
        return this.title + ", " +
                this.place + ", " +
                this.yearMonth + ". ";
    }

    @Override
    public boolean equals(Object obj) {
        return this.title.equals(((Fest) obj).title) &&
                this.place.equals(((Fest) obj).place) &&
                this.yearMonth.equals(((Fest) obj).getYearMonth());
    }

    @Override
    public int compareTo(Fest o) {
        int result = this.title.compareTo(o.title);
        if (result != 0) {
            return result;
        } else {
            result = this.place.compareTo(o.place);
            if (result != 0) {
                return result;
            } else {
                return this.yearMonth.compareTo(o.yearMonth);
            }
        }
    }
}