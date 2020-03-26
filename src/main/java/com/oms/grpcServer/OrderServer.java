package com.oms.grpcServer;

import com.oms.OmsServiceGrpc;
import com.oms.grpcClient.GrpcClient;
import com.oms.model.Order;
import com.oms.repo.OrderRepository;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.logging.Logger;

@GrpcService
public class OrderServer extends OmsServiceGrpc.OmsServiceImplBase{

    @Autowired
    private OrderRepository orderRepository;

    private static Logger log = Logger.getLogger(OrderServer.class.getName());


    @Override
    public void getOrder(com.oms.OrderId request,
                         io.grpc.stub.StreamObserver<com.oms.Order> responseObserver){
        log.info("GRPC Server call for OrderID" + request.getOrderId());
        Optional<Order> order = orderRepository.findById(request.getOrderId());
        responseObserver.onNext(build(order.get()));
        responseObserver.onCompleted();
    }

    private com.oms.Order build(Order order){
        com.oms.Order.Builder builder = com.oms.Order.newBuilder();
        builder.setDirection(order.getDirection());
        builder.setOrderId(order.getOrderID());
        builder.setPrice(order.getPrice());
        builder.setQuantity(order.getQuantity());
        builder.setStatus(order.getStatus());
        builder.setTicker(order.getTicker());
        builder.setType(order.getType());
        return builder.build();
    }


}
