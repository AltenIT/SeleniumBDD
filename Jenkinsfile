#!groovy

node {
    checkout scm
}
pipeline {
   agent any
    stages {
        stage('Test') {
            steps {
                         
                // Call test suite from using SoapUI testrunner.sh (modified version for JAVA 8)
                sh '''
                    echo ">> Hello World"
                
                '''
            }
        }
    }
}
