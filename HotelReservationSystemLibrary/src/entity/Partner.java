package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Partner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long partnerID;
    
    private String systemName;

    public Partner() {
    }

    public Partner(Long partnerID, String systemName) {
        this.partnerID = partnerID;
        this.systemName = systemName;
    }
    
    public Long getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(Long partnerID) {
        this.partnerID = partnerID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partnerID != null ? partnerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the partnerID fields are not set
        if (!(object instanceof Partner)) {
            return false;
        }
        Partner other = (Partner) object;
        if ((this.partnerID == null && other.partnerID != null) || (this.partnerID != null && !this.partnerID.equals(other.partnerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Partner[ id=" + partnerID + " ]";
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }
    
}
