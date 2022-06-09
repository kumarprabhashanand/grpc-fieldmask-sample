package com.grpc.example.client;

import com.google.protobuf.FieldMask;
import com.grpc.example.greet.model.User;
import com.grpc.example.greet.model.UserAddress;
import com.grpc.example.greet.service.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GreetClient {

    private final ManagedChannel managedChannel;
    private final GreetUserServiceGrpc.GreetUserServiceBlockingStub blockingStub;

    public GreetClient(String host, int port) {
        managedChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        blockingStub = GreetUserServiceGrpc.newBlockingStub(managedChannel);
    }

    public void shutdown() throws InterruptedException {
        managedChannel.shutdown().awaitTermination(30, TimeUnit.SECONDS);
    }

    public String getGreetingMessage(User user) {
        GreetUserRequest greetUserRequest = GreetUserRequest.newBuilder().setUser(user).build();
        GreetUserResponse greetUserResponse = GreetUserResponse.getDefaultInstance();

        greetUserResponse = blockingStub.greetUser(greetUserRequest);

        return greetUserResponse.getGreetMessage();
    }

    public User getRandomUser() {
        FieldMask fieldMask = FieldMask.newBuilder()
                .addPaths("firstName")
                .addPaths("lastName")
                .addPaths("age")
                .build();

        GetRandomUserRequest getRandomUserRequest = GetRandomUserRequest.newBuilder().setFieldMask(fieldMask).build();

        GetRandomUserResponse getRandomUserResponse = blockingStub.getRandomUser(getRandomUserRequest);
        return getRandomUserResponse.getUser();
    }

    public static void main(String[] args) {
        GreetClient greetClient = new GreetClient("localhost",9090);

        User user = User.newBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .addAddress(UserAddress.newBuilder().setCity("PN").setCountry("IN").build())
                .build();
        System.out.println("Response Greeting Message : "+greetClient.getGreetingMessage(user));

        User randomUser = greetClient.getRandomUser();

        System.out.println("Response User : "+randomUser);

        try {
            greetClient.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
