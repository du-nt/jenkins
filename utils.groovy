def step1() {
    echo "Step 1"

    def buildId = env.BUILD_ID
    echo "The value of BUILD_ID is: ${buildId}"
}

def step2() {
    echo "Step 1"

    env.EXAMPLE_VAR = "TESTTTTTTTTTTTTTTTTTTTTT"
    echo "The value of EXAMPLE_VAR is: ${env.EXAMPLE_VAR}"

    script{
        withCredentials([file(credentialsId: "wif-config-file", variable: 'GC_KEY')]) {
                sh 'echo $GC_KEY'
            }
        }
}

def step3() {
    echo "Step 3"
    script{
        withCredentials([file(credentialsId: "wif-config-file", variable: 'GC_KEY')]) {
                sh 'echo $GC_KEY'
            }
        }
}

return this;