// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_message.proto

package com.grpc.example.greet.model;

/**
 * Protobuf type {@code com.grpc.example.UserAddress}
 */
public final class UserAddress extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.grpc.example.UserAddress)
    UserAddressOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserAddress.newBuilder() to construct.
  private UserAddress(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserAddress() {
    addressLine1_ = "";
    addressLine2_ = "";
    city_ = "";
    country_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserAddress();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserAddress(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            addressLine1_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            addressLine2_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            city_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            country_ = s;
            break;
          }
          case 40: {

            pincode_ = input.readUInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.example.greet.model.UserMessage.internal_static_com_grpc_example_UserAddress_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.example.greet.model.UserMessage.internal_static_com_grpc_example_UserAddress_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.example.greet.model.UserAddress.class, com.grpc.example.greet.model.UserAddress.Builder.class);
  }

  /**
   * Protobuf enum {@code com.grpc.example.UserAddress.ADDRESS_TYPE}
   */
  public enum ADDRESS_TYPE
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>BOTH = 0;</code>
     */
    BOTH(0),
    /**
     * <code>PERMANENT = 1;</code>
     */
    PERMANENT(1),
    /**
     * <code>CURRENT = 2;</code>
     */
    CURRENT(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>BOTH = 0;</code>
     */
    public static final int BOTH_VALUE = 0;
    /**
     * <code>PERMANENT = 1;</code>
     */
    public static final int PERMANENT_VALUE = 1;
    /**
     * <code>CURRENT = 2;</code>
     */
    public static final int CURRENT_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ADDRESS_TYPE valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ADDRESS_TYPE forNumber(int value) {
      switch (value) {
        case 0: return BOTH;
        case 1: return PERMANENT;
        case 2: return CURRENT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ADDRESS_TYPE>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ADDRESS_TYPE> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ADDRESS_TYPE>() {
            public ADDRESS_TYPE findValueByNumber(int number) {
              return ADDRESS_TYPE.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.grpc.example.greet.model.UserAddress.getDescriptor().getEnumTypes().get(0);
    }

    private static final ADDRESS_TYPE[] VALUES = values();

    public static ADDRESS_TYPE valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ADDRESS_TYPE(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.grpc.example.UserAddress.ADDRESS_TYPE)
  }

  private int bitField0_;
  public static final int ADDRESSLINE1_FIELD_NUMBER = 1;
  private volatile java.lang.Object addressLine1_;
  /**
   * <code>string addressLine1 = 1;</code>
   * @return The addressLine1.
   */
  @java.lang.Override
  public java.lang.String getAddressLine1() {
    java.lang.Object ref = addressLine1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      addressLine1_ = s;
      return s;
    }
  }
  /**
   * <code>string addressLine1 = 1;</code>
   * @return The bytes for addressLine1.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressLine1Bytes() {
    java.lang.Object ref = addressLine1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      addressLine1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADDRESSLINE2_FIELD_NUMBER = 2;
  private volatile java.lang.Object addressLine2_;
  /**
   * <code>string addressLine2 = 2;</code>
   * @return Whether the addressLine2 field is set.
   */
  @java.lang.Override
  public boolean hasAddressLine2() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>string addressLine2 = 2;</code>
   * @return The addressLine2.
   */
  @java.lang.Override
  public java.lang.String getAddressLine2() {
    java.lang.Object ref = addressLine2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      addressLine2_ = s;
      return s;
    }
  }
  /**
   * <code>string addressLine2 = 2;</code>
   * @return The bytes for addressLine2.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressLine2Bytes() {
    java.lang.Object ref = addressLine2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      addressLine2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CITY_FIELD_NUMBER = 3;
  private volatile java.lang.Object city_;
  /**
   * <code>string city = 3;</code>
   * @return The city.
   */
  @java.lang.Override
  public java.lang.String getCity() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      city_ = s;
      return s;
    }
  }
  /**
   * <code>string city = 3;</code>
   * @return The bytes for city.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCityBytes() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      city_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNTRY_FIELD_NUMBER = 4;
  private volatile java.lang.Object country_;
  /**
   * <code>string country = 4;</code>
   * @return The country.
   */
  @java.lang.Override
  public java.lang.String getCountry() {
    java.lang.Object ref = country_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      country_ = s;
      return s;
    }
  }
  /**
   * <code>string country = 4;</code>
   * @return The bytes for country.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCountryBytes() {
    java.lang.Object ref = country_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      country_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PINCODE_FIELD_NUMBER = 5;
  private int pincode_;
  /**
   * <code>uint32 pincode = 5;</code>
   * @return The pincode.
   */
  @java.lang.Override
  public int getPincode() {
    return pincode_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getAddressLine1Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, addressLine1_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, addressLine2_);
    }
    if (!getCityBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, city_);
    }
    if (!getCountryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, country_);
    }
    if (pincode_ != 0) {
      output.writeUInt32(5, pincode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAddressLine1Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, addressLine1_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, addressLine2_);
    }
    if (!getCityBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, city_);
    }
    if (!getCountryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, country_);
    }
    if (pincode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, pincode_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.grpc.example.greet.model.UserAddress)) {
      return super.equals(obj);
    }
    com.grpc.example.greet.model.UserAddress other = (com.grpc.example.greet.model.UserAddress) obj;

    if (!getAddressLine1()
        .equals(other.getAddressLine1())) return false;
    if (hasAddressLine2() != other.hasAddressLine2()) return false;
    if (hasAddressLine2()) {
      if (!getAddressLine2()
          .equals(other.getAddressLine2())) return false;
    }
    if (!getCity()
        .equals(other.getCity())) return false;
    if (!getCountry()
        .equals(other.getCountry())) return false;
    if (getPincode()
        != other.getPincode()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ADDRESSLINE1_FIELD_NUMBER;
    hash = (53 * hash) + getAddressLine1().hashCode();
    if (hasAddressLine2()) {
      hash = (37 * hash) + ADDRESSLINE2_FIELD_NUMBER;
      hash = (53 * hash) + getAddressLine2().hashCode();
    }
    hash = (37 * hash) + CITY_FIELD_NUMBER;
    hash = (53 * hash) + getCity().hashCode();
    hash = (37 * hash) + COUNTRY_FIELD_NUMBER;
    hash = (53 * hash) + getCountry().hashCode();
    hash = (37 * hash) + PINCODE_FIELD_NUMBER;
    hash = (53 * hash) + getPincode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.example.greet.model.UserAddress parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.example.greet.model.UserAddress parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.example.greet.model.UserAddress parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.example.greet.model.UserAddress parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.example.greet.model.UserAddress parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.example.greet.model.UserAddress parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.example.greet.model.UserAddress parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.example.greet.model.UserAddress parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.example.greet.model.UserAddress parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.example.greet.model.UserAddress parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.example.greet.model.UserAddress parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.example.greet.model.UserAddress parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.grpc.example.greet.model.UserAddress prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.grpc.example.UserAddress}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.grpc.example.UserAddress)
      com.grpc.example.greet.model.UserAddressOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.example.greet.model.UserMessage.internal_static_com_grpc_example_UserAddress_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.example.greet.model.UserMessage.internal_static_com_grpc_example_UserAddress_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.example.greet.model.UserAddress.class, com.grpc.example.greet.model.UserAddress.Builder.class);
    }

    // Construct using com.grpc.example.greet.model.UserAddress.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      addressLine1_ = "";

      addressLine2_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      city_ = "";

      country_ = "";

      pincode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.example.greet.model.UserMessage.internal_static_com_grpc_example_UserAddress_descriptor;
    }

    @java.lang.Override
    public com.grpc.example.greet.model.UserAddress getDefaultInstanceForType() {
      return com.grpc.example.greet.model.UserAddress.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.example.greet.model.UserAddress build() {
      com.grpc.example.greet.model.UserAddress result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.example.greet.model.UserAddress buildPartial() {
      com.grpc.example.greet.model.UserAddress result = new com.grpc.example.greet.model.UserAddress(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.addressLine1_ = addressLine1_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.addressLine2_ = addressLine2_;
      result.city_ = city_;
      result.country_ = country_;
      result.pincode_ = pincode_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grpc.example.greet.model.UserAddress) {
        return mergeFrom((com.grpc.example.greet.model.UserAddress)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.example.greet.model.UserAddress other) {
      if (other == com.grpc.example.greet.model.UserAddress.getDefaultInstance()) return this;
      if (!other.getAddressLine1().isEmpty()) {
        addressLine1_ = other.addressLine1_;
        onChanged();
      }
      if (other.hasAddressLine2()) {
        bitField0_ |= 0x00000001;
        addressLine2_ = other.addressLine2_;
        onChanged();
      }
      if (!other.getCity().isEmpty()) {
        city_ = other.city_;
        onChanged();
      }
      if (!other.getCountry().isEmpty()) {
        country_ = other.country_;
        onChanged();
      }
      if (other.getPincode() != 0) {
        setPincode(other.getPincode());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.grpc.example.greet.model.UserAddress parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.example.greet.model.UserAddress) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object addressLine1_ = "";
    /**
     * <code>string addressLine1 = 1;</code>
     * @return The addressLine1.
     */
    public java.lang.String getAddressLine1() {
      java.lang.Object ref = addressLine1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        addressLine1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string addressLine1 = 1;</code>
     * @return The bytes for addressLine1.
     */
    public com.google.protobuf.ByteString
        getAddressLine1Bytes() {
      java.lang.Object ref = addressLine1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        addressLine1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string addressLine1 = 1;</code>
     * @param value The addressLine1 to set.
     * @return This builder for chaining.
     */
    public Builder setAddressLine1(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      addressLine1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string addressLine1 = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddressLine1() {
      
      addressLine1_ = getDefaultInstance().getAddressLine1();
      onChanged();
      return this;
    }
    /**
     * <code>string addressLine1 = 1;</code>
     * @param value The bytes for addressLine1 to set.
     * @return This builder for chaining.
     */
    public Builder setAddressLine1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      addressLine1_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object addressLine2_ = "";
    /**
     * <code>string addressLine2 = 2;</code>
     * @return Whether the addressLine2 field is set.
     */
    public boolean hasAddressLine2() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>string addressLine2 = 2;</code>
     * @return The addressLine2.
     */
    public java.lang.String getAddressLine2() {
      java.lang.Object ref = addressLine2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        addressLine2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string addressLine2 = 2;</code>
     * @return The bytes for addressLine2.
     */
    public com.google.protobuf.ByteString
        getAddressLine2Bytes() {
      java.lang.Object ref = addressLine2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        addressLine2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string addressLine2 = 2;</code>
     * @param value The addressLine2 to set.
     * @return This builder for chaining.
     */
    public Builder setAddressLine2(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      addressLine2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string addressLine2 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddressLine2() {
      bitField0_ = (bitField0_ & ~0x00000001);
      addressLine2_ = getDefaultInstance().getAddressLine2();
      onChanged();
      return this;
    }
    /**
     * <code>string addressLine2 = 2;</code>
     * @param value The bytes for addressLine2 to set.
     * @return This builder for chaining.
     */
    public Builder setAddressLine2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      addressLine2_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object city_ = "";
    /**
     * <code>string city = 3;</code>
     * @return The city.
     */
    public java.lang.String getCity() {
      java.lang.Object ref = city_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        city_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string city = 3;</code>
     * @return The bytes for city.
     */
    public com.google.protobuf.ByteString
        getCityBytes() {
      java.lang.Object ref = city_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        city_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string city = 3;</code>
     * @param value The city to set.
     * @return This builder for chaining.
     */
    public Builder setCity(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      city_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string city = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCity() {
      
      city_ = getDefaultInstance().getCity();
      onChanged();
      return this;
    }
    /**
     * <code>string city = 3;</code>
     * @param value The bytes for city to set.
     * @return This builder for chaining.
     */
    public Builder setCityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      city_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object country_ = "";
    /**
     * <code>string country = 4;</code>
     * @return The country.
     */
    public java.lang.String getCountry() {
      java.lang.Object ref = country_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        country_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string country = 4;</code>
     * @return The bytes for country.
     */
    public com.google.protobuf.ByteString
        getCountryBytes() {
      java.lang.Object ref = country_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        country_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string country = 4;</code>
     * @param value The country to set.
     * @return This builder for chaining.
     */
    public Builder setCountry(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      country_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string country = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCountry() {
      
      country_ = getDefaultInstance().getCountry();
      onChanged();
      return this;
    }
    /**
     * <code>string country = 4;</code>
     * @param value The bytes for country to set.
     * @return This builder for chaining.
     */
    public Builder setCountryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      country_ = value;
      onChanged();
      return this;
    }

    private int pincode_ ;
    /**
     * <code>uint32 pincode = 5;</code>
     * @return The pincode.
     */
    @java.lang.Override
    public int getPincode() {
      return pincode_;
    }
    /**
     * <code>uint32 pincode = 5;</code>
     * @param value The pincode to set.
     * @return This builder for chaining.
     */
    public Builder setPincode(int value) {
      
      pincode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 pincode = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPincode() {
      
      pincode_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.grpc.example.UserAddress)
  }

  // @@protoc_insertion_point(class_scope:com.grpc.example.UserAddress)
  private static final com.grpc.example.greet.model.UserAddress DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.example.greet.model.UserAddress();
  }

  public static com.grpc.example.greet.model.UserAddress getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserAddress>
      PARSER = new com.google.protobuf.AbstractParser<UserAddress>() {
    @java.lang.Override
    public UserAddress parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserAddress(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserAddress> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserAddress> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.example.greet.model.UserAddress getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

