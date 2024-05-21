pipeline {
    agent any
    stages {
        stage('Call Common Function') {
            steps {
                script {
                    load 'counter.groovy'
                    def result = counter('Hello, Jenkins!')
                    
                    // Use the returned parameters
                    echo "Function returned status: ${result.status}"
                    echo "Function returned message: ${result.message}"

                    echo "The value of EXAMPLE_VAR is: ${env.EXAMPLE_VAR}"
                }
            }
        }
    }
}