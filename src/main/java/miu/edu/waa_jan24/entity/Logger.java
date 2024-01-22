package miu.edu.waa_jan24.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Logger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transactionId;

    private LocalDate transDate;
    private LocalTime transTime;
    private String principle;
    private String operation;

    public Logger(LocalDate transDate, LocalTime transTime, String principle, String operation) {
        this.transDate = transDate;
        this.transTime = transTime;
        this.principle = principle;
        this.operation = operation;
    }
}
