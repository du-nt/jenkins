pipeline {
    agent any
    stages {
        stage('Call Common Function') {
            steps {
                script {
                    def counter = load 'counter.groovy'
                    counter.printCounter('Hello, Jenkins!')
                    
                    // Use the returned parameters
                    echo "Function returned status: ${result.status}"
                    echo "Function returned message: ${result.message}"
                }
            }
        }
    }
}