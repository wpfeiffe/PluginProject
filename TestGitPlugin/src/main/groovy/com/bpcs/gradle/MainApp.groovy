/**
 * Entry point for this application
 */
package com.bpcs.gradle


class MainApp
{
    String message = "Hello World"
    static void main(String[] args)
    {
        MainApp mainApp = null;
        CliBuilder cli = new CliBuilder(usage: 'Application -[m]')
        cli.with {
            m longOpt: 'message', args: 1, argName: 'message', 'Show message'
        }

        OptionAccessor options = cli.parse(args)

        if (!options)
        {
            return
        }

        if (options.m)
        {
            mainApp = new MainApp(options.m)
        }
        else
        {
            mainApp = new MainApp()
        }

        mainApp.doPrint()
    }

    MainApp()
    {
    }

    MainApp(String message)
    {
        this.message = message
    }

    void doPrint()
    {
        println message
    }
}

