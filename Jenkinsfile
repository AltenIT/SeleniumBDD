#!groovy

node {
    checkout scm
}
pipeline {
   agent any
   stages {
        stage('Build') {
            steps{
                sh '''
                    mvn clean install
                '''
                junit '**/target/surefire-reports/TEST-*.xml'
                archiveArtifacts 'target/*.jar'
            }
        }
    }
}
