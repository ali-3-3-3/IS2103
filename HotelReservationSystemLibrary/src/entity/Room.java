package entity;

import util.enumeration.RoomStatus;
import util.enumeration.RoomTypeEnum;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Room implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomID;
    
    private String roomNumber;
    private int floorNumber;

    @Enumerated(EnumType.STRING)
    private RoomStatus status;

    @ManyToOne
    @JoinColumn(name = "roomTypeID")
    private RoomTypeEnum roomType;

    public Room() {
        
    }

    public Room(Long roomID, String roomNumber, int floorNumber, RoomStatus status, RoomTypeEnum roomType) {
        this.roomID = roomID;
        this.roomNumber = roomNumber;
        this.floorNumber = floorNumber;
        this.status = status;
        this.roomType = roomType;
    }
    
    public Long getRoomID() {
        return roomID;
    }

    public void setRoomID(Long roomID) {
        this.roomID = roomID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomID != null ? roomID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the roomID fields are not set
        if (!(object instanceof Room)) {
            return false;
        }
        Room other = (Room) object;
        if ((this.roomID == null && other.roomID != null) || (this.roomID != null && !this.roomID.equals(other.roomID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Room[ id=" + roomID + " ]";
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }

    public RoomTypeEnum getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomTypeEnum roomType) {
        this.roomType = roomType;
    }
    
}
