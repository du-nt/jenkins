def printCounter(String param) {
    echo "Common function called with parameter: ${param}"

    def exampleVar = env.env_ne
    echo "The value of EXAMPLE_VAR is: ${exampleVar}"
    


evn.MY_VAR = "hello cong san"
    echo "The vdfsdfdsfE_VAR is: ${MY_VAR}"
    // Return some parameters
    return [status: 'SUCCESS', message: 'Function executed successfully']
}

return this;