package com.oms;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: osmservice.proto")
public final class OmsServiceGrpc {

  private OmsServiceGrpc() {}

  public static final String SERVICE_NAME = "OmsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.oms.Order,
      com.oms.OrderId> getCreateOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createOrder",
      requestType = com.oms.Order.class,
      responseType = com.oms.OrderId.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oms.Order,
      com.oms.OrderId> getCreateOrderMethod() {
    io.grpc.MethodDescriptor<com.oms.Order, com.oms.OrderId> getCreateOrderMethod;
    if ((getCreateOrderMethod = OmsServiceGrpc.getCreateOrderMethod) == null) {
      synchronized (OmsServiceGrpc.class) {
        if ((getCreateOrderMethod = OmsServiceGrpc.getCreateOrderMethod) == null) {
          OmsServiceGrpc.getCreateOrderMethod = getCreateOrderMethod =
              io.grpc.MethodDescriptor.<com.oms.Order, com.oms.OrderId>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oms.Order.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oms.OrderId.getDefaultInstance()))
              .setSchemaDescriptor(new OmsServiceMethodDescriptorSupplier("createOrder"))
              .build();
        }
      }
    }
    return getCreateOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oms.OrderId,
      com.oms.Order> getGetOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOrder",
      requestType = com.oms.OrderId.class,
      responseType = com.oms.Order.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oms.OrderId,
      com.oms.Order> getGetOrderMethod() {
    io.grpc.MethodDescriptor<com.oms.OrderId, com.oms.Order> getGetOrderMethod;
    if ((getGetOrderMethod = OmsServiceGrpc.getGetOrderMethod) == null) {
      synchronized (OmsServiceGrpc.class) {
        if ((getGetOrderMethod = OmsServiceGrpc.getGetOrderMethod) == null) {
          OmsServiceGrpc.getGetOrderMethod = getGetOrderMethod =
              io.grpc.MethodDescriptor.<com.oms.OrderId, com.oms.Order>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oms.OrderId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oms.Order.getDefaultInstance()))
              .setSchemaDescriptor(new OmsServiceMethodDescriptorSupplier("getOrder"))
              .build();
        }
      }
    }
    return getGetOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OmsServiceStub newStub(io.grpc.Channel channel) {
    return new OmsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OmsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OmsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OmsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OmsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class OmsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createOrder(com.oms.Order request,
        io.grpc.stub.StreamObserver<com.oms.OrderId> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateOrderMethod(), responseObserver);
    }

    /**
     */
    public void getOrder(com.oms.OrderId request,
        io.grpc.stub.StreamObserver<com.oms.Order> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.oms.Order,
                com.oms.OrderId>(
                  this, METHODID_CREATE_ORDER)))
          .addMethod(
            getGetOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.oms.OrderId,
                com.oms.Order>(
                  this, METHODID_GET_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class OmsServiceStub extends io.grpc.stub.AbstractStub<OmsServiceStub> {
    private OmsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OmsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OmsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OmsServiceStub(channel, callOptions);
    }

    /**
     */
    public void createOrder(com.oms.Order request,
        io.grpc.stub.StreamObserver<com.oms.OrderId> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrder(com.oms.OrderId request,
        io.grpc.stub.StreamObserver<com.oms.Order> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OmsServiceBlockingStub extends io.grpc.stub.AbstractStub<OmsServiceBlockingStub> {
    private OmsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OmsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OmsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OmsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.oms.OrderId createOrder(com.oms.Order request) {
      return blockingUnaryCall(
          getChannel(), getCreateOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.oms.Order getOrder(com.oms.OrderId request) {
      return blockingUnaryCall(
          getChannel(), getGetOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OmsServiceFutureStub extends io.grpc.stub.AbstractStub<OmsServiceFutureStub> {
    private OmsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OmsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OmsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OmsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oms.OrderId> createOrder(
        com.oms.Order request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oms.Order> getOrder(
        com.oms.OrderId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ORDER = 0;
  private static final int METHODID_GET_ORDER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OmsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OmsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ORDER:
          serviceImpl.createOrder((com.oms.Order) request,
              (io.grpc.stub.StreamObserver<com.oms.OrderId>) responseObserver);
          break;
        case METHODID_GET_ORDER:
          serviceImpl.getOrder((com.oms.OrderId) request,
              (io.grpc.stub.StreamObserver<com.oms.Order>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class OmsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OmsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.oms.Osmservice.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OmsService");
    }
  }

  private static final class OmsServiceFileDescriptorSupplier
      extends OmsServiceBaseDescriptorSupplier {
    OmsServiceFileDescriptorSupplier() {}
  }

  private static final class OmsServiceMethodDescriptorSupplier
      extends OmsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OmsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (OmsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OmsServiceFileDescriptorSupplier())
              .addMethod(getCreateOrderMethod())
              .addMethod(getGetOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
