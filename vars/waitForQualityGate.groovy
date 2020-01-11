#!/usr/bin/env groovy

def call() {
    def groupId    = getGroupIdFromPom()
    def artifactId = getArtifactIdFromPom()
    def sonar      = getSonarQubeURL()
    def api = "${sonar}/api/qualitygates/project_status?projectKey=${groupId}:${artifactId}"
    def url = new URL(api)
    def result = new groovy.json.JsonSlurper().parse(url.newReader())
    result.projectStatus
}
