#!/usr/bin/env groovy

def call(){
  def result = sh (
      script: 'grep "summary =" /opt/jmeter/bin/jmeter.log | awk \'{ print \$13}\' | tr -d \'/s\' | cut -d. -f1',
      returnStdout: true
  ).trim()
  echo "responseTime = ${result}"
  return result.toInteger();
}
