package com.aspose.slides.internal.d2;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.a0.m1;
import com.aspose.slides.internal.p3.o5;
import com.aspose.slides.ms.System.d1;

public class z1 extends t9 implements m1 {
   private boolean e2 = false;
   private String t9;
   private String z1;
   private boolean t4;
   private com.aspose.slides.internal.v0.u3 q0;

   public z1(String var1, com.aspose.slides.internal.v0.u3 var2) {
      this(var1, var2, true);
   }

   public z1(String var1, com.aspose.slides.internal.v0.u3 var2, boolean var3) {
      this.t9 = var1;
      this.q0 = var2;
      this.z1 = "?";
      this.t4 = var3;
   }

   @Override
   public final String[] u3() {
      return new String[]{this.t9};
   }

   @Override
   public String a0() {
      return this.z1;
   }

   @Override
   public final void n5(String var1, List<o5> var2) {
      if (!this.e2 && d1.a6(this.t9, var1) && var2 != null) {
         this.e2 = true;
         int var3 = this.t4 ? 0 : var2.size() - 1;
         o5 var4 = (o5)var2.get_Item(var3);
         this.y1();
         this.z1 = var4.u9();
         this.n5(this.z1, 0, this.h0());
         if (this.q0 != null) {
            this.z1(this.q0.n5(this.z1) - this.l6());
            this.q0 = null;
         }
      }
   }

   @Override
   public final boolean k5() {
      return this.e2;
   }

   @Override
   public boolean n5(double var1, int var3, int var4) {
      return true;
   }

   @Override
   public List<com.aspose.slides.internal.d5.a6> l6(List<com.aspose.slides.internal.d5.a6> var1) {
      var1.addItem(new com.aspose.slides.internal.d5.a6(this, new int[]{this.h0()}));
      return var1;
   }
}
