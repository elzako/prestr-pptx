# prestr-pptx

A simple C# project using ASP.NET Core Minimal APIs on .NET 10, with
[Open XML SDK](https://www.nuget.org/packages/DocumentFormat.OpenXml/3.5.1)
installed for working with Office documents, including PowerPoint presentations.

## Run

Install the .NET 10 SDK, then run:

```sh
dotnet restore
dotnet run
```

The API listens at `http://localhost:5000` using the default HTTP launch profile.

| Endpoint | Response |
| --- | --- |
| `GET /` | JSON identifying the service |
| `GET /health` | `200 OK` with `Healthy` |

```sh
curl http://localhost:5000/
curl http://localhost:5000/health
```

Add API endpoints in `Program.cs`. The `DocumentFormat.OpenXml` NuGet package is
referenced in `Prestr.Pptx.csproj`; document generation endpoints can be added as needed.

## Build

```sh
dotnet build
```
