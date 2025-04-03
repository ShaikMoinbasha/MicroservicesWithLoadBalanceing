package in.basha.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import in.basha.dto.DepartmentsDTO;

@FeignClient(name = "DEPARTMENTS")
public interface DepartmentClient {
	
	@GetMapping("/getMsg")
    public String getName();
    
	@GetMapping("/getDepartmentByEmployeeId/{id}") 
    DepartmentsDTO getDepartmentByEmployeeId(@PathVariable("id") Long id);
}
