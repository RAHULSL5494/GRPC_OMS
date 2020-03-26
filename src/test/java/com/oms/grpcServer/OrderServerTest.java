package com.oms.grpcServer;

import com.oms.OrderId;
import com.oms.model.Order;
import com.oms.repo.OrderRepository;
import io.grpc.stub.StreamObserver;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class OrderServerTest {

    @InjectMocks
    private OrderServer orderServer;

    @Mock
    private OrderRepository orderRepository;

    @Test
    public void test(){
        Order order = buildOrder();
        OrderId request = OrderId.newBuilder().setOrderId(123).build();
        Mockito.when(orderRepository.findById(request.getOrderId())).thenReturn(Optional.of(order));
        orderServer.getOrder(request, new StreamObserver<com.oms.Order>() {
            @Override
            public void onNext(com.oms.Order value) {

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

            }
        });

    }

    private Order buildOrder() {
        Order order = new Order();
        order.setOrderID(123);
        order.setDirection("E");
        order.setPrice(500);
        order.setQuantity(100);
        order.setStatus("Open");
        order.setTicker("AMZN");
        order.setType("online");

        return order;
    }

}
