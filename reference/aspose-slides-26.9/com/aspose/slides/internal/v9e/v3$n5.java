package com.aspose.slides.internal.v9e;

import java.util.Comparator;

class v3$n5 implements Comparator {
   private v3$n5() {
   }

   @Override
   public final int compare(Object x, Object y) {
      w2 var3 = (w2)x;
      w2 var4 = (w2)y;
      if (var3.k5() == var4.k5()) {
         return var3.a6() - var4.a6();
      } else {
         return var3.k5() > var4.k5() ? 1 : -1;
      }
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/v9e/g7;)V -> ()V
   v3$n5(com.aspose.slides.internal.v9e.g7 recoveredArg0) {
      this();
   }
}
