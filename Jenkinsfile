pipeline {
    agent any
    stages {
        stage('Call Common Function') {
            steps {
                script {
                    def counter = load 'counter.groovy'
                    def result = counter.printCounter('Hello, Jenkins!')
                    
                    // Use the returned parameters
                    echo "Function returned status: ${result.status}"
                    echo "Function returned message: ${result.message}"

                    echo "The value of MY_VAR is: ${env.MY_VAR}"
                }
            }
        }
    }
}