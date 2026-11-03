package com.aspose.slides.internal.f5;

import com.aspose.slides.ms.System.d1;

public class a0 extends r4 implements com.aspose.slides.internal.j3.r4 {
   private String n5;
   private String l6;

   public a0(String var1, String var2, z1 var3) {
      super(var3);
      this.l6 = var1;
      this.n5 = var2;
   }

   public final String n5() {
      return this.l6;
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   @Override
   public String h0() {
      return this.l6 != null ? this.l6 : d1.n5;
   }

   @Override
   public String t2() {
      return this.h0();
   }

   @Override
   public byte n3() {
      return 7;
   }

   @Override
   public com.aspose.slides.internal.j3.z8 l6(boolean var1) {
      return this.y4().n5(this.l6, this.n5);
   }
}
