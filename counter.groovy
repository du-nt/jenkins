def envVar = System.getenv('EXAMPLE_VAR')

def printCounter(String param) {
    echo "Common function called with parameter: ${param}"

    def exampleVar = env.env_ne
    echo "The value of EXAMPLE_VAR is: ${exampleVar}"
    
    echo "The vdfsdfdsfE_VAR is: ${envVar}"

    // Return some parameters
    return [status: 'SUCCESS', message: 'Function executed successfully']
}

return this;