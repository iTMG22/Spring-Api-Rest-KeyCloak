package com.kitchenmate.auth.KitchenMateAuth.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello-1")
    @PreAuthorize("hasRole('admin_client_role')")
    public String helloAdmin() {
        return "Hello Admin (Spring Boot and KeyCloak)";
    }

    @GetMapping("/hello-2")
    @PreAuthorize("hasRole('usuario-Client-role') or hasRole('admin_client_role')")
    public String helloUser() {
        return "Hello User (Spring Boot and KeyCloak)";
    }

    @GetMapping("/hello-3")
    @PreAuthorize("hasRole('cliente-client-role') or hasRole('admin_client_role')")
    public String helloClient() {
        return "Hello Cliente (Spring Boot and KeyCloak)";
    }

    @GetMapping("/hello-4")
    @PreAuthorize("hasRole('moderador-client-role') or hasRole('admin_client_role')")
    public String helloMod() {
        return "Hello Moderador (Spring Boot and KeyCloak)";
    }

    @GetMapping("/hello-5")
    @PreAuthorize("hasRole('publicista-client-role') or hasRole('admin_client_role')")
    public String helloPubli() {
        return "Hello Publi (Spring Boot and KeyCloak)";
    }
}
