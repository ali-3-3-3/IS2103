package entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StayDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stayID;
    
    private LocalDate stayDate;
    private double pricePerDay;

    @ManyToOne
    @JoinColumn(name = "reservationID")
    private Reservation reservation;

    @ManyToOne
    @JoinColumn(name = "rateID")
    private RoomRate roomRate;

    public StayDetails() {
    }

    public StayDetails(Long stayID, LocalDate stayDate, double pricePerDay, Reservation reservation, RoomRate roomRate) {
        this.stayID = stayID;
        this.stayDate = stayDate;
        this.pricePerDay = pricePerDay;
        this.reservation = reservation;
        this.roomRate = roomRate;
    }
    
    public Long getStayID() {
        return stayID;
    }

    public void setStayID(Long stayID) {
        this.stayID = stayID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stayID != null ? stayID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the stayID fields are not set
        if (!(object instanceof StayDetails)) {
            return false;
        }
        StayDetails other = (StayDetails) object;
        if ((this.stayID == null && other.stayID != null) || (this.stayID != null && !this.stayID.equals(other.stayID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.StayDetails[ id=" + stayID + " ]";
    }

    public LocalDate getStayDate() {
        return stayDate;
    }

    public void setStayDate(LocalDate stayDate) {
        this.stayDate = stayDate;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public RoomRate getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(RoomRate roomRate) {
        this.roomRate = roomRate;
    }
    
}
