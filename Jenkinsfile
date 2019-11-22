#!groovy

node {
    checkout scm
    def mvnHome
}
pipeline {
   agent any
   stages {
        stage('Preparation') { // for display purposes
            mvnHome = tool 'M3'
        }
        stage('Build') {
            // Run the maven build
            withEnv(["MVN_HOME=$mvnHome"]) {
            sh '"$MVN_HOME/bin/mvn" -Dmaven.test.failure.ignore clean install'
            }
        }
        stage('Results') {
            junit '**/target/surefire-reports/TEST-*.xml'
            archiveArtifacts 'target/*.jar'
        }
    }
}
