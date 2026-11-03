package com.aspose.slides;

public class Metered {
   public void setMeteredKey(String publicKey, String privateKey) {
      if (publicKey != null && privateKey != null && publicKey.length() != 0 && privateKey.length() != 0) {
         com.aspose.slides.internal.n8e.f2 var3 = new com.aspose.slides.internal.n8e.f2();
         boolean var4 = var3.n5(publicKey, privateKey);
         if (!var4) {
            throw new IllegalStateException("Authentication failed.");
         }
      } else {
         throw new IllegalArgumentException("Public key and private key should not be empty.");
      }
   }

   public static double getConsumptionQuantity() {
      return com.aspose.slides.internal.n8e.f2.n5().u3();
   }

   public static double getConsumptionCredit() throws Exception {
      return com.aspose.slides.internal.n8e.f2.n5().a6();
   }

   public static boolean isMeteredLicensed() {
      boolean var0 = false;
      Presentation var1 = new Presentation();

      try {
         ISlide var2 = var1.getSlides().addEmptySlide(var1.getLayoutSlides().getByType((byte)11));
         IAutoShape var3 = var2.getShapes().addAutoShape(5, 10.0F, 10.0F, 200.0F, 100.0F);
         var3.getTextFrame().setText(com.aspose.slides.ms.System.d1.n5("", 500, 'a'));
         var0 = var3.getTextFrame().getText().length() == 500;
      } finally {
         var1.dispose();
      }

      return var0;
   }
}
