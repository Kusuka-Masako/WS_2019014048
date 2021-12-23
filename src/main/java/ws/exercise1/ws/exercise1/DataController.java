/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws.exercise1.ws.exercise1;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author PAVILION GAMING
 */
@Controller
public class DataController {

    @CrossOrigin
    @RequestMapping(value = "/datamhsxml", produces = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public List<Datamahasiswa> getDataMahasiswaXML() {
        List<Datamahasiswa> datamahasiswa = new ArrayList<>();

        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();

        try {
            datamahasiswa = controller.findDatamahasiswaEntities();
        } catch (Exception e) {
        }
        return datamahasiswa;

    }

    @CrossOrigin
    @RequestMapping(value = "/datamhsjson", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody

    public List<Datamahasiswa> getDataMahasiswaJSON() {

        List<Datamahasiswa> datamahasiswa = new ArrayList<>();

        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();

        try {
            datamahasiswa = controller.findDatamahasiswaEntities();
        } catch (Exception e) {
        }

        return datamahasiswa;
    }
}
