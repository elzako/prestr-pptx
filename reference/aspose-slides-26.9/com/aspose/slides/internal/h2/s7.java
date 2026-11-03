package com.aspose.slides.internal.h2;

import com.aspose.slides.Collections.Generic.List;

public class s7 {
   private int k5 = -1;
   private w1 u3;
   private final z8 a6;
   private final z8 u9;
   private final z8 h0;
   private final z8 c8;
   private final z8 t2;
   public final com.aspose.slides.internal.f2.k5 n5;
   public final com.aspose.slides.internal.f2.u3 l6;

   private s7(w1 var1, z8 var2, z8 var3, z8 var4, z8 var5, z8 var6, com.aspose.slides.internal.f2.k5 var7, com.aspose.slides.internal.f2.u3 var8) {
      this.u3 = var1;
      this.a6 = var2;
      this.u9 = var3;
      this.h0 = var4;
      this.c8 = var5;
      this.t2 = var6;
      this.n5 = var7;
      this.l6 = var8;
   }

   public static s7 n5(com.aspose.slides.internal.e5.w1 var0) {
      w1 var1 = (w1)var0.u3(101);
      z8 var2 = (z8)var0.u3(102);
      z8 var3 = (z8)var0.u3(105);
      z8 var4 = (z8)var0.u3(106);
      z8 var5 = (z8)var0.u3(107);
      z8 var6 = (z8)var0.u3(108);
      com.aspose.slides.internal.f2.u3 var7 = var0.u3(104).u9();
      com.aspose.slides.internal.f2.k5 var8 = var0.u3(103).c8();
      return new s7(var1, var2, var3, var4, var5, var6, var8, var7);
   }

   private String[] u3() {
      List var1 = this.u3.t_();
      String[] var2 = new String[var1.size()];
      int var3 = 0;

      for (int var4 = var1.size(); var3 < var4; var3++) {
         var2[var3] = ((a5)var1.get_Item(var3)).j_();
      }

      return var2;
   }

   public final int n5() {
      return this.h0.a6();
   }

   public final int l6() {
      return this.c8.a6();
   }

   public final int k5() {
      return this.t2.a6();
   }

   public final com.aspose.slides.internal.v0.s7[] n5(com.aspose.slides.internal.v0.h0 var1) {
      short var2;
      switch (this.t2.a6()) {
         case 169:
            var2 = 100;
            break;
         case 170:
            var2 = 200;
            break;
         case 171:
            var2 = 300;
            break;
         case 172:
            var2 = 400;
            break;
         case 173:
            var2 = 500;
            break;
         case 174:
            var2 = 600;
            break;
         case 175:
            var2 = 700;
            break;
         case 176:
            var2 = 800;
            break;
         case 177:
            var2 = 900;
            break;
         default:
            var2 = 400;
      }

      String var3;
      switch (this.h0.a6()) {
         case 164:
            var3 = "italic";
            break;
         case 165:
            var3 = "oblique";
            break;
         case 166:
            var3 = "backslant";
            break;
         default:
            var3 = "normal";
      }

      int var4 = this.c8.a6();
      return var1.n5(this.u3(), var3, var2, var4);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      s7 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, s7.class);
      return var2 == null
         ? false
         : com.aspose.slides.internal.v3.u3.n5(this.u3, var2.u3)
            && com.aspose.slides.internal.v3.u3.n5(this.a6, var2.a6)
            && com.aspose.slides.internal.v3.u3.n5(this.n5, var2.n5)
            && com.aspose.slides.internal.v3.u3.n5(this.l6, var2.l6)
            && com.aspose.slides.internal.v3.u3.n5(this.u9, var2.u9)
            && com.aspose.slides.internal.v3.u3.n5(this.h0, var2.h0)
            && com.aspose.slides.internal.v3.u3.n5(this.c8, var2.c8)
            && com.aspose.slides.internal.v3.u3.n5(this.t2, var2.t2);
   }

   @Override
   public final int hashCode() {
      if (this.k5 == -1) {
         int var1 = 17;
         var1 = 37 * var1 + com.aspose.slides.internal.v3.u3.n5(this.n5);
         var1 = 37 * var1 + com.aspose.slides.internal.v3.u3.n5(this.l6);
         var1 = 37 * var1 + com.aspose.slides.internal.v3.u3.n5(this.u3);
         var1 = 37 * var1 + com.aspose.slides.internal.v3.u3.n5(this.a6);
         var1 = 37 * var1 + com.aspose.slides.internal.v3.u3.n5(this.u9);
         var1 = 37 * var1 + com.aspose.slides.internal.v3.u3.n5(this.h0);
         var1 = 37 * var1 + com.aspose.slides.internal.v3.u3.n5(this.c8);
         var1 = 37 * var1 + com.aspose.slides.internal.v3.u3.n5(this.t2);
         this.k5 = var1;
      }

      return this.k5;
   }
}
