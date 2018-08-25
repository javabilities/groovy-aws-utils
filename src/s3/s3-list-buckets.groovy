package s3

@Grapes([
        @Grab(group = 'com.amazonaws', module = 'aws-java-sdk-s3', version = '1.11.396')
])

import com.amazonaws.services.s3.AmazonS3ClientBuilder
import com.amazonaws.services.s3.AmazonS3
import com.amazonaws.services.s3.model.Bucket

// Initialize the s3 client
final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient()

// Get the bucket list
List<Bucket> buckets = s3.listBuckets()

// Print the bucket list
println "Buckets:"
buckets.each { bucket ->
    println "* ${bucket.name} created on ${bucket.creationDate} by ${bucket.owner.displayName}"
}
