package nextstep.service;

import nextstep.dto.ReservationDetail;
import nextstep.dto.ReservationDto;

public interface ThemeReservationService {

    public Long reserve(ReservationDto reservationDto);

    public void cancelById(Long id);

    ReservationDetail findById(Long id) throws SQLException;
}
