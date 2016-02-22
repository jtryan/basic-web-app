/**
 * Created by john on 2/21/16.
 * Copyright 2016
 */

package tutorial.mvc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tutorial.entities.BlogEntry;

@Controller
public class BlogEntryController {
    // used with get
    // @RequestMapping("/test")

    @RequestMapping(value="/test", method = RequestMethod.POST)

    public @ResponseBody BlogEntry test(@RequestBody BlogEntry entry)
    {
        return entry;
    }


    // 2nd way to message in json with jackson
    /*
    public @ResponseBody BlogEntry test()
    {
        BlogEntry entry = new BlogEntry();
        entry.setTitle("Test Blog Entry");
        return entry;
    }
    */



    // One way to convert json
    /*
    public ResponseEntity<Object> test()
    {
        BlogEntry entry = new BlogEntry();
        entry.setTitle("Test Blog Entry");
        return new ResponseEntity<Object>(entry, HttpStatus.OK);
    }
    */
}
