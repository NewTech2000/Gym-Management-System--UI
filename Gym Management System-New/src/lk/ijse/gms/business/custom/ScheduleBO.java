package lk.ijse.gms.business.custom;


import lk.ijse.gms.dto.ScheduleDTO;

import java.util.ArrayList;

public interface ScheduleBO {
    boolean addSchedule(ScheduleBO scheduleBO) throws Exception;

    boolean updateSchedule(ScheduleBO scheduleBO) throws Exception;

    boolean deleteSchedule(String id) throws Exception;

   ScheduleDTO searchSchedule(String id) throws Exception;

    ArrayList<ScheduleDTO> getAll() throws Exception;
}

