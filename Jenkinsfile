pipeline {
    agent any
    stages {
        stage('Call Common Function') {
            steps {
                script {
                    // Load the Groovy script
                    def commonFunction = load 'commonFunction.groovy'
                    
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