#!groovy

node {
    checkout scm
    def mvnHome
}
pipeline {
   agent any
   stages {
        stage('Build') {
            // Run the maven build
            step {
                sh '''
                    mvn clean install
                '''
            }
        }
        stage('Results') {
            junit '**/target/surefire-reports/TEST-*.xml'
            archiveArtifacts 'target/*.jar'
        }
    }
}
