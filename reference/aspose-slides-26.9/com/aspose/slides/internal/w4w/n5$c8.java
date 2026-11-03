package com.aspose.slides.internal.w4w;

class n5$c8 extends n5 {
   private n5$c8() {
   }

   @Override
   public int n5(Object var1) {
      return ((Object[])var1).length;
   }

   @Override
   public Object n5(Object var1, int var2) {
      return ((Object[])var1)[var2];
   }

   @Override
   public void n5(Object var1, int var2, Object var3) {
      if (var3 instanceof com.aspose.slides.ms.System.u3) {
         ((Object[])var1)[var2] = com.aspose.slides.ms.System.u3.n5((com.aspose.slides.ms.System.u3)var3);
      } else {
         ((Object[])var1)[var2] = var3;
      }
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/w4w/u3;)V -> ()V
   n5$c8(com.aspose.slides.internal.w4w.u3 recoveredArg0) {
      this();
   }
}
