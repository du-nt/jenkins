def call(String param) {
    echo "Common function called with parameter: ${param}"

    def buildId = env.BUILD_ID
    echo "The value of BUILD_ID is: ${buildId}"
    
    env.EXAMPLE_VAR = "TESTTTTTTTTTTTTTTTTTTTTT"
    echo "The value of EXAMPLE_VAR is: ${env.EXAMPLE_VAR}"

    script{
        withCredentials([file(credentialsId: "wif-config-file", variable: 'GC_KEY')]) {
                sh 'echo $GC_KEY'
            }
        }

    return [status: 'SUCCESS', message: 'Function executed successfully']
}

return this;