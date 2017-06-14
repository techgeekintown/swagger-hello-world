package io.swagger.api;

import io.swagger.model.Name;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-18T17:46:14.126Z")

@Api(value = "service", description = "the service API")
public interface ServiceApi {

    @ApiOperation(value = "", notes = "get the first hello world string ", response = Name.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Name.class) })
    @RequestMapping(value = "/service",
        method = RequestMethod.GET)
    ResponseEntity<List<Name>> serviceGet( @NotNull @ApiParam(value = "Size of array", required = true) @RequestParam(value = "size", required = true) Double size);

}
