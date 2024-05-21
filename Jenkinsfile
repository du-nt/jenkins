pipeline {
    environment {
        def utils = load 'utils.groovy'
    }
    agent any
    stages {
        stage('Call Common Function') {
            steps {
                script {
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
    }
    post {
            utils.step3()
        }
}