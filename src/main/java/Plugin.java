import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.time.LocalDateTime;

@Mojo(name = "sayCurrentTime")
public class Plugin extends AbstractMojo {
    @Parameter(property = "writeNowTime")
    private Boolean writeNow;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        if (writeNow != null && writeNow) {
            System.out.println(LocalDateTime.now());
        } else {
            System.out.println("writeTimeNow = false");
        }
    }
}
