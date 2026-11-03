package com.aspose.slides.internal.r4;

import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.o8m.l4;

class z1$n5 {
   private i1 n5;
   private int l6;
   private String k5;
   private byte[] u3;

   public final i1 n5() {
      return this.n5;
   }

   public final int l6() {
      return this.l6;
   }

   public final String k5() {
      return this.k5;
   }

   public z1$n5(i1 var1, int var2, String var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public z1$n5(i1 var1, int var2, String var3, byte[] var4) {
      this(var1, var2, var3);
      this.u3 = var4;
   }

   public final boolean n5(byte[] var1) {
      if (this.u3 == null) {
         com.aspose.slides.internal.z0k.t4 var2 = this.n5.y1().l6();

         try {
            l4 var3 = l4.a6();

            try {
               this.u3 = var3.n5(var2);
            } finally {
               if (var3 != null) {
                  var3.dispose();
               }
            }
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      }

      if (var1.length != this.u3.length) {
         return false;
      }

      for (int var12 = 0; var12 < var1.length; var12++) {
         if ((var1[var12] & 255) != (this.u3[var12] & 255)) {
            return false;
         }
      }

      return true;
   }
}
