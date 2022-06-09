package com.grpc.example.service;

import com.google.protobuf.util.FieldMaskUtil;
import com.grpc.example.greet.model.User;
import com.grpc.example.greet.model.UserAddress;
import com.grpc.example.greet.service.*;
import io.grpc.stub.StreamObserver;

public class GreetingService extends GreetUserServiceGrpc.GreetUserServiceImplBase {

    @Override
    public void greetUser(GreetUserRequest request, StreamObserver<GreetUserResponse> responseObserver) {
        User user = request.getUser();
        String greetMessage = createGreetMessage(user);
        GreetUserResponse response = GreetUserResponse.newBuilder().setGreetMessage(greetMessage).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private String createGreetMessage(User user) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello, ")
                .append(user.getFirstName())
                .append(user.hasMiddleName() ? " "+user.getMiddleName() : "")
                .append(user.hasLastName() ? " "+user.getLastName() : "")
                .append("!");
        if(user.getAddressCount() > 0) {
            stringBuilder.append("\nI hope things are good in ")
                    .append(user.getAddress(0).getCity())
                    .append(", ")
                    .append(user.getAddress(0).getCountry());
        }
        return stringBuilder.toString();
    }


    @Override
    public void getRandomUser(GetRandomUserRequest request, StreamObserver<GetRandomUserResponse> responseObserver) {

        User user = User.newBuilder().setFirstName("John").setLastName("Doe").setAge(26).build();

        for (String s : request.getFieldMask().getPathsList()) {
            if(s.equalsIgnoreCase("address")) {
                UserAddress userAddress = UserAddress.newBuilder()
                        .setAddressLine1("BR 15")
                        .setCity("PN")
                        .setCountry("IN")
                        .build();
                user = user.toBuilder().addAddress(userAddress).build();
            }
        }

        User.Builder resUserBuilder = User.newBuilder();

        FieldMaskUtil.merge(request.getFieldMask(), user, resUserBuilder);

        GetRandomUserResponse response = GetRandomUserResponse.newBuilder().setUser(resUserBuilder).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
