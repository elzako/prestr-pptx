package com.aspose.slides.internal.w4w;

import com.aspose.slides.ms.System.z3;

class n5$u3 extends n5 {
   private n5$u3() {
   }

   @Override
   public int n5(Object var1) {
      return ((double[])var1).length;
   }

   @Override
   public Object n5(Object var1, int var2) {
      return ((double[])var1)[var2];
   }

   @Override
   public void n5(Object var1, int var2, Object var3) {
      if (var3.getClass().equals(Character.class)) {
         ((double[])var1)[var2] = ((Character)var3).charValue();
      } else {
         ((double[])var1)[var2] = z3.n3(var3, null);
      }
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/w4w/u3;)V -> ()V
   n5$u3(com.aspose.slides.internal.w4w.u3 recoveredArg0) {
      this();
   }
}
