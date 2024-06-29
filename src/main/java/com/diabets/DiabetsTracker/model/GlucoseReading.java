package com.diabets.DiabetsTracker.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "GlucoseReading")
public class GlucoseReading {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer glucoseReadingId;

   @Column
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
    private LocalDateTime dateAndTime;

    @Column
    private Integer level;

    @Column(nullable = true, length = 50)
    private String measurementType;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = true)
    private User user;

    @Column(columnDefinition = "TEXT")
    private String comment;

    @Override
    public String toString() {
        return "GlucoseReading{" +
                "glucoseReadingId=" + glucoseReadingId +
//                ", dateAndTime=" + dateAndTime +
                ", level=" + level +
                ", measurementType='" + measurementType + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
