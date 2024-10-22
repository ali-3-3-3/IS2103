package entity;

import util.enumeration.RoomStatus;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationID;
    
    
    private LocalDate reservationDate;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    @Enumerated(EnumType.STRING)
    private RoomStatus status;

    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "partnerID")
    private Partner partner;

    @ManyToOne
    @JoinColumn(name = "roomTypeID")
    private RoomType roomType;
    
    @ManyToOne
    @JoinColumn(name="allocationID")
    private AllocationProcess allocationProcess;

    @OneToMany(mappedBy = "reservation")
    private List<StayDetails> stayDetails;
    
    

    public Reservation() {
    }

    public Reservation(Long reservationID, LocalDate reservationDate, LocalDate checkInDate, LocalDate checkOutDate, RoomStatus status, Customer customer, Partner partner, RoomType roomType, List<StayDetails> stayDetails) {
        this.reservationID = reservationID;
        this.reservationDate = reservationDate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.status = status;
        this.customer = customer;
        this.partner = partner;
        this.roomType = roomType;
        this.stayDetails = stayDetails;
    }

    public Reservation(Long reservationID, LocalDate reservationDate, LocalDate checkInDate, LocalDate checkOutDate, RoomStatus status, Customer customer, RoomType roomType, List<StayDetails> stayDetails) {
        this.reservationID = reservationID;
        this.reservationDate = reservationDate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.status = status;
        this.customer = customer;
        this.roomType = roomType;
        this.stayDetails = stayDetails;
    }

    public Long getReservationID() {
        return reservationID;
    }

    public void setReservationID(Long reservationID) {
        this.reservationID = reservationID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reservationID != null ? reservationID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the reservationID fields are not set
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.reservationID == null && other.reservationID != null) || (this.reservationID != null && !this.reservationID.equals(other.reservationID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Reservation[ id=" + reservationID + " ]";
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public List<StayDetails> getStayDetails() {
        return stayDetails;
    }

    public void setStayDetails(List<StayDetails> stayDetails) {
        this.stayDetails = stayDetails;
    }
    
}
