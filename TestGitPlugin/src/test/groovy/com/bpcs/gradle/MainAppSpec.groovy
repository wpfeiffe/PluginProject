package com.bpcs.gradle


import spock.lang.Specification

/**
 * MainApp tests
 */
class MainAppSpec extends Specification
{
    def "test main 1 arg"() {
        given:
        ByteArrayOutputStream outContent = new ByteArrayOutputStream()
        System.setOut(new PrintStream(outContent));
        String testValue = "Hello Main App"
        String[] args = ["-m", testValue]

        when:
        MainApp.main(args)

        then:
        outContent.toString() == testValue + System.getProperty("line.separator")
        System.setOut(null)

    }

    def "test main 0 arg"() {
        given:
        ByteArrayOutputStream outContent = new ByteArrayOutputStream()
        System.setOut(new PrintStream(outContent));
        String testValue = "Hello World"
        String[] args = []

        when:
        MainApp.main(args)

        then:
        outContent.toString() == testValue + System.getProperty("line.separator")
        System.setOut(null)

    }

}
