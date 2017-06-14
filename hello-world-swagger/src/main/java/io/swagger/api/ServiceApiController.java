package io.swagger.api;

import io.swagger.model.Name;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.ArrayList;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-18T17:46:14.126Z")

@Controller
public class ServiceApiController implements ServiceApi {



    public ResponseEntity<List<Name>> serviceGet( @NotNull @ApiParam(value = "Size of array", required = true) @RequestParam(value = "size", required = true) Double size) {
        // do some magic!
		List<Name> listNames = new ArrayList<Name>();
		Name name = new Name();
		name.setName("Hello World!");
		listNames.add(name);
        return new ResponseEntity<List<Name>>(listNames,HttpStatus.OK);
    }

}
