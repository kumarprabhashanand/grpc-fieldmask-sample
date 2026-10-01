# grpc-fieldmask-sample

How to use protobuf `FieldMask` with gRPC, so a client can ask for only the fields it needs (a bit like GraphQL field selection, but in gRPC).

- `grpc-fieldmask-example-java` - a Java server and client. `GetRandomUser` returns only the fields listed in the request's field mask.
- `grpc-fieldmask-example-go` - a Go client calling the same server.

## Run it

1. Start `GreetingServer` (Java) from your IDE. It listens on `localhost:9090`.
2. Run either client:
   - Java: `GreetClient`
   - Go: `cd grpc-fieldmask-example-go && go run .`
