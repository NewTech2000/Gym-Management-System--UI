package lk.ijse.gms.business.custom;

import lk.ijse.gms.dto.AttendanceDTO;

import java.util.ArrayList;

public interface AttendanceBO {
    boolean addAttendance(AttendanceDTO attendanceDTO) throws Exception;

    boolean updateAttendance(AttendanceDTO attendanceDTO) throws Exception;

    boolean deleteAttendance(String id) throws Exception;

    AttendanceDTO  searchAttendance(String id) throws Exception;

    ArrayList<AttendanceDTO> getAll() throws Exception;

}
