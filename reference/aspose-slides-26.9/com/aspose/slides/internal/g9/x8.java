package com.aspose.slides.internal.g9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class x8 extends a6 {
   private com.aspose.slides.internal.v2.n5 n5;
   private a6 l6;
   private com.aspose.slides.internal.j0.l6 k5;
   private u3 u3;

   public static String n5() {
      return "DeviceN";
   }

   @Override
   public u3 k5() {
      if (this.u3 == null) {
         int var1 = this.a6();
         float[] var2 = new float[var1];

         for (int var3 = 0; var3 < var1; var3++) {
            var2[var3] = 1.0F;
         }

         this.u3 = new u3(var2, this);
      }

      return this.u3;
   }

   public x8() {
      this.n5 = new com.aspose.slides.internal.v2.n5();
      this.n5.n5(com.aspose.slides.internal.v2.c8.a1);
      this.n5.n5(com.aspose.slides.internal.v2.s7.c8());
      this.n5.n5(com.aspose.slides.internal.v2.s7.c8());
      this.n5.n5(com.aspose.slides.internal.v2.s7.c8());
   }

   public x8(com.aspose.slides.internal.v2.n5 var1) {
      this.n5 = var1;
   }

   @Override
   public String u3() {
      return n5();
   }

   @Override
   public int a6() {
      List var1 = this.l6();
      return var1.size();
   }

   public final List<String> l6() {
      List var1 = null;
      com.aspose.slides.internal.v2.n5 var2 = (com.aspose.slides.internal.v2.n5)this.n5.l6(1);
      if (var2 != null) {
         var1 = com.aspose.slides.internal.e6.n5.k5(var2);
      }

      return var1;
   }

   public final com.aspose.slides.internal.j0.l6 u9() {
      if (this.k5 == null) {
         com.aspose.slides.internal.v2.s7 var1 = this.n5.l6(3);
         if (var1 != null) {
            this.k5 = com.aspose.slides.internal.j0.l6.n5(var1);
         }
      }

      return this.k5;
   }

   public final a6 h0() {
      if (this.l6 == null) {
         com.aspose.slides.internal.v2.s7 var1 = this.n5.l6(2);
         if (var1 != null) {
            this.l6 = u9.n5(var1);
         }
      }

      return this.l6;
   }

   public final com.aspose.slides.internal.v2.n5 n5(List<com.aspose.slides.internal.v2.s7> var1) {
      com.aspose.slides.internal.j0.l6 var2 = this.u9();
      com.aspose.slides.internal.v2.n5 var3 = new com.aspose.slides.internal.v2.n5();
      List$Enumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            com.aspose.slides.internal.v2.s7 var5 = (com.aspose.slides.internal.v2.s7)var4.next();
            var3.n5(var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var2.n5(var3);
   }

   @Override
   public float[] n5(float[] var1) {
      return this.l6(var1);
   }

   private float[] l6(float[] var1) {
      float[] var2 = this.k5.n5(var1);
      return this.l6.n5(var2);
   }
}
