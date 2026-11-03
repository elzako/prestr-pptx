package com.aspose.slides.internal.w4w;

import com.aspose.slides.ms.System.z3;

class n5$a6 extends n5 {
   private n5$a6() {
   }

   @Override
   public int n5(Object var1) {
      return ((float[])var1).length;
   }

   @Override
   public Object n5(Object var1, int var2) {
      return ((float[])var1)[var2];
   }

   @Override
   public void n5(Object var1, int var2, Object var3) {
      if (var3.getClass().equals(Character.class)) {
         ((float[])var1)[var2] = ((Character)var3).charValue();
      } else {
         ((float[])var1)[var2] = z3.x8(var3, null);
      }
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/w4w/u3;)V -> ()V
   n5$a6(com.aspose.slides.internal.w4w.u3 recoveredArg0) {
      this();
   }
}
