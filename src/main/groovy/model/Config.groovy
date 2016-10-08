package model

import com.blackbuild.groovy.configdsl.transform.DSL
import com.blackbuild.groovy.configdsl.transform.Key
import com.blackbuild.groovy.configdsl.transform.Owner

/**
 * Created by stephan on 07.10.2016.
 */
@DSL
class Config {

    Map<String, Project> projects

}

@DSL
class Project {

    @Owner Config config
    @Key String name
    String lead

    String repositoryUrl

    GAV artifact

    Map<String, Server> servers

}

@DSL
class GAV {
    String groupId
    String artifactId
}

@DSL
class Server {
    @Key String name
    @Owner project
    String hostname
    String basedir

}