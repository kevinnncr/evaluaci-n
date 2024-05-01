package com.example.eva.controller

import com.example.eva.entity.User
import com.example.eva.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController {
    @Autowired
    lateinit var userService: UserService

    @GetMapping
    fun list(): List<User> {
        return userService.list()
    }
    @PostMapping
    fun save(@RequestBody users: User): User{

        return  userService.save(users)

    }
    @PutMapping
    fun update (@RequestBody users: User): ResponseEntity<User> {
        return ResponseEntity (userService.update(users), HttpStatus.OK)
    }
    @PatchMapping
    fun updateName (@RequestBody users: User): ResponseEntity<User> {
        return ResponseEntity (userService.updateName(users), HttpStatus.OK)
    }
}