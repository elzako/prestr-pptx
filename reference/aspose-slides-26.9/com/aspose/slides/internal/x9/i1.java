package com.aspose.slides.internal.x9;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class i1 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private com.aspose.slides.internal.v8.n3 a6;
   private int u9;
   private int h0;
   private int c8;

   public i1(int var1, int var2, int var3, int var4, com.aspose.slides.internal.v8.n3 var5) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
      this.u9 = this.k5(this.u3);
      this.h0 = var1 - this.u9;
      this.c8 = var2 - this.u9;
   }

   public final int n5() {
      return this.u3;
   }

   public final com.aspose.slides.internal.v8.n3 l6() {
      return this.a6;
   }

   public final int n5(int var1) {
      int var2 = 0;
      if (!this.k5()) {
         switch (var1) {
            case 20:
            case 143:
            case 144:
            case 145:
               throw new ArgumentException(d1.n5(new String[]{"Baseline ", a3.l6(var1), " only supported for horizontal writing modes"}));
         }
      }

      switch (var1) {
         case 4:
         case 20:
            var2 = this.c8;
            break;
         case 6:
         case 24:
         case 56:
         case 59:
         case 82:
         case 84:
         case 141:
         case 142:
         case 143:
         case 144:
            var2 = this.k5(var1) - this.u9;
            break;
         case 14:
         case 145:
            var2 = this.h0;
            break;
         default:
            throw new ArgumentException(a3.l6(var1));
      }

      return var2;
   }

   private boolean k5() {
      return this.a6.k5();
   }

   private int k5(int var1) {
      int var2 = 0;
      switch (var1) {
         case 6:
            var2 = 0;
            break;
         case 24:
            var2 = (this.n5 - this.l6) / 2 + this.l6;
            break;
         case 56:
            var2 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(this.n5 * 0.8F), 14);
            break;
         case 59:
         case 141:
            var2 = this.l6;
            break;
         case 82:
            var2 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(this.n5 * 0.5F), 14);
            break;
         case 84:
            var2 = this.k5 / 2;
            break;
         case 142:
            var2 = this.n5;
            break;
         default:
            throw new ArgumentException(a3.l6(var1));
      }

      return var2;
   }

   public final void n5(int var1, int var2) {
      this.h0 = var1;
      this.c8 = var2;
   }

   public final i1 l6(int var1) {
      return new i1(this.n5, this.l6, this.k5, var1, this.a6);
   }
}
