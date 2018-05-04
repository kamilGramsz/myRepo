package DesignPatterns.Facade_Design_Patterns;

public class OrderFacade {

    private SaveOrderService saveOrderService;
    private SendEmailToUserService sendEmailToUserService;
    private SendSmsToDriverService sendSmsToDriverService;
    private GenerateBillService generateBillService;

    public OrderFacade(SaveOrderService saveOrderService, SendEmailToUserService sendEmailToUserService, SendSmsToDriverService sendSmsToDriverService, GenerateBillService generateBillService) {
        this.saveOrderService = saveOrderService;
        this.sendEmailToUserService = sendEmailToUserService;
        this.sendSmsToDriverService = sendSmsToDriverService;
        this.generateBillService = generateBillService;
    }

    public OrderFacade() {

    }

    public void ProcessOrder(Order order){

        saveOrderService.saveOrder(order);
        sendSmsToDriverService.SendSmsToDriver();
        sendEmailToUserService.SendEmailToUser();
        generateBillService.generateBill();

    }

}
