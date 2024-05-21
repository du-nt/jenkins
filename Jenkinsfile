pipeline {
    agent any
    stages {
        stage('Environment') {
     agent  { node { label 'master' } }
        steps {
          script {
                def utils = load 'utils.groovy'
               }
            }
         }
        stage('Call Common Function') {
            steps {
                script {
                    def utils = load 'utils.groovy'
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
}