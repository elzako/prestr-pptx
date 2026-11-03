package com.aspose.slides.internal.v4;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.h2.a5;

public class u9 extends t9 {
   private a5 c8;
   private a5 t2;
   private int s7;
   private int x8;

   public u9(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.c8 = var1.u3(141);
      this.t2 = var1.u3(265);
      this.s7 = var1.u3(86).a6();
      this.x8 = var1.u3(255).a6();
   }

   public final int e5() {
      return this.s7;
   }

   public final int b3() {
      return this.x8;
   }

   @Override
   public String z1() {
      return "bidi-override";
   }

   @Override
   public int z3() {
      return 2;
   }

   @Override
   protected Stack<com.aspose.slides.internal.d5.u3> n5(Stack<com.aspose.slides.internal.d5.u3> var1, com.aspose.slides.internal.d5.u3 var2) {
      char var3 = 0;
      char var4 = 0;
      int var5 = this.b3();
      int var6 = this.e5();
      if (var5 == 15) {
         var3 = (char)(var6 == 122 ? 8238 : 8237);
         var4 = 8236;
      } else if (var5 == 38) {
         var3 = (char)(var6 == 122 ? 8235 : 8234);
         var4 = 8236;
      }

      if (var2 != null) {
         if (var3 != 0) {
            var2.n5(var3, this);
         }

         com.aspose.slides.internal.e5.t2$n5 var7 = this.x8();

         while (var7 != null && var7.l6()) {
            var1 = var7.k5().n5(var1);
         }

         if (var4 != 0) {
            var2.n5(var4, this);
         }
      }

      return var1;
   }
}
