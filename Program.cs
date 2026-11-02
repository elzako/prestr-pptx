var builder = WebApplication.CreateBuilder(args);
builder.Services.AddHealthChecks();

var app = builder.Build();

app.MapGet("/", () => Results.Ok(new { service = "prestr-pptx" }));
app.MapHealthChecks("/health");

app.Run();
