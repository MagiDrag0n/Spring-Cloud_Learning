package com.sourceCode;

//public class RoundRobinRule extends AbstractLoadBalancerRule {
//    private AtomicInteger nextServerCyclicCounter;
//    private static final boolean AVAILABLE_ONLY_SERVERS = true;
//    private static final boolean ALL_SERVERS = false;
//    private static Logger log = LoggerFactory.getLogger(RoundRobinRule.class);
//
//    public RoundRobinRule() {
//        this.nextServerCyclicCounter = new AtomicInteger(0);
//    }
//
//    public RoundRobinRule(ILoadBalancer lb) {
//        this();
//        this.setLoadBalancer(lb);
//    }
//
//    public Server choose(ILoadBalancer lb, Object key) {
//        if (lb == null) {
//            log.warn("no load balancer");
//            return null;
//        } else {
//            Server server = null;
//            int count = 0;
//
//            while(true) {
//                if (server == null && count++ < 10) {
//                    List<Server> reachableServers = lb.getReachableServers();
//                    List<Server> allServers = lb.getAllServers();
//                    int upCount = reachableServers.size();
//                    int serverCount = allServers.size();
//                    if (upCount != 0 && serverCount != 0) {
//                        int nextServerIndex = this.incrementAndGetModulo(serverCount);
//                        server = (Server)allServers.get(nextServerIndex);
//                        if (server == null) {
//                            Thread.yield();
//                        } else {
//                            if (server.isAlive() && server.isReadyToServe()) {
//                                return server;
//                            }
//
//                            server = null;
//                        }
//                        continue;
//                    }
//
//                    log.warn("No up servers available from load balancer: " + lb);
//                    return null;
//                }
//
//                if (count >= 10) {
//                    log.warn("No available alive servers after 10 tries from load balancer: " + lb);
//                }
//
//                return server;
//            }
//        }
//    }
//
//    private int incrementAndGetModulo(int modulo) {
//        int current;
//        int next;
//        do {
//            current = this.nextServerCyclicCounter.get();
//            next = (current + 1) % modulo;
//        } while(!this.nextServerCyclicCounter.compareAndSet(current, next));
//
//        return next;
//    }
//
//    public Server choose(Object key) {
//        return this.choose(this.getLoadBalancer(), key);
//    }
//
//    public void initWithNiwsConfig(IClientConfig clientConfig) {
//    }
//}
