package pers.xzj.testRPC;

import java.net.ServerSocket;

public class RPCClient {

    public static void main(String[] args) {
        sendMsg("aaa");
        sendMsg("bbb");
        sendMsg("ccc");
    }

    @Path(ipAndPort = "127.0.0.1:6060")
    private static void sendMsg(String msg){
//        ServerService ss = new ServerServiceImpl();
//        ss.get()
        ServerService clientService = (ServerService) ClientServiceProxyFactory.getClientService(ServerService.class);
        System.out.println("key:" + msg + ",value:" + clientService.get(msg));
    }
}

