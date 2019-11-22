#!groovy

node {
    checkout scm
}
pipeline {
   agent any
   stages {
        stage('Build') {
        steps{
        step{
            sh '''
                mvn clean install
            '''
        }
        step {
            junit '**/target/surefire-reports/TEST-*.xml'
            archiveArtifacts 'target/*.jar'
        }
        }
        }

        
    }
}
