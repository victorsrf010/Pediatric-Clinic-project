package entidades;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "patient_consultations", schema = "dbo", catalog = "projetoei")
public class PatientConsultationsEntity {
    @Basic
    @Column(name = "patient_name", nullable = false, length = 60)
    private String patientName;
    @Basic
    @Column(name = "consultation_id", nullable = false)
    private int consultationId;
    @Basic
    @Column(name = "consultation_status", nullable = false, length = 50)
    private String consultationStatus;
    @Basic
    @Column(name = "doctor_name", nullable = false, length = 60)
    private String doctorName;
    @Basic
    @Column(name = "consultation_description", nullable = false, length = 100)
    private String consultationDescription;
    @Basic
    @Column(name = "consultation_date", nullable = false)
    private Date consultationDate;
    @Basic
    @Column(name = "consultation_time", nullable = false, length = 10)
    private String consultationTime;
    @Basic
    @Column(name = "payment_status", nullable = false, length = 50)
    private String paymentStatus;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(int consultationId) {
        this.consultationId = consultationId;
    }

    public String getConsultationStatus() {
        return consultationStatus;
    }

    public void setConsultationStatus(String consultationStatus) {
        this.consultationStatus = consultationStatus;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getConsultationDescription() {
        return consultationDescription;
    }

    public void setConsultationDescription(String consultationDescription) {
        this.consultationDescription = consultationDescription;
    }

    public Date getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(Date consultationDate) {
        this.consultationDate = consultationDate;
    }

    public String getConsultationTime() {
        return consultationTime;
    }

    public void setConsultationTime(String consultationTime) {
        this.consultationTime = consultationTime;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientConsultationsEntity that = (PatientConsultationsEntity) o;
        return consultationId == that.consultationId && Objects.equals(patientName, that.patientName) && Objects.equals(consultationStatus, that.consultationStatus) && Objects.equals(doctorName, that.doctorName) && Objects.equals(consultationDescription, that.consultationDescription) && Objects.equals(consultationDate, that.consultationDate) && Objects.equals(consultationTime, that.consultationTime) && Objects.equals(paymentStatus, that.paymentStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientName, consultationId, consultationStatus, doctorName, consultationDescription, consultationDate, consultationTime, paymentStatus);
    }
}
