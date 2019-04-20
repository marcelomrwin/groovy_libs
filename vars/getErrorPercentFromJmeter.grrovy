#!/usr/bin/env groovy

def call(){
  def result = sh (
      script: 'grep "summary =" /opt/jmeter/bin/jmeter.log | awk \'{print \$20}\' | tr -d \'/s\' | grep -o \'[0-9.,]\\+\' | cut -d. -f1',
      returnStdout: true
  ).trim()
  echo "errors = ${result}"
  return result.toInteger();
}
