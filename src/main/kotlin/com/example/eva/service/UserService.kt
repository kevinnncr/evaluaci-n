package com.example.eva.service

import com.example.eva.entity.User
import com.example.eva.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class UserService {
    @Autowired
    lateinit var usersRepository: UserRepository

    fun list(): List<User> {
        return usersRepository.findAll()

    }
    fun save(users: User): User {
        return usersRepository.save(users)
    }
    fun update(users: User): User {
        try {
            usersRepository.findById(users.id)
                ?: throw Exception("id exist")
            return usersRepository.save(users)
        }
        catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun updateName(users: User): User {
        try {
            val response = usersRepository.findById(users.id)
                ?: throw Exception("id exist")
            response.apply {
                nameUser= users.nameUser
            }
            return usersRepository.save(users)
        }
        catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }
}