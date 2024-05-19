def printCounter(String param) {
    echo "Common function called with parameter: ${param}"
    // Return some parameters
    return [status: 'SUCCESS', message: 'Function executed successfully']
}