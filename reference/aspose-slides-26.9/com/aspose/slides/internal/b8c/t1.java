package com.aspose.slides.internal.b8c;

public class t1 extends a0 {
   private static final com.aspose.slides.ms.System.y8 e2 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.c4.class);
   private static final com.aspose.slides.ms.System.y8 t9 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.c4[].class);
   private static final c2 z1 = new d6(com.aspose.slides.ms.System.c4.n5.l6(), com.aspose.slides.ms.System.c4.l6.l6());

   @Override
   public e3m l6(j9e var1) {
      return g6.n5(var1);
   }

   @Override
   public c2 h0() {
      return z1;
   }

   @Override
   public int n3() {
      return 14;
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
   public int z3() {
      return 2;
   }

   @Override
   public int q0() {
      return 4088;
   }

   @Override
   public int l6(Object var1, Object var2) {
      return this.n5(
         com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.c4.class),
         com.aspose.slides.internal.v6g.k5.u3(var2, com.aspose.slides.ms.System.c4.class)
      );
   }

   public int n5(com.aspose.slides.ms.System.c4 var1, com.aspose.slides.ms.System.c4 var2) {
      return var1.s7(var2);
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

      com.aspose.slides.ms.System.c4 var7 = new com.aspose.slides.ms.System.c4();
      com.aspose.slides.ms.System.c4[] var8 = new com.aspose.slides.ms.System.c4[]{var7};
      var6 = com.aspose.slides.ms.System.Xml.f4.n5(var1, var8);
      var7 = var8[0];
      if (var6 != null) {
         return var6;
      }

      var6 = z1.n5(var7.l6(), this);
      if (var6 != null) {
         return var6;
      }

      var7.k7((com.aspose.slides.ms.System.c4)var4[0]);
      return null;
   }
}
