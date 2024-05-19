def printCounter(String param) {
    echo "Common function called with parameter: ${param}"

     environment {
        EXAMPLE_VAR = 'Hello, World!'
    }

    stage('GCPコマンド認証') {
      steps{
        script{
          withCredentials([string(credentialsId: 'text', variable: 'GC_KEY')]) {
            sh 'echo $GC_KEY'
	        }
        
        echo "The value of EXAMPLE_VAR is: ${env.EXAMPLE_VAR}"
        }
      }
    }

    // Return some parameters
    return [status: 'SUCCESS', message: 'Function executed successfully']
}

return this;