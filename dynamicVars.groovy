def call(Map config = [:]) {
    def result = [:]

    if (config.projectId == "DEV") {
        result.secretId = 'atomic-dev'
        result.bucketName = 'bucket-dev'
        result.region = 'us-central1'
        result.zone = 'us-central1-a'
    } else {
        result.secretId = 'atomic-prod'
        result.bucketName = 'bucket-prod'
        result.region = 'us-central1'
        result.zone = 'us-central1-a'
    }

    return result
}

return this