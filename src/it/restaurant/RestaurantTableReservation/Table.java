package it.restaurant.RestaurantTableReservation;

public class Table {
    private String name;
    private TableStateEnum tableState;

    public Table(String name, TableStateEnum tableState) {
        this.name = name;

        this.tableState = tableState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TableStateEnum getTableState() {
        return tableState;
    }

    public void setTableState(TableStateEnum tableState) {
        this.tableState = tableState;
    }
}
