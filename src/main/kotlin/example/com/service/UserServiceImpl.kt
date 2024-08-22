package example.com.service

import CreateUserParams
import User

class UserServiceImpl : UserService{
    override suspend fun registerUser(params: CreateUserParams): User? {
        return null
    }

    override suspend fun findUserByEmail(email: String): User? {
        return null
    }
}