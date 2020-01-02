#!/usr/bin/env groovy

def call() {
    def groupId    = this.env.GROUP_ID
    def artifactId = this.env.ARTIFACT_ID
    def branch     = this.env.BRANCH_NAME
    def sonar      = getSonarQubeURL()
    def api = "${sonar}/api/qualitygates/project_status?projectKey=${groupId}-${artifactId}-${branch}"
    def url = new URL(api)
    def result = new groovy.json.JsonSlurper().parse(url.newReader())
    result.projectStatus
}
