package com.lonewolfworks.wolke.rds.credentialbroker;

import com.lonewolfworks.wolke.rds.credentialbroker.broker.CredentialBroker
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties

/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@SpringBootApplication
@EnableConfigurationProperties
open class RdsCredentialBrokerApplication(
		private val credentialBroker: CredentialBroker
) : CommandLineRunner {
	override fun run(vararg args: String?) {
		credentialBroker.brokerCredentials()
	}
}

fun main(args: Array<String>) {
	SpringApplication.run(RdsCredentialBrokerApplication::class.java, *args)
}
