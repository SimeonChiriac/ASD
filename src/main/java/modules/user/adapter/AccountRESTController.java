package modules.user.adapter;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import modules.user.application.AccountApplicationService;

@RestController
@RequestMapping("/account")
public class AccountRESTController {

    private AccountApplicationService accountApplicationService;

    public AccountRESTController(AccountApplicationService accountApplicationService){
        this.accountApplicationService = accountApplicationService;
    }

    @GetMapping("/test")
    public ResponseEntity test(){
        return ResponseEntity.ok("gelukt");
    }

    @PostMapping("/createAccount/{username}/{firstname}/{lastname}/{prefix}/{email}/{password}")
    public void createAccount(@PathVariable String username, @PathVariable String firstname, @PathVariable String lastname,
                              @PathVariable String prefix, @PathVariable String email, @PathVariable String password){
        accountApplicationService.createAccount( username, firstname,  lastname,  prefix,  email,  password);

    }





}