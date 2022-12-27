package com.example.sqlcomroom.date

class UserRepository(private val userDao: UserDao) {

    var selectUsers = userDao.selectUser()

    fun addUser(usuario: Usuario){
        userDao.addUser(usuario)
    }
}