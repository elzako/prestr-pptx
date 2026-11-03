package com.aspose.slides.internal.l6z;

import com.aspose.slides.exceptions.ArgumentNullException;

public class z6 {
   private final int n5;
   private v0 l6;

   z6(int var1, String var2) {
      this.n5 = var1;
      this.l6 = new v0();
      this.l6.n5(var2);
   }

   z6(com.aspose.slides.internal.x1.u9 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.n5 = var2;
      this.l6 = new v0();
      String var3 = k5.n5(var1.l6(), var2);
      com.aspose.slides.internal.z0k.w1 var4 = new com.aspose.slides.internal.z0k.w1(var3);

      try {
         this.l6.n5(var4);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   final void n5(com.aspose.slides.internal.x1.u9 var1) {
      com.aspose.slides.internal.z0k.r4 var2 = new com.aspose.slides.internal.z0k.r4();

      try {
         this.l6.n5(var2);
         String var3 = var2.toString();
         com.aspose.slides.internal.l7h.j5 var4 = com.aspose.slides.internal.n2d.x8.n5(this.n5);
         byte[] var5 = var4.u3(var3);
         if (!var1.n5(var5)) {
            throw new s4("Could not write project properties");
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   final v0 n5() {
      return this.l6;
   }
}
