package info.sliceoflife.helloworld.health;

import com.codahale.metrics.health.HealthCheck;
import com.codahale.metrics.health.HealthCheck.Result;

public class TemplateHealthCheck extends HealthCheck {

  private final String template;

  public TemplateHealthCheck(final String template) {
    this.template = template;
  }

  @Override
  protected Result check() throws Exception {
    final String saying = String.format(template, "Test");
    if (!saying.contains("Test")) {
      return Result.unhealthy("template doesn't include a name!");
    }
    return Result.healthy();
  }

}
