package it.restaurant.RestaurantTableReservation;

public class Table {
    private String name;
    private int seats;
    private int availableSeats = seats;
    private TableStateEnum tableState = TableStateEnum.FREE;

    public Table(String name,int seats) {
        this.name = name;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeats() {
        return seats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public TableStateEnum getTableState() {
        return tableState;
    }

    public void freeTable(){
        this.tableState = TableStateEnum.FREE;
        this.availableSeats = this.seats;
    }
    public void reserveTable(int requiredSeats){
        this.availableSeats = seats - requiredSeats;
        this.tableState = TableStateEnum.OCCUPIED;
    }

    }

