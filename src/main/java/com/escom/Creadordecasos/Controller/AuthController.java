package com.escom.Creadordecasos.Controller;

import com.escom.Creadordecasos.Service.Auth.*;
import com.escom.Creadordecasos.Service.Auth.Bodies.AuthResponse;
import com.escom.Creadordecasos.Service.Auth.Bodies.LoginRequest;
import com.escom.Creadordecasos.Service.Auth.Bodies.RegisterAdminRequest;
import com.escom.Creadordecasos.Service.Auth.Bodies.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador REST para los administradores
 */
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
//@SecurityRequirement(name = "Bearer Authentication")
public class AuthController {

    /**
     * Servicio de usuario
     */
    private final AuthService authService;

    @PostMapping("/register-admin")
    public ResponseEntity<AuthResponse> registerAdmin(@RequestBody RegisterAdminRequest registerAdminRequest) {
        return authService.registerAdmin(registerAdminRequest);
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest registerRequest) {
        return authService.register(registerRequest);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest);
    }

}
