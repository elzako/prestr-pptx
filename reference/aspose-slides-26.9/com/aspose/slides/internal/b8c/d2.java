package com.aspose.slides.internal.b8c;

public class d2 extends a0 {
   private static final com.aspose.slides.ms.System.y8 e2 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.r8.class);
   private static final com.aspose.slides.ms.System.y8 t9 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.r8[].class);

   @Override
   public e3m l6(j9e var1) {
      return e4.n5(var1);
   }

   @Override
   public c2 h0() {
      return k5;
   }

   @Override
   public int n3() {
      return 28;
   }

   @Override
   public com.aspose.slides.ms.System.y8 s7() {
      return e2;
   }

   @Override
   public boolean t9() {
      return true;
   }

   @Override
   public com.aspose.slides.ms.System.y8 t4() {
      return t9;
   }

   @Override
   public int z3() {
      return 2;
   }

   @Override
   public int q0() {
      return 63;
   }

   @Override
   public int l6(Object var1, Object var2) {
      return ((com.aspose.slides.ms.System.r8)var1).equals((com.aspose.slides.ms.System.r8)var2) ? 0 : -1;
   }

   @Override
   public RuntimeException n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3, Object[] var4) {
      var4[0] = null;
      String[] var5 = new String[]{var1};
      RuntimeException var6 = k5.n5(var5, this);
      var1 = var5[0];
      if (var6 != null) {
         return var6;
      }

      com.aspose.slides.ms.System.r8 var7 = null;
      com.aspose.slides.ms.System.r8[] var8 = new com.aspose.slides.ms.System.r8[]{var7};
      var6 = com.aspose.slides.ms.System.Xml.f4.n5(var1, var8);
      var7 = var8[0];
      if (var6 != null) {
         return var6;
      }

      String var9 = var7.m1();
      var6 = ((s2)k5).n5(var9, this, false);
      if (var6 != null) {
         return var6;
      }

      var4[0] = var7;
      return null;
   }
}
