- [About Paw](#paw) 
- [Setting Up](#setting-up)
- [Tracking Code Quality](#tracking-code-quality)


# Paw
A social app to bring people closer to those who matter to them, because no existing social media platform really does this.

Social media platforms are so ill designed to bring people closer to those who matter to them, that they actually end up alienating people from their support networks, and inducing poor mental health.

Paw aims to fix this by drawing inspiration from the pyschology of human friendships, instead of the psychology of human addiction.

For starters, it takes a strict approach to the notion of who a friend is and enforces limits on how many of each type you can have. According to the anthropologist and psychologist Robin Dunbar, we have a limited number of each friend type. According to his research, we can have a maximum of 150 casual friends. For close friends, that number is 50. For confidantes and supporters, it's 15. And we can have just 5 best friends.

It also comes opinionated about what a healthy friendship looks like, and provides tools to help nurture or let go of friedships. This way, it adapts to the natural cycle of growth, decay, renewal or death that friendships experience.

It penalizes attempts to exceed a healthy human limit by charging for increases to pre-defined healthy limits (either when adding to, or requesting to join a 'full' intimate space), because Paw is not a networking or career tool, it's an intimate space, where each new entrant changes the dynamic and potentially reduces the quality of existing relationships. Very much like in a book club, a circle of friends, a society's committee, a family, or just siblings hanging out.

Finally, Paw takes a very serious approach to safety, the goal being that you can always trust Paw to let you know the moment a loved one is in danger.


setup/project: [![Build Status](https://travis-ci.com/Nnadozie/paw.svg?branch=setup/project)](https://travis-ci.com/Nnadozie/paw) [![Coverage Status](https://coveralls.io/repos/github/Nnadozie/paw/badge.svg?branch=setup/project)](https://coveralls.io/github/Nnadozie/paw?branch=setup/project)

**Required minimum coverage: 50%**

Dev: [![Build Status](https://travis-ci.com/Nnadozie/paw.svg?branch=dev)](https://travis-ci.com/Nnadozie/paw) [![Coverage Status](https://coveralls.io/repos/github/Nnadozie/paw/badge.svg?branch=dev)](https://coveralls.io/github/Nnadozie/paw?branch=dev) [![Maintainability](https://api.codeclimate.com/v1/badges/c5d3506b2e15785bb622/maintainability)](https://codeclimate.com/github/Nnadozie/paw/maintainability)

Staging: [![Build Status](https://travis-ci.com/Nnadozie/paw.svg?branch=staging)](https://travis-ci.com/Nnadozie/paw) [![Coverage Status](https://coveralls.io/repos/github/Nnadozie/paw/badge.svg?branch=staging)](https://coveralls.io/github/Nnadozie/paw?branch=staging)

Production: [![Build Status](https://travis-ci.com/Nnadozie/paw.svg?branch=master)](https://travis-ci.com/Nnadozie/paw) [![Coverage Status](https://coveralls.io/repos/github/Nnadozie/paw/badge.svg?branch=master)](https://coveralls.io/github/Nnadozie/paw?branch=master)

## Setting Up
**Development environment is set up as follows**

- Spring Boot 2.2.6.RELEASE
- Postgresql 10.12

Java 11:
- openjdk 11.0.7 2020-04-14
- OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.7+10)
- OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.7+10, mixed mode)

**Travis is used for running tests, and Heroku is used for deployments**

Our Travis and Heroku accounts have both been granted access to our Github repository. See [Travis CI getting started](https://docs.travis-ci.com/user/tutorial/) and [Deploying Java Apps on Heroku](https://devcenter.heroku.com/articles/deploying-java) for how to do this.

**Notes on Heroku**: 
- Be sure to include the maven dependency plugin. Here's an example of our setup. You can see we've included the maven dependency plugin after our spring-boot-maven-plugin.
```
        ....
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
			<plugin>
                                <groupId>org.apache.maven.plugins</groupId>
                                <artifactId>maven-dependency-plugin</artifactId>
                                <version>3.0.1</version>
                                <executions>
                                     <execution>
                                     <id>copy-dependencies</id>
                                     <phase>package</phase>
                                     <goals><goal>copy-dependencies</goal></goals>
                                     </execution>
                                </executions>
                       </plugin>
		</plugins>
	</build>

</project>

```
- Include a systems.properties file in the root of the project specifying the Java runtime. This project uses Java 11. Without specifying it, Heroku attempts to use a Java 8 runtime which results in a build failure.
```
]- project root
]- .travis.yml
]- system.properties
   java.runtime.version=11
```

**Travis**

The project root contains a .travis.yml file with the following setup
```
language: java
before_install:
- chmod +x mvnw
deploy:
  provider: heroku
  api_key:
    secure: GWLfJVWDR4TzKOfsCjTmn1x/3nuHscQbU31sVcnC/AXNneBNTOhlsJEGa3WpiszlEFzGRVJ8f61cIAKvjA+odVwOVSXqV2GCrPKRb8eF+bxtzvIf9CuF1nIHjLaLTEzqv/zGhOyJPc4PVzgnB9GP+qZto/rjlo+SYcQPN0tI1EQqpepDpWySEf5VrlZUSdcGqqouqu1WEZPaem6SX6oVL6njnrj/dx3w7vPpTYggPAfidzZD+xjIrBifDb1vTS27DV17BsnH9gQX+IwHpE968kiNL1ba2+9Qw9CgNzBwqEj2CZyJAaV9PB8N1CRj0ooDyL4w3OtGKOogKWpbvybe5IbK8CWo4f+8muQ1r/Pt/zLnXdbHS3i4/FsDazInjZfWxHK3xglLYHqRxM2yPnNqH33HEVcJ9BFMcJjDBrTRXXaZ0Paz5LRFaSzxrTz3EIGMTkYqVzgDWdNB5ZRr95oSLcUIwWBpGSvo5gKsqfL3Cobos68ei+mMWGozCw3ZirDrtxyL1bg+KE9jDfh4SfPwgWiecTfp9DmyAkQLHW+AM3eBMj0nv1MD6ggrOIFmauJOqV/J59zKQQiSWrMFPaVjr939xISMCDY43KUJBx5ss6djUw6KVIf1malxlS5bxX3+eJ2PPOWYXyDKPBPtg0SEjSoV3OoRxnAYehwyIETGnHY=
  app:
    dev: paawww-dev
    staging: paawww-staging
    master: paawww-production
    setup/project: paawww-dev
  on:
    all_branches: true
  skip_cleanup: true
```

**What each line does**
- language tells Travis what language our project is in
- before install we make our mvnw script executable
- when the build succeeds we deploy to Heroku
- the api-key provided is a Travis encrypted Heroku auth-token. I used the Travis and Heroku Command line clients to get this. See more in [the documentation](https://docs.travis-ci.com/user/deployment/heroku/).
- in app: we specify what Heroku apps to deploy our branches to. E.g, New builds on dev branch get deployed to Heroku app paaww-dev. Be sure to make sure these apps are set up on Heroku.
- on: we can specify conditional deploys with on:. Here I'm saying I want a deploy all all branches.
- skip_cleanup: true retains our build files after the travis build. (The idea is so that Heroku doesn't have to rebuild our project, resulting in shorter build times, but for now this project deployments rely on Heroku rebuilds)
Reference [the documentation](https://docs.travis-ci.com/user/tutorial/) for more info.

### Tracking Code Quality

**JaCoCo and Coveralls for Coverage**

We're using the [JaCoCo](https://www.jacoco.org/jacoco/trunk/index.html) library to generate code coverage reports, and [coveralls](https://coveralls.io/) as our continuos integration coverage reporting tool. The way this works: JaCoCo is set up to generate a coverage report each time we run a travis build by making a PR or updating a PR with a commit. The report is then sent over to coveralls which includes a summary of it in our PR -- allowing us to see at a glance whether we're writing enough tests for our coverage goal of 50%.

The setup followed [the coveralls Java documentation](https://docs.coveralls.io/java) with **one important NOTE**. We needed to add a javax dependency to the coveralls plugin as [detailed in this issue](https://github.com/trautonen/coveralls-maven-plugin/issues/112), likely because we're using Java 11. Here's what all this looks like in our pom.xml file

```
			<plugin>
				<groupId>org.eluder.coveralls</groupId>
				<artifactId>coveralls-maven-plugin</artifactId>
				<version>4.3.0</version>
				<dependencies>
					<dependency>
						<groupId>javax.xml.bind</groupId>
						<artifactId>jaxb-api</artifactId>
						<version>2.2.3</version>
					</dependency>
				</dependencies>
			</plugin>
			<plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<version>0.8.5</version>
				<executions>
					<execution>
						<id>prepare-agent</id>
						<goals>
							<goal>prepare-agent</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
```

**Codeclimate for Code Smells**

We [set up Codeclimate Quality](https://docs.codeclimate.com/docs/workflow) with [Github PR Integration enabled](https://docs.codeclimate.com/docs/github-pull-requests) using the default quality metrics to track code smells in our code.
