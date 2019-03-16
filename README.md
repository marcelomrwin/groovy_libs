
### Consumindo funções auxiliares no Jenkins

#### Estas funções são uteis para uso dentro pipelines

Adicionar no topo do arquivo do pipeline o uso da biblioteca

````
#!groovy

@Library('support-functions') _

node('master') {

  stage('Checkout') {
    git '<REPOSITORY>.git'
  }

  stage('VARS') {
    def groupId    = getGroupIdFromPom()
    def artifactId = getArtifactIdFromPom()
    def version    = getVersionFromPom()

    echo "Artifact ID: ${artifactId} - Group ID: ${groupId} - Version: ${version}"
  }
}
````
