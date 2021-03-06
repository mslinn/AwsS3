/* Copyright 2012-2017 Micronautics Research Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License. */

package com.micronautics.aws

import org.scalatest.{BeforeAndAfter, BeforeAndAfterAll, MustMatchers, Suite}

trait TestBase extends MustMatchers with BeforeAndAfter with BeforeAndAfterAll with SNSImplicits { this: BeforeAndAfterAll with Suite =>
  lazy implicit val s3: S3 = new S3()
  lazy implicit val cf: CloudFront = new CloudFront()
  lazy implicit val comprehend: Comprehend = new Comprehend()
  lazy implicit val et: ElasticTranscoder = new ElasticTranscoder()
  lazy implicit val iam: IAM = new IAM()
  lazy implicit val polly: Polly = new Polly()
  lazy implicit val r53: Route53 = new Route53()
  lazy implicit val sns: SNS = new SNS()
}
