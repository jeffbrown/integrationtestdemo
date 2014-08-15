package demo

import grails.test.spock.IntegrationSpec

class UserServiceSpec extends IntegrationSpec {

    UserService userService

    void "test find method"() {
        when:
        def user = userService.find(1)

        then:
        'Jeff' == user?.firstName
    }
}
