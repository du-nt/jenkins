def envVar = System.getenv('env_ne')

def printCounter(String param) {
    echo "Common function called with parameter: ${param}"

    echo "The value of EXAMPLE_VAR is: ${envVar}"
    
    // Return some parameters
    return [status: 'SUCCESS', message: 'Function executed successfully']
}

return this;