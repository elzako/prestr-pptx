package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;

public class n5 extends s7 {
   private final Object n5 = new Object();
   private static final n5 l6 = new n5();

   public final void n5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("fontsFolder");
      }

      synchronized (this.n5) {
         this.t2().addItem(var1);
         this.u3();
      }
   }

   public final void n5(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("fontData");
      }

      synchronized (this.n5) {
         if (!"OTTO".equals(com.aspose.slides.internal.l7h.j5.z3().l6(var1, 0, 4))) {
            this.s7().addItem(var1);
         } else {
            byte[] var3 = com.aspose.slides.internal.c8e.n5.n5(var1);
            this.s7().addItem(var3);
         }

         this.u3();
      }
   }

   public final void n5() {
      synchronized (this.n5) {
         this.n5(new List<>());
         this.l6(new List<>());
         this.u3();
      }
   }

   public static n5 l6() {
      return l6;
   }

   private n5() {
      super(null, (byte[][])null);
   }
}
