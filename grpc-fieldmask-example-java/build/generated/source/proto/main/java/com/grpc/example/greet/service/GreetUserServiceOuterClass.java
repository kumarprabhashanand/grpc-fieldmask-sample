// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greet_user_service.proto

package com.grpc.example.greet.service;

public final class GreetUserServiceOuterClass {
  private GreetUserServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_example_GreetUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_example_GreetUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_example_GreetUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_example_GreetUserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_example_GetRandomUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_example_GetRandomUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_example_GetRandomUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_example_GetRandomUserResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030greet_user_service.proto\022\020com.grpc.exa" +
      "mple\032\022user_message.proto\032 google/protobu" +
      "f/field_mask.proto\"8\n\020GreetUserRequest\022$" +
      "\n\004user\030\001 \001(\0132\026.com.grpc.example.User\")\n\021" +
      "GreetUserResponse\022\024\n\014greetMessage\030\001 \001(\t\"" +
      "F\n\024GetRandomUserRequest\022.\n\nfield_mask\030\001 " +
      "\001(\0132\032.google.protobuf.FieldMask\"=\n\025GetRa" +
      "ndomUserResponse\022$\n\004user\030\001 \001(\0132\026.com.grp" +
      "c.example.User2\316\001\n\020GreetUserService\022V\n\tG" +
      "reetUser\022\".com.grpc.example.GreetUserReq" +
      "uest\032#.com.grpc.example.GreetUserRespons" +
      "e\"\000\022b\n\rGetRandomUser\022&.com.grpc.example." +
      "GetRandomUserRequest\032\'.com.grpc.example." +
      "GetRandomUserResponse\"\000B(\n\036com.grpc.exam" +
      "ple.greet.serviceP\001Z\004./pbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.grpc.example.greet.model.UserMessage.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_com_grpc_example_GreetUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_grpc_example_GreetUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_example_GreetUserRequest_descriptor,
        new java.lang.String[] { "User", });
    internal_static_com_grpc_example_GreetUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_grpc_example_GreetUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_example_GreetUserResponse_descriptor,
        new java.lang.String[] { "GreetMessage", });
    internal_static_com_grpc_example_GetRandomUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_grpc_example_GetRandomUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_example_GetRandomUserRequest_descriptor,
        new java.lang.String[] { "FieldMask", });
    internal_static_com_grpc_example_GetRandomUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_grpc_example_GetRandomUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_example_GetRandomUserResponse_descriptor,
        new java.lang.String[] { "User", });
    com.grpc.example.greet.model.UserMessage.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
