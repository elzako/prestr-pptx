package com.aspose.slides.internal.b8c;

public class i6 extends c3 {
   private static final com.aspose.slides.ms.System.y8 e2 = com.aspose.slides.internal.v6g.k5.n5(int.class);
   private static final com.aspose.slides.ms.System.y8 t9 = com.aspose.slides.internal.v6g.k5.n5(int[].class);
   private static final c2 z1 = new d6(com.aspose.slides.internal.v6g.k5.s7(0, 8).l6(), com.aspose.slides.internal.v6g.k5.s7(65535, 8).l6());

   @Override
   public c2 h0() {
      return z1;
   }

   @Override
   public int n3() {
      return 50;
   }

   @Override
   public int l6(Object var1, Object var2) {
      return com.aspose.slides.ms.System.c3.n5(com.aspose.slides.internal.v6g.k5.u3(var1, int.class), var2);
   }

   @Override
   public com.aspose.slides.ms.System.y8 s7() {
      return e2;
   }

   @Override
   public com.aspose.slides.ms.System.y8 t4() {
      return t9;
   }

   @Override
   public RuntimeException n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3, Object[] var4) {
      var4[0] = null;
      String[] var5 = new String[]{var1};
      RuntimeException var6 = z1.n5(var5, this);
      var1 = var5[0];
      if (var6 != null) {
         return var6;
      }

      int var7 = 0;
      int[] var8 = new int[]{0};
      var6 = com.aspose.slides.ms.System.Xml.f4.l6(var1, var8);
      var7 = var8[0];
      if (var6 != null) {
         return var6;
      }

      var6 = z1.n5(var7 & 65535, this);
      if (var6 != null) {
         return var6;
      }

      var4[0] = var7;
      return null;
   }
}
