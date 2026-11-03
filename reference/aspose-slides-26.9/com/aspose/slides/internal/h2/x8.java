package com.aspose.slides.internal.h2;

import com.aspose.slides.ms.System.d1;

public class x8 {
   private int c8 = 0;
   public x9 n5;
   public x9 l6;
   public x9 k5;
   public z8 u3;
   public u3 a6;
   public v4 u9;
   public v4 h0;

   private x8(x9 var1, x9 var2, x9 var3, z8 var4, u3 var5, v4 var6, v4 var7) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
      this.u9 = var6;
      this.h0 = var7;
   }

   public static x8 n5(com.aspose.slides.internal.e5.w1 var0) {
      x9 var1 = (x9)var0.u3(134);
      x9 var2 = (x9)var0.u3(81);
      x9 var3 = (x9)var0.u3(218);
      z8 var4 = (z8)var0.u3(116);
      u3 var5 = (u3)var0.u3(117);
      v4 var6 = (v4)var0.u3(120);
      v4 var7 = (v4)var0.u3(121);
      return new x8(var1, var2, var3, var4, var5, var6, var7);
   }

   public final char n5(com.aspose.slides.internal.v0.u3 var1) {
      char var2 = this.a6.h_();
      if (var1.n5(var2)) {
         return var2;
      }

      boolean var4 = false;
      char var3;
      if (var1.n5('-')) {
         var3 = '-';
         var4 = true;
      } else if (var1.n5('−')) {
         var3 = 8722;
         com.aspose.slides.internal.v0.t9 var5 = var1.u3();
         com.aspose.slides.internal.v0.t4 var6 = com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.v0.t4.class);
         if (var5 != null && !d1.a6(var6.n5(), "SymbolEncoding")) {
            var4 = true;
         }
      } else {
         var3 = ' ';
         com.aspose.slides.internal.v0.t9 var10 = var1.u3();
         if (com.aspose.slides.internal.v6g.k5.l6(var10, com.aspose.slides.internal.v0.t4.class)) {
            com.aspose.slides.internal.v0.t4 var11 = (com.aspose.slides.internal.v0.t4)var10;
            if (!d1.a6(var11.n5(), "ZapfDingbatsEncoding")) {
               var4 = true;
            }
         }
      }

      return var3;
   }

   public final int l6(com.aspose.slides.internal.v0.u3 var1) {
      char var2 = this.n5(var1);
      return var1.l6(var2);
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == this) {
         return true;
      }

      x8 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, x8.class);
      return var2 == null
         ? false
         : var2.n5 == this.n5
            && var2.l6 == this.l6
            && var2.k5 == this.k5
            && var2.u3 == this.u3
            && var2.a6 == this.a6
            && var2.u9 == this.u9
            && var2.h0 == this.h0;
   }

   @Override
   public int hashCode() {
      if (this.c8 == 0) {
         int var1 = 17;
         var1 = 37 * var1 + (this.n5 == null ? 0 : this.n5.hashCode());
         var1 = 37 * var1 + (this.k5 == null ? 0 : this.k5.hashCode());
         var1 = 37 * var1 + (this.l6 == null ? 0 : this.l6.hashCode());
         var1 = 37 * var1 + (this.u3 == null ? 0 : this.u3.hashCode());
         var1 = 37 * var1 + (this.a6 == null ? 0 : this.a6.hashCode());
         var1 = 37 * var1 + (this.u9 == null ? 0 : this.u9.hashCode());
         var1 = 37 * var1 + (this.h0 == null ? 0 : this.h0.hashCode());
         this.c8 = var1;
      }

      return this.c8;
   }
}
