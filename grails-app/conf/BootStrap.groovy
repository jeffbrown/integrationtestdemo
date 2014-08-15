class BootStrap {

    def init = { servletContext ->
        new demo.User(firstName: 'Jeff').save(failOnError: true)
    }
    def destroy = {
    }
}
