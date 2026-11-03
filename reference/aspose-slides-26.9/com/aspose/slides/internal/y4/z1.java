package com.aspose.slides.internal.y4;

import com.aspose.slides.internal.l7h.a5;

public final class z1 {
   private com.aspose.slides.internal.k5.u9[] n5;
   private short[] l6;
   private com.aspose.slides.internal.h0.h0 k5;

   public z1(com.aspose.slides.internal.h0.h0 var1) {
      this.k5 = var1;
      int var2 = var1.a6() + 1;
      this.n5 = new com.aspose.slides.internal.k5.u9[var2];
      this.l6 = new short[var2];
   }

   public final com.aspose.slides.internal.k5.u9 n5(int var1) {
      return this.n5[var1];
   }

   public final void n5(int var1, com.aspose.slides.internal.k5.u9 var2) {
      this.n5[var1] = var2;
   }

   public final boolean l6(int var1) {
      return (this.l6[var1] & 1) != 0;
   }

   public final void n5(int var1, boolean var2) {
      if (var2) {
         this.l6[var1] = (short)(this.l6[var1] | 1);
      } else {
         this.l6[var1] = (short)(this.l6[var1] & -2);
      }
   }

   public final boolean k5(int var1) {
      return (this.l6[var1] & 2) != 0;
   }

   public final void l6(int var1, boolean var2) {
      if (var2) {
         this.l6[var1] = (short)(this.l6[var1] | 2);
      } else {
         this.l6[var1] = (short)(this.l6[var1] & -3);
      }
   }

   public final boolean u3(int var1) {
      return (this.l6[var1] & 4) != 0;
   }

   public final void k5(int var1, boolean var2) {
      if (var2) {
         this.l6[var1] = (short)(this.l6[var1] | 4);
      } else {
         this.l6[var1] = (short)(this.l6[var1] & -5);
      }
   }

   @Override
   public String toString() {
      a5 var1 = new a5();

      for (int var2 = 0; var2 < this.n5.length; var2++) {
         com.aspose.slides.internal.k5.u9 var3 = this.n5[var2];
         if (var3 != null) {
            String var4 = this.k5.l6(var2);
            var1.n5(var4);
            var1.n5(": ");
            if ("font-family".equals(var4)) {
               com.aspose.slides.internal.k5.h0 var5 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.k5.h0.class);
               if (var5 != null) {
                  if (var5.n5() > 0) {
                     var1.n5(var5.n5(0).u9());
                  }

                  for (int var6 = 1; var6 < var5.n5(); var6++) {
                     var1.n5(", ");
                     var1.n5(var5.n5(var6).u9());
                  }
               }
            } else {
               var1.n5(var3);
            }

            if (this.l6(var2)) {
               var1.n5(" !important");
            }

            var1.n5(";\n");
         }
      }

      return var1.toString();
   }
}
