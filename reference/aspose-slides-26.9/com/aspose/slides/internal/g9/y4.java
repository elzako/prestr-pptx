package com.aspose.slides.internal.g9;

import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class y4 extends n5 {
   private com.aspose.slides.internal.v2.n5 n5;
   private com.aspose.slides.internal.e7.s7 l6;
   private a6 k5;
   private boolean u3 = false;
   private u3 a6;

   @Override
   public u3 k5() {
      if (this.a6 == null) {
         int var1 = this.a6();
         float[] var2 = new float[var1];

         for (int var3 = 0; var3 < var1; var3++) {
            var2[var3] = q1.n5(0.0F, this.n5(var3).n5());
         }

         this.a6 = new u3(var2, this);
      }

      return this.a6;
   }

   @Override
   public com.aspose.slides.internal.v2.n5 n5() {
      return this.n5;
   }

   public static String l6() {
      return "ICCBased";
   }

   public y4(com.aspose.slides.internal.v2.n5 var1) {
      this.n5 = var1;
      this.l6 = new com.aspose.slides.internal.e7.s7((com.aspose.slides.internal.v2.x8)var1.l6(1));
      this.h0();
   }

   private static void n5(com.aspose.slides.internal.v2.n5 var0) {
      if (var0.n5() < 2) {
         throw new IOException("ICCBased colorspace array must have two elements");
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var0.l6(1), com.aspose.slides.internal.v2.x8.class)) {
         throw new IOException("ICCBased colorspace array must have a stream as second element");
      }
   }

   public static y4 n5(com.aspose.slides.internal.v2.n5 var0, com.aspose.slides.internal.e7.t2 var1) {
      n5(var0);
      com.aspose.slides.internal.v2.s7 var2 = var0.k5(1);
      com.aspose.slides.internal.v2.s7 var3 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.v2.s7.class)) {
         var3 = var2;
      }

      if (var3 != null && var1 != null && var1.a6() != null) {
         a6 var4 = var1.a6().n5(var3);
         if (com.aspose.slides.internal.v6g.k5.l6(var4, y4.class)) {
            return (y4)var4;
         }
      }

      y4 var5 = new y4(var0);
      if (var3 != null && var1 != null && var1.a6() != null) {
         var1.a6().n5(var3, var5);
      }

      return var5;
   }

   public final com.aspose.slides.internal.e6.l6 n5(int var1) {
      com.aspose.slides.internal.v2.n5 var2 = ((com.aspose.slides.internal.v2.k5)this.l6.t2()).c8(com.aspose.slides.internal.v2.c8.p4l);
      return var2 != null && var2.n5() >= this.a6() * 2 ? new com.aspose.slides.internal.e6.l6(var2, var1) : new com.aspose.slides.internal.e6.l6();
   }

   private void h0() {
      try {
         this.c8();
      } catch (Exception var2) {
      }
   }

   private void c8() {
      this.k5 = this.u9();
      if (this.k5.equals(n3.n5)) {
         this.u3 = true;
      }

      this.a6 = this.k5.k5();
   }

   public final a6 u9() {
      com.aspose.slides.internal.v2.s7 var1 = ((com.aspose.slides.internal.v2.k5)this.l6.t2()).u9(com.aspose.slides.internal.v2.c8.h0);
      com.aspose.slides.internal.v2.n5 var2;
      if (var1 == null) {
         var2 = new com.aspose.slides.internal.v2.n5();
         int var3 = this.a6();
         com.aspose.slides.internal.v2.c8 var4;
         switch (var3) {
            case 1:
               var4 = com.aspose.slides.internal.v2.c8.y9;
               break;
            case 2:
            default:
               throw new IOException(d1.n5(new String[]{"Unknown color space number of components:", a3.l6(var3)}));
            case 3:
               var4 = com.aspose.slides.internal.v2.c8.w3;
               break;
            case 4:
               var4 = com.aspose.slides.internal.v2.c8.f4;
         }

         var2.n5(var4);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.v2.n5.class)) {
         var2 = (com.aspose.slides.internal.v2.n5)var1;
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.v2.c8.class)) {
            throw new IOException("Error: expected CosArray or CosName");
         }

         var2 = new com.aspose.slides.internal.v2.n5();
         var2.n5(var1);
      }

      return com.aspose.slides.internal.g9.a6.n5(var2);
   }

   @Override
   public String u3() {
      return l6();
   }

   @Override
   public int a6() {
      com.aspose.slides.internal.v2.x8 var1 = this.l6.l6();
      return var1.t2(com.aspose.slides.internal.v2.c8.v1);
   }

   @Override
   public float[] n5(float[] var1) {
      return this.u3 ? var1 : this.k5.n5(var1);
   }
}
