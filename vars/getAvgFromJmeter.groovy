#!/usr/bin/env groovy

def call(){
    def result = sh (
        script: 'grep "summary =" /opt/jmeter/bin/jmeter.log | awk \'{ print \$11}\' | tr -d \'/s\' | cut -d. -f1',
        returnStdout: true
    ).trim()
    echo "media = ${result}"
    return result.toInteger();
}
