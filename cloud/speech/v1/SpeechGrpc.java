package com.google.cloud.speech.v1;

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
 * <pre>
 * Service that implements Google Cloud Speech API.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: google/speech/v1/cloud_speech.proto")
public final class SpeechGrpc {

  private SpeechGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.speech.v1.Speech";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.cloud.speech.v1.RecognizeRequest,
      com.google.cloud.speech.v1.RecognizeResponse> getRecognizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Recognize",
      requestType = com.google.cloud.speech.v1.RecognizeRequest.class,
      responseType = com.google.cloud.speech.v1.RecognizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.speech.v1.RecognizeRequest,
      com.google.cloud.speech.v1.RecognizeResponse> getRecognizeMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.speech.v1.RecognizeRequest, com.google.cloud.speech.v1.RecognizeResponse> getRecognizeMethod;
    if ((getRecognizeMethod = SpeechGrpc.getRecognizeMethod) == null) {
      synchronized (SpeechGrpc.class) {
        if ((getRecognizeMethod = SpeechGrpc.getRecognizeMethod) == null) {
          SpeechGrpc.getRecognizeMethod = getRecognizeMethod = 
              io.grpc.MethodDescriptor.<com.google.cloud.speech.v1.RecognizeRequest, com.google.cloud.speech.v1.RecognizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.cloud.speech.v1.Speech", "Recognize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.cloud.speech.v1.RecognizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.cloud.speech.v1.RecognizeResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getRecognizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.speech.v1.LongRunningRecognizeRequest,
      com.google.longrunning.Operation> getLongRunningRecognizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LongRunningRecognize",
      requestType = com.google.cloud.speech.v1.LongRunningRecognizeRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.speech.v1.LongRunningRecognizeRequest,
      com.google.longrunning.Operation> getLongRunningRecognizeMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.speech.v1.LongRunningRecognizeRequest, com.google.longrunning.Operation> getLongRunningRecognizeMethod;
    if ((getLongRunningRecognizeMethod = SpeechGrpc.getLongRunningRecognizeMethod) == null) {
      synchronized (SpeechGrpc.class) {
        if ((getLongRunningRecognizeMethod = SpeechGrpc.getLongRunningRecognizeMethod) == null) {
          SpeechGrpc.getLongRunningRecognizeMethod = getLongRunningRecognizeMethod = 
              io.grpc.MethodDescriptor.<com.google.cloud.speech.v1.LongRunningRecognizeRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.cloud.speech.v1.Speech", "LongRunningRecognize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.cloud.speech.v1.LongRunningRecognizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getLongRunningRecognizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.speech.v1.StreamingRecognizeRequest,
      com.google.cloud.speech.v1.StreamingRecognizeResponse> getStreamingRecognizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamingRecognize",
      requestType = com.google.cloud.speech.v1.StreamingRecognizeRequest.class,
      responseType = com.google.cloud.speech.v1.StreamingRecognizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.cloud.speech.v1.StreamingRecognizeRequest,
      com.google.cloud.speech.v1.StreamingRecognizeResponse> getStreamingRecognizeMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.speech.v1.StreamingRecognizeRequest, com.google.cloud.speech.v1.StreamingRecognizeResponse> getStreamingRecognizeMethod;
    if ((getStreamingRecognizeMethod = SpeechGrpc.getStreamingRecognizeMethod) == null) {
      synchronized (SpeechGrpc.class) {
        if ((getStreamingRecognizeMethod = SpeechGrpc.getStreamingRecognizeMethod) == null) {
          SpeechGrpc.getStreamingRecognizeMethod = getStreamingRecognizeMethod = 
              io.grpc.MethodDescriptor.<com.google.cloud.speech.v1.StreamingRecognizeRequest, com.google.cloud.speech.v1.StreamingRecognizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "google.cloud.speech.v1.Speech", "StreamingRecognize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.cloud.speech.v1.StreamingRecognizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.cloud.speech.v1.StreamingRecognizeResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getStreamingRecognizeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpeechStub newStub(io.grpc.Channel channel) {
    return new SpeechStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpeechBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SpeechBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpeechFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SpeechFutureStub(channel);
  }

  /**
   * <pre>
   * Service that implements Google Cloud Speech API.
   * </pre>
   */
  public static abstract class SpeechImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Performs synchronous speech recognition: receive results after all audio
     * has been sent and processed.
     * </pre>
     */
    public void recognize(com.google.cloud.speech.v1.RecognizeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.speech.v1.RecognizeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRecognizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Performs asynchronous speech recognition: receive results via the
     * google.longrunning.Operations interface. Returns either an
     * `Operation.error` or an `Operation.response` which contains
     * a `LongRunningRecognizeResponse` message.
     * </pre>
     */
    public void longRunningRecognize(com.google.cloud.speech.v1.LongRunningRecognizeRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getLongRunningRecognizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Performs bidirectional streaming speech recognition: receive results while
     * sending audio. This method is only available via the gRPC API (not REST).
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.google.cloud.speech.v1.StreamingRecognizeRequest> streamingRecognize(
        io.grpc.stub.StreamObserver<com.google.cloud.speech.v1.StreamingRecognizeResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamingRecognizeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRecognizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.speech.v1.RecognizeRequest,
                com.google.cloud.speech.v1.RecognizeResponse>(
                  this, METHODID_RECOGNIZE)))
          .addMethod(
            getLongRunningRecognizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.speech.v1.LongRunningRecognizeRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_LONG_RUNNING_RECOGNIZE)))
          .addMethod(
            getStreamingRecognizeMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.google.cloud.speech.v1.StreamingRecognizeRequest,
                com.google.cloud.speech.v1.StreamingRecognizeResponse>(
                  this, METHODID_STREAMING_RECOGNIZE)))
          .build();
    }
  }

  /**
   * <pre>
   * Service that implements Google Cloud Speech API.
   * </pre>
   */
  public static final class SpeechStub extends io.grpc.stub.AbstractStub<SpeechStub> {
    private SpeechStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeechStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeechStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeechStub(channel, callOptions);
    }

    /**
     * <pre>
     * Performs synchronous speech recognition: receive results after all audio
     * has been sent and processed.
     * </pre>
     */
    public void recognize(com.google.cloud.speech.v1.RecognizeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.speech.v1.RecognizeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRecognizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Performs asynchronous speech recognition: receive results via the
     * google.longrunning.Operations interface. Returns either an
     * `Operation.error` or an `Operation.response` which contains
     * a `LongRunningRecognizeResponse` message.
     * </pre>
     */
    public void longRunningRecognize(com.google.cloud.speech.v1.LongRunningRecognizeRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLongRunningRecognizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Performs bidirectional streaming speech recognition: receive results while
     * sending audio. This method is only available via the gRPC API (not REST).
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.google.cloud.speech.v1.StreamingRecognizeRequest> streamingRecognize(
        io.grpc.stub.StreamObserver<com.google.cloud.speech.v1.StreamingRecognizeResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamingRecognizeMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Service that implements Google Cloud Speech API.
   * </pre>
   */
  public static final class SpeechBlockingStub extends io.grpc.stub.AbstractStub<SpeechBlockingStub> {
    private SpeechBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeechBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeechBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeechBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Performs synchronous speech recognition: receive results after all audio
     * has been sent and processed.
     * </pre>
     */
    public com.google.cloud.speech.v1.RecognizeResponse recognize(com.google.cloud.speech.v1.RecognizeRequest request) {
      return blockingUnaryCall(
          getChannel(), getRecognizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Performs asynchronous speech recognition: receive results via the
     * google.longrunning.Operations interface. Returns either an
     * `Operation.error` or an `Operation.response` which contains
     * a `LongRunningRecognizeResponse` message.
     * </pre>
     */
    public com.google.longrunning.Operation longRunningRecognize(com.google.cloud.speech.v1.LongRunningRecognizeRequest request) {
      return blockingUnaryCall(
          getChannel(), getLongRunningRecognizeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service that implements Google Cloud Speech API.
   * </pre>
   */
  public static final class SpeechFutureStub extends io.grpc.stub.AbstractStub<SpeechFutureStub> {
    private SpeechFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeechFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeechFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeechFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Performs synchronous speech recognition: receive results after all audio
     * has been sent and processed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.speech.v1.RecognizeResponse> recognize(
        com.google.cloud.speech.v1.RecognizeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRecognizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Performs asynchronous speech recognition: receive results via the
     * google.longrunning.Operations interface. Returns either an
     * `Operation.error` or an `Operation.response` which contains
     * a `LongRunningRecognizeResponse` message.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> longRunningRecognize(
        com.google.cloud.speech.v1.LongRunningRecognizeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLongRunningRecognizeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECOGNIZE = 0;
  private static final int METHODID_LONG_RUNNING_RECOGNIZE = 1;
  private static final int METHODID_STREAMING_RECOGNIZE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SpeechImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpeechImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECOGNIZE:
          serviceImpl.recognize((com.google.cloud.speech.v1.RecognizeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.speech.v1.RecognizeResponse>) responseObserver);
          break;
        case METHODID_LONG_RUNNING_RECOGNIZE:
          serviceImpl.longRunningRecognize((com.google.cloud.speech.v1.LongRunningRecognizeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
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
        case METHODID_STREAMING_RECOGNIZE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamingRecognize(
              (io.grpc.stub.StreamObserver<com.google.cloud.speech.v1.StreamingRecognizeResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SpeechGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getRecognizeMethod())
              .addMethod(getLongRunningRecognizeMethod())
              .addMethod(getStreamingRecognizeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
