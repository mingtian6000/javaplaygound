// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addressbook.proto

package org.example.proto;

public final class AddressBookProtos {
  private AddressBookProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_protobuf_proto_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_protobuf_proto_Person_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_protobuf_proto_Person_PhoneNumber_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_protobuf_proto_Person_PhoneNumber_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_protobuf_proto_AddressBook_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_protobuf_proto_AddressBook_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021addressbook.proto\022\032org.example.protobu" +
      "f.proto\"\300\002\n\006Person\022\021\n\004name\030\001 \001(\tH\000\210\001\001\022\017\n" +
      "\002id\030\002 \001(\005H\001\210\001\001\022\022\n\005email\030\003 \001(\tH\002\210\001\001\022>\n\006ph" +
      "ones\030\004 \003(\0132..org.example.protobuf.proto." +
      "Person.PhoneNumber\032w\n\013PhoneNumber\022\023\n\006num" +
      "ber\030\001 \001(\tH\000\210\001\001\022?\n\004type\030\002 \001(\0162,.org.examp" +
      "le.protobuf.proto.Person.PhoneTypeH\001\210\001\001B" +
      "\t\n\007_numberB\007\n\005_type\"+\n\tPhoneType\022\n\n\006MOBI" +
      "LE\020\000\022\010\n\004HOME\020\001\022\010\n\004WORK\020\002B\007\n\005_nameB\005\n\003_id" +
      "B\010\n\006_email\"A\n\013AddressBook\0222\n\006people\030\001 \003(" +
      "\0132\".org.example.protobuf.proto.PersonB1\n" +
      "\032org.example.protobuf.protoB\021AddressBook" +
      "ProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_example_protobuf_proto_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_example_protobuf_proto_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_protobuf_proto_Person_descriptor,
        new java.lang.String[] { "Name", "Id", "Email", "Phones", "Name", "Id", "Email", });
    internal_static_org_example_protobuf_proto_Person_PhoneNumber_descriptor =
      internal_static_org_example_protobuf_proto_Person_descriptor.getNestedTypes().get(0);
    internal_static_org_example_protobuf_proto_Person_PhoneNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_protobuf_proto_Person_PhoneNumber_descriptor,
        new java.lang.String[] { "Number", "Type", "Number", "Type", });
    internal_static_org_example_protobuf_proto_AddressBook_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_example_protobuf_proto_AddressBook_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_protobuf_proto_AddressBook_descriptor,
        new java.lang.String[] { "People", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
