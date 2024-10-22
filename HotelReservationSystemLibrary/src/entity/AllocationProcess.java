/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author aliya
 */
@Entity
public class AllocationProcess implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long allocationID;
    
    private LocalDate allocationDate;
    private String status;

    @ManyToOne
    @JoinColumn(name = "employeeID")
    private Employee employee;

    public AllocationProcess() {
    }

    public AllocationProcess(Long allocationID, String status, Employee employee) {
        this.allocationID = allocationID;
        this.status = status;
        this.employee = employee;
    }

    public AllocationProcess(Long allocationID, LocalDate allocationDate, String status, Employee employee) {
        this.allocationID = allocationID;
        this.allocationDate = allocationDate;
        this.status = status;
        this.employee = employee;
    }

    public Long getAllocationID() {
        return allocationID;
    }

    public void setAllocationID(Long allocationID) {
        this.allocationID = allocationID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (allocationID != null ? allocationID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the allocationID fields are not set
        if (!(object instanceof AllocationProcess)) {
            return false;
        }
        AllocationProcess other = (AllocationProcess) object;
        if ((this.allocationID == null && other.allocationID != null) || (this.allocationID != null && !this.allocationID.equals(other.allocationID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AllocationProcess[ id=" + allocationID + " ]";
    }

    public LocalDate getAllocationDate() {
        return allocationDate;
    }

    public void setAllocationDate(LocalDate allocationDate) {
        this.allocationDate = allocationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
}
