package entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import util.enumeration.RateType;

@Entity
public class RoomRate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rateID;
    
    @Enumerated(EnumType.STRING)
    private RateType rateType;

    private LocalDate startDate;
    private LocalDate endDate;
    private double pricePerNight;

    @ManyToOne
    @JoinColumn(name = "roomTypeID")
    private RoomType roomType;

    public RoomRate() {
    }

    public RoomRate(Long rateID, RateType rateType, LocalDate startDate, LocalDate endDate, double pricePerNight, RoomType roomType) {
        this.rateID = rateID;
        this.rateType = rateType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerNight = pricePerNight;
        this.roomType = roomType;
    }
    
    public Long getRateID() {
        return rateID;
    }

    public void setRateID(Long rateID) {
        this.rateID = rateID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rateID != null ? rateID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the rateID fields are not set
        if (!(object instanceof RoomRate)) {
            return false;
        }
        RoomRate other = (RoomRate) object;
        if ((this.rateID == null && other.rateID != null) || (this.rateID != null && !this.rateID.equals(other.rateID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.RoomRate[ id=" + rateID + " ]";
    }
    
}
