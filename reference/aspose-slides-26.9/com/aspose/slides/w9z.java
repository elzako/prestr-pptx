package com.aspose.slides;

class w9z {
   private double n5;
   private double l6;
   private double k5;
   private double u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;

   public w9z(String var1) {
      com.aspose.slides.internal.r7c.c8 var2 = new com.aspose.slides.internal.r7c.c8("[-]?[0-9]+([^ ,\\)`]*)");
      String var3 = var1;

      for (int var4 = 0; var4 < 4; var4++) {
         com.aspose.slides.internal.r7c.u3 var5 = var2.l6(var3);
         if (!var5.u3()) {
            break;
         }

         int var6 = var5.n5() + var5.l6();
         var3 = com.aspose.slides.ms.System.d1.l6(var3, var6, var3.length() - var6);
         switch (var4) {
            case 0:
               this.a6 = com.aspose.slides.ms.System.d1.c8(var5.k5(), "in") > 0;
               this.n5 = com.aspose.slides.ms.System.d2.n5(
                  com.aspose.slides.ms.System.d1.l6(var5.k5(), 0, var5.k5().length() - 2), com.aspose.slides.internal.x7n.l6.k5()
               );
               break;
            case 1:
               this.h0 = com.aspose.slides.ms.System.d1.c8(var5.k5(), "in") > 0;
               this.k5 = com.aspose.slides.ms.System.d2.n5(
                  com.aspose.slides.ms.System.d1.l6(var5.k5(), 0, var5.k5().length() - 2), com.aspose.slides.internal.x7n.l6.k5()
               );
               break;
            case 2:
               this.u9 = com.aspose.slides.ms.System.d1.c8(var5.k5(), "in") > 0;
               this.l6 = com.aspose.slides.ms.System.d2.n5(
                  com.aspose.slides.ms.System.d1.l6(var5.k5(), 0, var5.k5().length() - 2), com.aspose.slides.internal.x7n.l6.k5()
               );
               break;
            case 3:
               this.c8 = com.aspose.slides.ms.System.d1.c8(var5.k5(), "in") > 0;
               this.u3 = com.aspose.slides.ms.System.d2.n5(
                  com.aspose.slides.ms.System.d1.l6(var5.k5(), 0, var5.k5().length() - 2), com.aspose.slides.internal.x7n.l6.k5()
               );
         }
      }
   }

   public final double n5() {
      return this.n5;
   }

   public final double l6() {
      return this.l6;
   }

   public final double k5() {
      return this.k5;
   }

   public final double u3() {
      return this.u3;
   }

   public final boolean a6() {
      return this.a6;
   }

   public final boolean u9() {
      return this.c8;
   }

   public final boolean h0() {
      return this.h0;
   }

   public final boolean c8() {
      return this.u9;
   }

   public final boolean t2() {
      return this.n5 == 0.0 && this.l6 == 0.0 && this.k5 == 0.0 && this.u3 == 0.0;
   }
}
