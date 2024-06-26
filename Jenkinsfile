def utils

pipeline {
    agent any
    stages {
        stage('Call Common Function') {
            steps {
                script {
                    utils = load 'utils.groovy'
                    utils.step1()
                    echo "The value of EXAMPLE_VAR is: " + EXAMPLE_VAR
                }
            }
        }
        }
}