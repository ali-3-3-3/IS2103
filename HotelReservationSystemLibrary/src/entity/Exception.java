package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Exception implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exceptionID;
    
    private String errorDescription;
    private String resolutionStatus;

    @ManyToOne
    @JoinColumn(name = "allocationID")
    private AllocationProcess allocationProcess;

    @ManyToOne
    @JoinColumn(name = "employeeID")
    private Employee employee;

    public Exception() {
    }

    public Exception(Long exceptionID, String errorDescription, String resolutionStatus, AllocationProcess allocationProcess, Employee employee) {
        this.exceptionID = exceptionID;
        this.errorDescription = errorDescription;
        this.resolutionStatus = resolutionStatus;
        this.allocationProcess = allocationProcess;
        this.employee = employee;
    }

    public Long getExceptionID() {
        return exceptionID;
    }

    public void setExceptionID(Long exceptionID) {
        this.exceptionID = exceptionID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exceptionID != null ? exceptionID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the exceptionID fields are not set
        if (!(object instanceof Exception)) {
            return false;
        }
        Exception other = (Exception) object;
        if ((this.exceptionID == null && other.exceptionID != null) || (this.exceptionID != null && !this.exceptionID.equals(other.exceptionID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Exception[ id=" + exceptionID + " ]";
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public String getResolutionStatus() {
        return resolutionStatus;
    }

    public void setResolutionStatus(String resolutionStatus) {
        this.resolutionStatus = resolutionStatus;
    }

    public AllocationProcess getAllocationProcess() {
        return allocationProcess;
    }

    public void setAllocationProcess(AllocationProcess allocationProcess) {
        this.allocationProcess = allocationProcess;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
}
