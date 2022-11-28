package it.restaurant.RestaurantTableReservation;

/**
 * The class Table.
 */
public class Table {
    private String name;
    private int seats;
    private int availableSeats = seats;
    private TableStateEnum tableState = TableStateEnum.FREE;

    /**
     * Instantiates a new Table.
     *
     * @param name  the name
     * @param seats the seats
     */
    public Table(String name,int seats) {
        this.name = name;
        this.seats = seats;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets seats.
     *
     * @return the seats
     */
    public int getSeats() {
        return seats;
    }

    /**
     * Gets available seats.
     *
     * @return the available seats
     */
    public int getAvailableSeats() {
        return availableSeats;
    }

    /**
     * Gets table state.
     *
     * @return the table state
     */
    public TableStateEnum getTableState() {
        return tableState;
    }

    /**
     * method to free tables that changes table state to free and resets the available seats.
     */
    public void freeTable(){
        this.tableState = TableStateEnum.FREE;
        this.availableSeats = this.seats;
    }

    /**
     * method to reserve tables that calculates available seats and sets the table state to occupied.
     * @param requiredSeats the required seats
     */
    public void reserveTable(int requiredSeats){
        this.availableSeats = seats - requiredSeats;
        this.tableState = TableStateEnum.OCCUPIED;
    }

    }

