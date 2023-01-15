package nextstep.step3.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import nextstep.step3.entity.Reservation;
import nextstep.step3.entity.Theme;

import java.time.LocalDate;
import java.time.LocalTime;

@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDetail {
    private Long id;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private LocalDate date;
    @JsonFormat(pattern = "HH:mm", timezone = "Asia/Seoul")
    private LocalTime time;
    private String name;

    private String themeName;
    private String themeDesc;
    private Integer themePrice;

    public ReservationDetail(Reservation reservation, Theme theme) {
        this.id = reservation.getId();
        this.date = reservation.getDate();
        this.time = reservation.getTime();
        this.name = reservation.getName();
        this.themeName = theme.getName();
        this.themeDesc = theme.getDesc();
        this.themePrice = theme.getPrice();
    }
}
