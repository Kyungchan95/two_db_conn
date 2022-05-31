package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.service.DBService;
 
@RestController
public class DBController {
    @Autowired
    DBService dbService;
     
    @RequestMapping("/")
    public @ResponseBody String root_test() throws Exception{  
        //return "Hello World";
        return DBService.getDB1Dual();
    }
 
    @RequestMapping("/DB1")
    public @ResponseBody String DB1() throws Exception{
        return DBService.getDB1Dual();
    }
     
    @RequestMapping("/DB2")
    public @ResponseBody String DB2() throws Exception{
        return DBService.getDB2Dual();
    }
}
