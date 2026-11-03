package com.aspose.slides.internal.b8c;

public class y8 extends i6 {
   private static final com.aspose.slides.ms.System.y8 e2 = com.aspose.slides.internal.v6g.k5.n5(byte.class);
   private static final com.aspose.slides.ms.System.y8 t9 = com.aspose.slides.internal.v6g.k5.n5(byte[].class);
   private static final c2 z1 = new d6(com.aspose.slides.ms.System.c4.n5(0), com.aspose.slides.ms.System.c4.n5(255));

   @Override
   public c2 h0() {
      return z1;
   }

   @Override
   public int n3() {
      return 51;
   }

   @Override
   public int l6(Object var1, Object var2) {
      return com.aspose.slides.ms.System.e2.n5(com.aspose.slides.internal.v6g.k5.u3(var1, byte.class), var2);
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

      byte var7 = 0;
      byte[] var8 = new byte[]{0};
      var6 = com.aspose.slides.ms.System.Xml.f4.l6(var1, var8);
      var7 = var8[0];
      if (var6 != null) {
         return var6;
      }

      var6 = z1.n5((short)(var7 & 0xFF), this);
      if (var6 != null) {
         return var6;
      }

      var4[0] = var7;
      return null;
   }
}
