package org.max.HW2;

import java.util.List;

public class VisitorsGroup implements ITableCount{

    List<ITableCount> visitorsList;
    private double sum;

    public VisitorsGroup(List<ITableCount> visitorsList){
        this.visitorsList = visitorsList;
    }

    @Override
    public Double getTableBill() {
        for (ITableCount visitor: visitorsList
             ) {
            sum += visitor.getTableBill();
        }
        return sum;
    }

    public void addVisitors(ITableCount visitors) {
        visitorsList.add(visitors);
    }

    @Override
    public String toString() {
        return "VisitorsGroup{" +
                "visitorsList=" + visitorsList +
                '}';
    }
}
