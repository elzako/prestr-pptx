package com.aspose.slides.internal.c0;

import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.z0k.t4;

public class c8 extends h0 {
   public c8(com.aspose.slides.internal.z4.c8 var1, int var2, i1 var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5);
      this.n5(new k5(var1, this));
      this.n5('ÿ');
      this.n5(new boolean[256]);
   }

   @Override
   public String j5() {
      return "/TrueType";
   }

   @Override
   public byte[] n5() {
      return new byte[]{-1};
   }

   @Override
   public void n5(t4 var1) {
      if (this.a0() || !this.m1()) {
         this.u3.n5(var1, true, false);
      }

      super.n5(var1);
   }

   private boolean a0() {
      return this.l6.e2();
   }

   @Override
   public void n5(String var1) {
      if (this.a0() || !this.m1()) {
         for (int var2 = 0; var2 < var1.length(); var2++) {
            char var3 = var1.charAt(var2);
            this.u3.n5(var3);
         }
      }

      super.n5(var1);
   }
}
