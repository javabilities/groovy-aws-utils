package s3

@Grapes([
        @Grab(group = 'com.amazonaws', module = 'aws-java-sdk-s3', version = '1.11.396')
])

import com.amazonaws.services.s3.AmazonS3ClientBuilder
import com.amazonaws.services.s3.AmazonS3
import com.amazonaws.services.s3.model.Bucket

final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient()
List<Bucket> buckets = s3.listBuckets()
println "Your Amazon S3 Buckets are:"
buckets.each { bucket ->
    println "* ${bucket.name}"
}