def utils

pipeline {
    agent any
    stages {
        stage('Call Common Function') {
            steps {
                script {
                    utils = load 'utils.groovy'
                    utils.step1()
                }
            }
        }
        stage('Call Common Function 2') {
            steps {
                script {
                    utils.step2()
                }
            }
        }
        stage('Call Common Function ') {
            steps {
                script {
                    utils.step3()
                }
            }
        }
    }
    post {
        always {
            echo 'This will always run'
            utils.step4()
        }
    }
}