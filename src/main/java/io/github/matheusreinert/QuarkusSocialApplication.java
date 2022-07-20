package io.github.matheusreinert;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;

import javax.persistence.Column;
import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        info = @Info(
                title = "Api Quarkus",
                version = "1.0",
                contact = @Contact(
                        name = "Matheus Reinert",
                        url = "http://quarkusApi.com",
                        email = "reinert.matheus@hotmail.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.orq/licenses/LICENSE-2.0.html"
                )
        )
)
public class QuarkusSocialApplication extends Application {
}
