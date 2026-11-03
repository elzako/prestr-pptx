package com.aspose.slides.internal.h2;

public class z8 extends a5 {
   private int n5;
   private String l6;

   private z8(int var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public static z8 n5(int var0, String var1) {
      return new z8(var0, var1);
   }

   @Override
   public int a6() {
      return this.n5;
   }

   @Override
   public Object g_() {
      return this.l6;
   }

   @Override
   public boolean equals(Object obj) {
      z8 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, z8.class);
      return var2 == null ? false : this.n5 == var2.n5 && com.aspose.slides.internal.v3.u3.n5(this.l6, var2.l6);
   }

   @Override
   public int hashCode() {
      return this.n5 + this.l6.hashCode();
   }
}
