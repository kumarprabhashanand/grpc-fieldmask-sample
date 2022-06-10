package main

import (
	"context"
	"flag"
	"fmt"
	"log"
	"time"

	"grpc-fieldmask-example-go/pb"

	"google.golang.org/grpc"
	"google.golang.org/protobuf/types/known/fieldmaskpb"
)

var (
	addr = flag.String("addr", "localhost:9090", "the address to connect to")
)

func main() {
	fmt.Println("main method")
	serverAddress := flag.String("address", "localhost:9090", "the server address")
	flag.Parse()
	log.Printf("Connecting to %s", *serverAddress)

	conn, err := grpc.Dial(*serverAddress, grpc.WithInsecure())
	if err != nil {
		log.Fatalf("error while connecting: %v", err)
	}
	defer conn.Close()

	client := pb.NewGreetUserServiceClient(conn)

	ctx, cancel := context.WithTimeout(context.Background(), time.Second)
	defer cancel()

	callGreetUser(client, ctx)

	callRandomUser(client, ctx)

}

func callGreetUser(client pb.GreetUserServiceClient, ctx context.Context) {
	lastName := flag.String("lastName", "Doe", "last name of user")
	var age uint32 = 26

	user := pb.User{FirstName: "John", LastName: lastName, Age: &age}

	req := pb.GreetUserRequest{User: &user}

	r, err := client.GreetUser(ctx, &req)

	if err != nil {
		log.Fatalf("could not greet: %v", err)
	}

	log.Printf("Response From Server - Greeting : %s", r.GetGreetMessage())
}

func callRandomUser(client pb.GreetUserServiceClient, ctx context.Context) {

	var paths []string = []string{"firstName", "lastName", "age", "address"}

	field_mask := fieldmaskpb.FieldMask{Paths: paths}

	req := pb.GetRandomUserRequest{FieldMask: &field_mask}

	r, err := client.GetRandomUser(ctx, &req)

	if err != nil {
		log.Fatalf("could not get random user : %v", err)
	}

	log.Printf("Response From Server - Random User : %s", r.GetUser())

}
