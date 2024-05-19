
def credentials = CredentialsProvider.lookupCredentials(
    StandardUsernamePasswordCredentials.class, 
    Jenkins.instance
);

def cred = credentials.findResult { it.id == "text" ? it : null }
def printCounter(String param) {
    echo "Common function called with parameter: ${param}"

    def exampleVar = env.env_ne
    echo "The value of EXAMPLE_VAR is: ${exampleVar}"
    
    env.NAME = "hello cong san"
    echo "The vdfsdfdsfE_VAR is: ${NAME}"
    echo "Txxxxxxxxxxxxxxxxxxxxx ${cred}"
    // Return some parameters
    return [status: 'SUCCESS', message: 'Function executed successfully']
}


return this;