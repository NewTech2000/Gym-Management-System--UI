package lk.ijse.gms.business.custom;

import lk.ijse.gms.dto.BodyMeasurementDTO;


import java.util.ArrayList;

public interface BodyMeasurementBO{
        boolean addBodyMeasurement(BodyMeasurementDTO bodyMeasurementDTO) throws Exception;

        boolean updateBodyMeasurement(BodyMeasurementDTO bodyMeasurementDTO) throws Exception;

        boolean deleteBodyMeasurement(String id) throws Exception;

        BodyMeasurementDTO  searchBodyMeasurement(String id) throws Exception;

        ArrayList<BodyMeasurementDTO> getAll() throws Exception;

}
