package com.aspose.slides.internal.u1;

import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.g7.i2;
import com.aspose.slides.internal.g7.l0;
import com.aspose.slides.internal.g7.m3;
import com.aspose.slides.internal.g7.n2;
import com.aspose.slides.internal.g7.v0;

public class n3 extends t2 {
   public n3(com.aspose.slides.internal.v2.k5 var1) {
      super(var1);
      this.n5();
   }

   @Override
   public String k5(byte[] var1, int var2, int var3) {
      String var4 = this.h0(var1, var2, var3);
      return var4 == null ? null : var4;
   }

   private String h0(byte[] var1, int var2, int var3) {
      String var4 = null;
      a6 var5 = this.t4();
      if (var5.u9() == null) {
         var4 = this.u3(var1, var2, var3);
      }

      return var4;
   }

   private void n5() {
      byte[] var1 = this.j5();
      n2 var2 = new n2(2, new m3(var1));

      try {
         i2 var3 = i2.n5(var2);
         if (var3 == null || !com.aspose.slides.internal.v6g.k5.l6(var3, v0.class)) {
            ;
         }
      } catch (l0 var4) {
      }
   }

   private byte[] j5() {
      a6 var1 = this.t4();
      if (var1 != null && com.aspose.slides.internal.v6g.k5.l6(var1, u9.class)) {
         com.aspose.slides.internal.e7.s7 var2 = ((u9)var1).e2();
         if (var2 != null) {
            return var2.n5();
         }
      }

      throw new IOException();
   }
}
