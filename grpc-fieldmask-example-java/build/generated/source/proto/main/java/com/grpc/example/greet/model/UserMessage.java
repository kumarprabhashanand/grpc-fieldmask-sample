// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_message.proto

package com.grpc.example.greet.model;

public final class UserMessage {
  private UserMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_example_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_example_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_example_UserAddress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_example_UserAddress_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022user_message.proto\022\020com.grpc.example\032\037" +
      "google/protobuf/timestamp.proto\"\340\001\n\004User" +
      "\022\021\n\tfirstName\030\001 \001(\t\022\027\n\nmiddleName\030\002 \001(\tH" +
      "\000\210\001\001\022\025\n\010lastName\030\003 \001(\tH\001\210\001\001\022\020\n\003age\030\004 \001(\r" +
      "H\002\210\001\001\022.\n\007address\030\005 \003(\0132\035.com.grpc.exampl" +
      "e.UserAddress\022/\n\013currentTime\030\006 \001(\0132\032.goo" +
      "gle.protobuf.TimestampB\r\n\013_middleNameB\013\n" +
      "\t_lastNameB\006\n\004_age\"\265\001\n\013UserAddress\022\024\n\014ad" +
      "dressLine1\030\001 \001(\t\022\031\n\014addressLine2\030\002 \001(\tH\000" +
      "\210\001\001\022\014\n\004city\030\003 \001(\t\022\017\n\007country\030\004 \001(\t\022\017\n\007pi" +
      "ncode\030\005 \001(\r\"4\n\014ADDRESS_TYPE\022\010\n\004BOTH\020\000\022\r\n" +
      "\tPERMANENT\020\001\022\013\n\007CURRENT\020\002B\017\n\r_addressLin" +
      "e2B&\n\034com.grpc.example.greet.modelP\001Z\004./" +
      "pbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_com_grpc_example_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_grpc_example_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_example_User_descriptor,
        new java.lang.String[] { "FirstName", "MiddleName", "LastName", "Age", "Address", "CurrentTime", "MiddleName", "LastName", "Age", });
    internal_static_com_grpc_example_UserAddress_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_grpc_example_UserAddress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_example_UserAddress_descriptor,
        new java.lang.String[] { "AddressLine1", "AddressLine2", "City", "Country", "Pincode", "AddressLine2", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
