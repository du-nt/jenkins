pipeline {
    agent any
    stages {
        stage('Call Common Function') {
            steps {
                script {
                    def counter = load 'counter.groovy'
                    counter.printCounter('Hello, Jenkins!')
                    
                    // Call the function and get the result
                    def result = commonFunction.call('Hello, Jenkins!')
                    
                    // Use the returned parameters
                    echo "Function returned status: ${result.status}"
                    echo "Function returned message: ${result.message}"
                }
            }
        }
    }
}