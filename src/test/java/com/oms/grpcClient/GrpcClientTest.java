package com.oms.grpcClient;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class GrpcClientTest {

    @InjectMocks
    private GrpcClient grpcClient;

    @Test
    public void test(){
        //Assertions.assertNotNull(grpcClient.getOrder(123));
    }
}
