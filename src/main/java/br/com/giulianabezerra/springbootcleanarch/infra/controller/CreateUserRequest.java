package br.com.giulianabezerra.springbootcleanarch.infra.controller;

public record CreateUserRequest(String username, String password, String email) {
}
