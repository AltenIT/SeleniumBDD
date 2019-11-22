#!groovy

node {
    checkout scm
}
pipeline {
   agent any
   stages {
        stage('Build') {
            sh '''
                mvn clean install
            '''
        }
        stage('Results') {
            junit '**/target/surefire-reports/TEST-*.xml'
            archiveArtifacts 'target/*.jar'
        }
    }
}
