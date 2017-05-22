package info.sliceoflife.dropbookmarks;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropBookMarksApplication extends Application<DropBookMarksConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropBookMarksApplication().run(args);
    }

    @Override
    public String getName() {
        return "DropBookMarks";
    }

    @Override
    public void initialize(final Bootstrap<DropBookMarksConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DropBookMarksConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
