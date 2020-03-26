package com.oms.grpcClient;

import com.oms.OmsServiceGrpc;
import com.oms.Order;
import com.oms.OrderId;
import com.oms.controller.OrderController;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@Component
public class GrpcClient {

    private OmsServiceGrpc.OmsServiceBlockingStub stub;

    private static Logger log = Logger.getLogger(GrpcClient.class.getName());

    @PostConstruct
    private void init() {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 9090).usePlaintext().build();

        stub  = OmsServiceGrpc.newBlockingStub(managedChannel);
    }

    public Order getOrder(int orderID){
        log.info("GRPC Client");
        OrderId orderId = OrderId.newBuilder().setOrderId(orderID).build();
        Order order = stub.getOrder(orderId);
        return order;

    }
}
