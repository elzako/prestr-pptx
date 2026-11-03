package com.aspose.slides.internal.e1;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.j8;

public class u3 extends com.aspose.slides.internal.v6g.h0<u3> {
   private com.aspose.slides.internal.o9b.w1 n5 = new com.aspose.slides.internal.o9b.w1();
   private com.aspose.slides.internal.o9b.w1 l6 = new com.aspose.slides.internal.o9b.w1();
   private com.aspose.slides.internal.o9b.w1 k5 = new com.aspose.slides.internal.o9b.w1();
   private com.aspose.slides.internal.o9b.w1 u3 = new com.aspose.slides.internal.o9b.w1();

   public u3() {
   }

   public u3(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2, com.aspose.slides.internal.o9b.w1 var3) {
      var1.n5(this.n5);
      this.l6 = new com.aspose.slides.internal.o9b.w1(n5(var1.l6(), var2.l6()), n5(var1.k5(), var2.k5()));
      this.k5 = new com.aspose.slides.internal.o9b.w1(n5(var3.l6(), var2.l6()), n5(var3.k5(), var2.k5()));
      var3.n5(this.u3);
   }

   private static float n5(float var0, float var1) {
      return (var0 + 2.0F * var1) / 3.0F;
   }

   public final com.aspose.slides.internal.o9b.w1 n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.o9b.w1 var1) {
      var1.n5(this.n5);
   }

   public final com.aspose.slides.internal.o9b.w1 l6() {
      return this.l6;
   }

   public final void l6(com.aspose.slides.internal.o9b.w1 var1) {
      var1.n5(this.l6);
   }

   public final com.aspose.slides.internal.o9b.w1 k5() {
      return this.k5;
   }

   public final void k5(com.aspose.slides.internal.o9b.w1 var1) {
      var1.n5(this.k5);
   }

   public final com.aspose.slides.internal.o9b.w1 u3() {
      return this.u3;
   }

   public final void u3(com.aspose.slides.internal.o9b.w1 var1) {
      var1.n5(this.u3);
   }

   public final y1[] a6() {
      return l6(this.u9());
   }

   private static y1[] l6(u3 var0) {
      List var1 = new List();
      n5(var0.u9(), 4, var1);
      y1[] var2 = (y1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(y1.class), var1.size()));

      for (int var3 = 0; var3 < var1.size(); var3++) {
         k5(((u3)var1.get_Item(var3)).u9()).n5(var2[var3]);
      }

      return var2;
   }

   private static y1 k5(u3 var0) {
      y1 var1 = new y1();
      var1.n5(var0.n5().u3());
      var1.l6(n5(var0.l6().u3(), var0.k5().u3()).u3());
      var1.k5(var0.u3().u3());
      return var1;
   }

   private static void n5(u3 var0, int var1, List<u3> var2) {
      u3[] var3 = u3(var0.u9());
      if (var1 > 2) {
         int var4 = var1 / 2;

         for (u3 var8 : var3) {
            n5(var8.u9(), var4, var2);
         }
      } else {
         for (u3 var12 : var3) {
            var2.addItem(var12.u9());
         }
      }
   }

   private static u3[] u3(u3 var0) {
      u3[] var1 = (u3[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(u3.class), 2));
      com.aspose.slides.internal.o9b.w1 var2 = n5(var0.n5().u3(), var0.l6().u3()).u3();
      com.aspose.slides.internal.o9b.w1 var3 = n5(var0.l6().u3(), var0.k5().u3()).u3();
      com.aspose.slides.internal.o9b.w1 var4 = n5(var0.k5().u3(), var0.u3().u3()).u3();
      com.aspose.slides.internal.o9b.w1 var5 = n5(var2.u3(), var3.u3()).u3();
      com.aspose.slides.internal.o9b.w1 var6 = n5(var3.u3(), var4.u3()).u3();
      com.aspose.slides.internal.o9b.w1 var7 = n5(var5.u3(), var6.u3()).u3();
      var1[0] = new u3();
      var1[0].n5(var0.n5().u3());
      var1[0].l6(var2.u3());
      var1[0].k5(var5.u3());
      var1[0].u3(var7.u3());
      var1[1] = new u3();
      var1[1].n5(var7.u3());
      var1[1].l6(var6.u3());
      var1[1].k5(var4.u3());
      var1[1].u3(var0.u3().u3());
      return var1;
   }

   private static com.aspose.slides.internal.o9b.w1 n5(com.aspose.slides.internal.o9b.w1 var0, com.aspose.slides.internal.o9b.w1 var1) {
      return new com.aspose.slides.internal.o9b.w1((var0.l6() + var1.l6()) / 2.0F, (var0.k5() + var1.k5()) / 2.0F);
   }

   public void n5(u3 var1) {
      this.n5.n5(var1.n5);
      this.l6.n5(var1.l6);
      this.k5.n5(var1.k5);
      this.u3.n5(var1.u3);
   }

   public u3 u9() {
      u3 var1 = new u3();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u9();
   }

   private boolean a6(u3 var1) {
      return j8.n5(var1.n5, this.n5) && j8.n5(var1.l6, this.l6) && j8.n5(var1.k5, this.k5) && j8.n5(var1.u3, this.u3);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof u3) ? false : this.a6((u3)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public u3 Clone() {
      return this.u9();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(u3 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
