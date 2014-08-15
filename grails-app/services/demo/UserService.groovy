package demo

import grails.transaction.Transactional

@Transactional
class UserService {

    User find(id) {
        User.get id
    }
}
