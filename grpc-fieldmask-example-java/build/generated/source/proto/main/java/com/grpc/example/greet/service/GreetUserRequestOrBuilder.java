// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greet_user_service.proto

package com.grpc.example.greet.service;

public interface GreetUserRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.grpc.example.GreetUserRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.grpc.example.User user = 1;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <code>.com.grpc.example.User user = 1;</code>
   * @return The user.
   */
  com.grpc.example.greet.model.User getUser();
  /**
   * <code>.com.grpc.example.User user = 1;</code>
   */
  com.grpc.example.greet.model.UserOrBuilder getUserOrBuilder();
}
