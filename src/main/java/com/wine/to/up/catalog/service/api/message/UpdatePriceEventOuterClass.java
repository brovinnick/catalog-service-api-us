// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: update_price_event.proto

package com.wine.to.up.catalog.service.api.message;

public final class UpdatePriceEventOuterClass {
  private UpdatePriceEventOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UpdatePriceEventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UpdatePriceEvent)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string id = 1;</code>
     */
    java.lang.String getId();
    /**
     * <code>optional string id = 1;</code>
     */
    com.google.protobuf.ByteString
        getIdBytes();

    /**
     * <code>optional string name = 2;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 2;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional double price = 3;</code>
     */
    double getPrice();
  }
  /**
   * <pre>
   *this class is treated by Protobuf.
   *During "generate-sources" phase (install includes it) java classes are generates (see folder "target/")
   * </pre>
   *
   * Protobuf type {@code UpdatePriceEvent}
   */
  public  static final class UpdatePriceEvent extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UpdatePriceEvent)
      UpdatePriceEventOrBuilder {
    // Use UpdatePriceEvent.newBuilder() to construct.
    private UpdatePriceEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpdatePriceEvent() {
      id_ = "";
      name_ = "";
      price_ = 0D;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private UpdatePriceEvent(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              id_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 25: {

              price_ = input.readDouble();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.internal_static_UpdatePriceEvent_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.internal_static_UpdatePriceEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent.class, com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object id_;
    /**
     * <code>optional string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      }
    }
    /**
     * <code>optional string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <code>optional string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PRICE_FIELD_NUMBER = 3;
    private double price_;
    /**
     * <code>optional double price = 3;</code>
     */
    public double getPrice() {
      return price_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
      }
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (price_ != 0D) {
        output.writeDouble(3, price_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
      }
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (price_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, price_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent)) {
        return super.equals(obj);
      }
      com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent other = (com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent) obj;

      boolean result = true;
      result = result && getId()
          .equals(other.getId());
      result = result && getName()
          .equals(other.getName());
      result = result && (
          java.lang.Double.doubleToLongBits(getPrice())
          == java.lang.Double.doubleToLongBits(
              other.getPrice()));
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + PRICE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getPrice()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * <pre>
     *this class is treated by Protobuf.
     *During "generate-sources" phase (install includes it) java classes are generates (see folder "target/")
     * </pre>
     *
     * Protobuf type {@code UpdatePriceEvent}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UpdatePriceEvent)
        com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.internal_static_UpdatePriceEvent_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.internal_static_UpdatePriceEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent.class, com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent.Builder.class);
      }

      // Construct using com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent.newBuilder()
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
      public Builder clear() {
        super.clear();
        id_ = "";

        name_ = "";

        price_ = 0D;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.internal_static_UpdatePriceEvent_descriptor;
      }

      public com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent getDefaultInstanceForType() {
        return com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent.getDefaultInstance();
      }

      public com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent build() {
        com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent buildPartial() {
        com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent result = new com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent(this);
        result.id_ = id_;
        result.name_ = name_;
        result.price_ = price_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent) {
          return mergeFrom((com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent other) {
        if (other == com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent.getDefaultInstance()) return this;
        if (!other.getId().isEmpty()) {
          id_ = other.id_;
          onChanged();
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getPrice() != 0D) {
          setPrice(other.getPrice());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object id_ = "";
      /**
       * <code>optional string id = 1;</code>
       */
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string id = 1;</code>
       */
      public Builder setId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string id = 1;</code>
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        id_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 2;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private double price_ ;
      /**
       * <code>optional double price = 3;</code>
       */
      public double getPrice() {
        return price_;
      }
      /**
       * <code>optional double price = 3;</code>
       */
      public Builder setPrice(double value) {
        
        price_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional double price = 3;</code>
       */
      public Builder clearPrice() {
        
        price_ = 0D;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:UpdatePriceEvent)
    }

    // @@protoc_insertion_point(class_scope:UpdatePriceEvent)
    private static final com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent();
    }

    public static com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UpdatePriceEvent>
        PARSER = new com.google.protobuf.AbstractParser<UpdatePriceEvent>() {
      public UpdatePriceEvent parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdatePriceEvent(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UpdatePriceEvent> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UpdatePriceEvent> getParserForType() {
      return PARSER;
    }

    public com.wine.to.up.catalog.service.api.message.UpdatePriceEventOuterClass.UpdatePriceEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdatePriceEvent_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdatePriceEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030update_price_event.proto\032\032kafka_messag" +
      "e_header.proto\";\n\020UpdatePriceEvent\022\n\n\002id" +
      "\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\r\n\005price\030\003 \001(\001B,\n*c" +
      "om.wine.to.up.catalog.service.api.messag" +
      "eb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.wine.to.up.catalog.service.api.message.KafkaMessageHeaderOuterClass.getDescriptor(),
        }, assigner);
    internal_static_UpdatePriceEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UpdatePriceEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdatePriceEvent_descriptor,
        new java.lang.String[] { "Id", "Name", "Price", });
    com.wine.to.up.catalog.service.api.message.KafkaMessageHeaderOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}